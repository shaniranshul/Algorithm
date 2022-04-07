
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Data Structure !" );
        linkListOperation();
        linkListCycle();
        removeNthFromEnd();
        reverseLinkedList();
        isPalindrome();
        System.out.println( "Bye Data Structure !" );
    }
    public static void linkListOperation()
    {
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.addAtHead(7);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);
        //linkedList.addAtTail(4);
        linkedList.addAtIndex(3,0);
        linkedList.get(1);
        linkedList.deleteAtIndex(1);
        linkedList.get(1);
        linkedList.addAtIndex(0,7);
        linkedList.addAtHead(6);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(0,9);
    }
    public static void linkListCycle()
    {
        /*
        Creating a Linked List of eight nodes
        having a loop at (node 3)

        HEAD-->1-->2-->3-->4-->5
                       ^       |
                       |       v
                       8<--7<--6

        */
        // creating 8 independent nodes
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        ListNode nodeThree = new ListNode(3);
        ListNode nodeFour = new ListNode(4);
        ListNode nodeFive = new ListNode(5);
        ListNode nodeSix = new ListNode(6);
        ListNode nodeSeven = new ListNode(7);
        ListNode nodeEight = new ListNode(8);

        //Head node pointing to first node of linked list
        ListNode nodeHead = nodeOne;

        // creating a dependency in nodes by linking node to one another
        nodeOne.next = nodeTwo;
        nodeTwo.next = nodeThree;
        nodeThree.next = nodeFour;
        nodeFour.next = nodeFive;
        nodeFive.next = nodeSix;
        nodeSix.next = nodeSeven;
        nodeSeven.next = nodeEight;
        nodeEight.next = nodeThree; // this line creates the loop

        //calling method to evaluate
        Cyclic2 c=new Cyclic2();
        ListNode result=c.detectCycle(nodeHead);
        System.out.println("Start of loop is "+ result.val);

    }
    public static void removeNthFromEnd()
    {
        RemoveNthNode remove=new RemoveNthNode();
        ListNode nodeOne = new ListNode(1);
        remove.removeNthFromEnd(nodeOne,1);
        remove.removeNthFromEnd(null,1);
    }
    public static void reverseLinkedList() {
        ReverseLinkedList reverse= new ReverseLinkedList();
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        ListNode nodeThree = new ListNode(3);
        ListNode nodeFour = new ListNode(4);
        // creating a dependency in nodes by linking node to one another
        nodeOne.next = nodeTwo;
        nodeTwo.next = nodeThree;
        nodeThree.next = nodeFour;

        reverse.reverseByIterative(nodeOne);
        reverse.reverseByRecursive(nodeOne);
    }
    public static void isPalindrome() {
        PalindromeLinkedList palindrome= new PalindromeLinkedList();
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);

        // creating a dependency in nodes by linking node to one another
        nodeOne.next = nodeTwo;
        palindrome.isPalindrome(nodeOne);

    }
}
