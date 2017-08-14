/**
 * Created by 1237jwells on 7/31/2017.
 */
public class Node {

    public static int NumberofNodes = 0;
    public Object data;
    public Node previous;
    public Node next;

        public Node(Object data){
            this.data = data;
            previous = null;
            next = null;
//            this.previous = previous;
//            this.next = next;
        }

        public String toString(){
            return data + "";
        }
}
