public class ReverseLinkedList {
    public ListNode reverseByIterative(ListNode head) {
        //if list null or contain single list item
        if(head==null||head.next==null) return head;

        ListNode prev=null;
        ListNode curr=head;
        ListNode operative=null;

        while(curr!=null){
            operative=curr.next;
            curr.next=prev;
            prev=curr;
            curr=operative;
        }
        return prev;

    }
    public ListNode reverseByRecursive(ListNode head) {
        //if list null or contain single list item
        if(head==null||head.next==null) return head;

        ListNode operative = reverseByRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return operative;

    }
}
