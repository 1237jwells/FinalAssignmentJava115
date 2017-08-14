package sample;
import java.lang.*;
import java.lang.Double;
import java.util.Stack;
//Push =  insert, Pop = delete, peek = read ahead without removing data
public class theStack {

    private Stack stack;

    public theStack() { this.stack = new Stack<Double>(); }

    public double peek() {
        return Double.parseDouble((String) stack.peek().toString());
        //return peek(); //if you run this method, you will go into an infinite loop. yaaaay. hahaha instead of return peek();, you should put return stack.peek();
    }

    public Double push(String number) {
        Double result = Double.parseDouble(number);
        stack.push(result);
        return result;// is result still number1? here so we basically just need Number1 haha. this push method is correct, from what I can see.
    }

    public int getSize() {
        return stack.size();
    }

    public double pop() {
        return Double.parseDouble((String)stack.pop().toString());
    }

    public void store(String number) {
        stack.push(number);}

    public void clear() {
       if (stack.isEmpty()) {
           System.out.println("HOW MANY TIMES");

       } else{stack.clear();
           System.out.println("how many times");
        }

    }
}
