package sample;
import java.lang.*;
//Push =  insert, Pop = delete, peek = read ahead without removing data
public class theStack {
//Stack object
    private Node head;
    private Node tail;
    private int size;
    private theStack stack;
//Create stack
    public theStack(){
        head = null;
        tail = null;
        size = 0;
    }
    //Stack Peek
    public double peek() {
        if(size == 0) {
            return 0;
        } else {
            return tail.data;
        }
    }

// Push numbers into stack
    public Double push(double data) {
        Node node = new Node(data);
        if (size == 0) {
            tail = node;
        } else {
            tail.setNext(node);
            node.previous = tail;
            tail = node;
        }
        size++;
        return tail.data;
    }
// return tail
    public Node getTail(){
        return tail;
    }
//size of stack
    public int getSize(String s) {
        return size;
    }
// Pop top item in stack
    public double pop() {
        double popping;
        if(size == 0){
            return 0;
        } else if(size == 1){
            popping = tail.data;
            tail = null;
        } else {
            popping = tail.data;
            tail = tail.previous;
            tail.next.previous = null;
            tail.next = null;
        }
        size--;
        return popping;
    }
    //Clear stack
    public void clear() {
        tail = null;
        head = null;
        size = 0;
        }
    }