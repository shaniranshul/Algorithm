import java.util.HashSet;

public class IdentifyIntersection {
    public ListNode bruteForceApproach(ListNode headA, ListNode headB) {
        while(headA!=null){
            ListNode pB=headB;
            while(pB!=null){
                if(headA==pB) return headA;
                pB=pB.next;
            }
            headA=headA.next;
        }
        return null;
    }

    // Time complexity : O(N + M).
    //Space complexity : O(M)O(M).
    public ListNode HashTableApproach(ListNode headA, ListNode headB) {
        HashSet<ListNode> ht=new HashSet<ListNode>();

        while(headA!=null){
            ht.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(ht.contains(headB)) return headB;
            headB=headB.next;
        }
        return null;
    }

    public ListNode twoPointerApproach(ListNode headA, ListNode headB) {
        while(headA!=null){
            ListNode pB=headB;
            while(pB!=null){
                if(headA==pB) return headA;
                pB=pB.next;
            }
            headA=headA.next;
        }
        return null;
    }
}
