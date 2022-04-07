public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;

        ListNode dummy =new ListNode(0);
        dummy.next=head;

        ListNode ptr1=dummy;
        ListNode ptr2=head;

        while (ptr2!=null){
            if(ptr2.val==val)ptr1.next=ptr2.next;
            else ptr1=ptr2;
            ptr2=ptr2.next;
        }
        return dummy.next;
    }
}
