
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);
        linkedList.get(1);
        linkedList.deleteAtIndex(1);
        linkedList.get(1);
        System.out.println( "Bye World!" );
    }
}
