public class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode curr=head;
        for(int i = 0; i<index; ++i)
        {
            curr=curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode firstNode=new ListNode(val);
        firstNode.next=head.next;
        head=firstNode;
        size++;
    }

    public void addAtTail(int val) {
        ListNode lastNode=new ListNode(val);
        //lastNode.next=null;
        head.next=lastNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) index = 0;
        for(int i=0;i<index+1;i++)
        {
            if (index-1==i)
            {
                ListNode newNode=new ListNode(val);

                newNode.next=head.next.next;
                head.next=newNode;
                size++;
                break;
            }
            if (head !=null){head=head.next;}
        }
    }

    public void deleteAtIndex(int index) {

        for(int i=0;i<index;i++)
        {
            if (i==index-1)
            {
                head.next=head.next.next;
                size--;
                break;
            }
            if (head !=null){head=head.next;}
        }
    }


}