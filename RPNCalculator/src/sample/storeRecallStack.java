package sample;
//Stack for Storing Values
public class storeRecallStack {
    //Stack object
    private Node tail;
    private int size;
    //Create stack
    public storeRecallStack(){
        tail = null;
        size = 0;
    }
    // Push numbers into stackStore
    public Double pushStore(double data) {
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
    public int getSizeStore(String s) {
        return size;
    }
    // Pop top item in stackStore
    public double popStore() {
        double poppingStore;
        if(size == 0){
            return 0;
        } else if(size == 1){
            poppingStore = tail.data;
            tail = null;
        } else {
            poppingStore = tail.data;
            tail = tail.previous;
            tail.next.previous = null;
            tail.next = null;
        }
        size--;
        return poppingStore;
    }
}