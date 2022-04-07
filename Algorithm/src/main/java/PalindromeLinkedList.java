public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return false;

        ListNode prev=null;
        ListNode curr=head;
        ListNode operative=null;
        StringBuilder forward=new StringBuilder("");
        StringBuilder backward=new StringBuilder("");

        while(curr!=null){
            forward.append(curr.val);
            operative=curr.next;
            curr.next=prev;
            prev=curr;
            curr=operative;
            backward.append(prev.val);
        }
        if(forward.toString().equals(backward.toString()))return true;
        else return false;

    }
}
