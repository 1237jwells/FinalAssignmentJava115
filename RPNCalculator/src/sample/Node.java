package sample;
//Create node for our Stack
public class Node {
    public double data;
    public Node next;
    public Node previous;
//Create a previous and next
public Node(double data){
    this.data = data;
    previous = null;
    next = null;
}
//Set previous and next
public void setNext(Node node){
    next = node;
    previous = node;
}
}
