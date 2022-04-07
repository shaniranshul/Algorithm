public class Cyclic2 {
    public ListNode getInterection(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return slow;
            }
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;

        ListNode intersection=getInterection(head);
        if (intersection==null) return null;
        ListNode ptr1 = head;
        ListNode ptr2 = intersection;
        while(ptr1!=ptr2)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return ptr1;
    }
}
