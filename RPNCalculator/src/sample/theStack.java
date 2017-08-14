package sample;
import java.lang.*;
import java.lang.Double;
import java.util.Stack;
//Push =  insert, Pop = delete, peek = read ahead without removing data
public class theStack {
    private Stack stack;
    public theStack() { this.stack = new Stack<Double>(); }

    public double peek() { //this method works now
        return Double.parseDouble((String) stack.peek().toString()); //holy nuts, thats long.
        //return peek(); //if you run this method, you will go into an infinite loop. yaaaay. hahaha instead of return peek();, you should put return stack.peek();
    }

    //pushes any number to stack and converts to Double result2
    public double push(String number) {
//        System.out.println(number2);
        double result = Double.parseDouble(number);
        stack.push(result);
//        System.out.println(result2);
        return result;// is result still number1? here so we basically just need Number1 haha. this push method is correct, from what I can see.
    }

    public int getSize() {
        return stack.size();
    }
    //--->Functions not used at moment
    public double pop() {
        return Double.parseDouble((String)stack.pop().toString());
    }

    public void store(String number) {
        stack.push(number);}

    public void clear() { stack.clear(); }
    //<---Functions not used at moment

//    public Double addition(Double X, Double Y) throws ArithmeticException {
//        if (stack.size() >= 2) {
//            Y = (Double) stack.pop();
//            X = (Double) stack.pop();
//            Double result = X + Y;
//            stack.push(result);
//            return result;
//        } else {
//            throw new ArithmeticException("No Variable in Stack");
//        }
//    }
//    public Double subtraction() throws ArithmeticException {
//        System.out.println(stack.size());
//        if (stack.size() >= 2) {
//            Double X = (Double) stack.pop();
//            Double Y = (Double) stack.pop();
//            Double result = Y - X;
//            stack.push(result);
//            return result;
//        } else if (stack.size() == 1) {
//            Double X = (Double) stack.pop();
//            Double result = -X;
//            stack.push(result);
//            return result;
//        } else {
//            throw new ArithmeticException("No Element in Stack");
//        }
//    }
//    public Double multiplication() throws ArithmeticException {
//        if (stack.size() >= 2) {
//            Double X = (Double) stack.pop();
//            Double Y = (Double) stack.pop();
//            double result = Y * X;
//            stack.push(result);
//            return result;
//        } else {
//            throw new ArithmeticException("No Element in Stack");
//        }
//    }
//    public Double division() throws ArithmeticException {
//        if (stack.size() >= 2) {
//            Double X = (Double) stack.pop();
//            Double Y = (Double) stack.pop();
//
//            Double result = Y / X;
//
//            stack.push(result);
//
//            return result;
//        } else {
//            //clear();
//            throw new ArithmeticException("No Element in Stack");
//        }
//    }
}
