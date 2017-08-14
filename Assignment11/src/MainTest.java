import org.junit.Test;

/**
 * Created by 1237jwells on 8/2/2017.
 */
public class MainTest {
    @Test
    public void main() throws Exception {
//        CourseOffering CO = new CourseOffering();
        DoublyLinkedList<C> DLL = new DoublyLinkedList<C>();
        Node node = DLL.addToStart(3);
        DLL.print();
        DLL.insertBeginning(3);
        DLL.print();
        DLL.insertEnd(4,node);
        DLL.print();
        DLL.deleteFromBeginning();
        DLL.print();
        System.out.println("Element at index 2: "+DLL.FindNode(2));
        DLL.print();
        DLL.deleteFromEnd();
        DLL.print();
        System.out.println("Size of the Linked List: " + DLL.getSize());
    }
}
