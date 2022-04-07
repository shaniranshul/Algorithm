public class Cyclic3 {
    public int lengthCycle(ListNode head) { //length of cycle
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }
                while (temp!=slow);
                return length;

            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) { //length of cycle
        ListNode fast=head;
        ListNode slow=head;
        int length=0;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=0;
                length=lengthCycle(slow);
                break;
            }
        }

        if(length==0)
        {
            return null;
        }
        //find start NodeM
        ListNode f=head;
        ListNode s=head;

        while (length>0){
            s=s.next;
            length--;
        }
        while(f!=s)
        {
            s=s.next;
            f=f.next;

        }
        return  s;
    }
}
