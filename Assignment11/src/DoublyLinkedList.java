/**
 * Created by 1237jwells on 8/1/2017.
 */
public class DoublyLinkedList {

    int size = 0;
    Node head = null;
    Node tail = null;
//    public Node findNode(Object data){
//        System.out.println("Found " + data + " Inside Doubly Linked List");
//

    public Node addToStart(Object data) {
        System.out.println("Add Node " + data + " to the start");
        // create a new node
        Node node = new Node(data);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }
        size++;
        return node;
    }

    public Node insertBeginning(Object data) {
        System.out.println("Add Node " + data + " to the End");
        // create a new node
        Node node = new Node(data);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
         return node;
    }

    public Node insertEnd(Object data, Node previousNode) {
        if (previousNode == null) {
            System.out.println("Node after which new node to be added cannot be null");
            return null;
        } else if (previousNode == tail) {//check if it a last node
            return insertBeginning(data);
        } else {
            System.out.println("Add node after " + previousNode.data);
            //create a new node
            Node node = new Node(data);

            //store the next node of previousNode
            Node nextNode = previousNode.next;

            //make new node next points to previousNode
            node.next = nextNode;

            //make previousNode next points to new Node
            previousNode.next = node;

            //make nextNode previous points to new node
            nextNode.previous = node;

            //make new Node previous points to previousNode
            node.previous = previousNode;

            size++;
            return node;
        }
    }

    public void deleteFromBeginning() {
        if (size == 0) {
            System.out.println("\nList is Empty");
        } else {
            System.out.println("\ndelete node " + head.data + " from start");
            head = head.next;
            size--;
        }
    }

    public void deleteFromEnd() {
        if (size == 0) {
            System.out.println("\nList is Empty");
        } else if (size == 1) {
            deleteFromBeginning();
        } else {
            //store the 2nd last node
            Object Obj = tail.data;
            Node prevTail = tail.previous;

            //detach the last node
            tail = prevTail;
            tail.next = null;
            System.out.println("\ndelete node " + Obj + " from end");
            size--;
        }
    }
    public Object FindNode(int index) {
        if (index > size) {
            return -1;
        }
        Node node = head;
        while (index - 1 != 0) {
            node = node.next;
            index--;
        }
        return node.data;
    }

    //get Size
    public int getSize() {
        return size;
    }

    public void print() {
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp  != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}