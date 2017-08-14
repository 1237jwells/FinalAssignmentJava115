/**
 * Created by 1237jwells on 8/1/2017.
 */
public class Main {


    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList();
        Node node = DLL.addToStart(8);
        DLL.print();
        DLL.insertBeginning(3);
        DLL.print();
        DLL.insertEnd(4,node);
        DLL.print();
        DLL.deleteFromBeginning();
        DLL.print();
        System.out.println("Find node at index 2: "+DLL.FindNode(2));
        DLL.addToStart(1);
        DLL.print();
        DLL.deleteFromEnd();
        DLL.print();
        System.out.println("Size of the Linked List: " + DLL.getSize());
    }
}
