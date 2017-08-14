//import java.util.LinkedList;
//import java.util.ListIterator;
//
///**
// * Created by 1237jwells on 7/31/2017.
// */
//public class LinkListed {
//    private Node head;
//    private Node tail;
//    private Node current;
//    private int size = 0;
//
//    public void findNode(){
//
//        Node node = new Node(data);
//
//        if(root==null){
//
//            root = node;
//            root.previousNode = null;
//            root.nextNode = null;
//
//        }else{
//
//            current = root;
//
//            while(current.nextNode!=null){
//
//                current = current.nextNode;
//
//            }
//
//            current.nextNode = Node;
//            Node.previousNode = current;
//            Node.nextNode= null;
//        }
//    }
//
//    public void insertNode(int data, int after){
//
//        Node node = new Node(data);
//
//        int ithnode = 1;
//
//        current = root;
//
//        while (ithNode != after) {
//
//            current.nextNode = root;
//            ithNode++;
//
//        }
//        temp = current.nextNode;
//
//        current.nextNode = node;
//        node.nextNode = temp;
//        temp.previousNode = node;
//        node.previousNode =  current;
//
//    }
//
//    public void deleteNode(int node){
//
//
//
//
//    }
//
//    public static void main(String[] args) {
//
//        LinkedList states = new LinkedList();
//        states.add("Arizona");
//        states.add("Arkansas");
//        states.add("California");
//        states.add("Colorado");
//        states.add("Connecticut");
//
//        states.addFirst("Alabama");
//        System.out.println(states);
//        System.out.println("Last state in my list: "+states.getLast());
//
//        ListIterator iterator = states.listIterator(states.size());
//        while(iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }
//    }
//}
