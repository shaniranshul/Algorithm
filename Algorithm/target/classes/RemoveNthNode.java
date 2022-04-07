public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null) return head;
        if (n<0)return head;

        ListNode dummy =new ListNode(0);
        dummy.next=head;

        ListNode ptr1=dummy;
        ListNode ptr2=dummy;



        for (int i=1;i<=n+1;i++){
            ptr2=ptr2.next;
        }

        while(ptr2!=null)
        {
            ptr2=ptr2.next;
            ptr1=ptr1.next;
        }

        ptr1.next=ptr1.next.next;
        return dummy.next;
    }
}
