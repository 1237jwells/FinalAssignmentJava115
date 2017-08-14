package com.company;

import java.lang.Integer;
import java.util.Stack;

import static javafx.scene.input.KeyCode.X;

public class theStack< I extends Number> {

    //Push =  insert, Pop = delete, peek = read ahead without removing data
    //private Stack stack = new Stack();

    //    private ArrayDeque<Integer> stack =new ArrayDeque<>();
//    private ArrayDeque<Integer> stack2 = new ArrayDeque<>();
    Stack<Integer> stack = new Stack<>();

    public void peek(){ stack.peek();}

    public void push(int number) {
        stack.push((int) number);
    }
    public void pop(int  number)
    { stack.pop();}

    public void store(int number) {
        stack.push((int) number);}

    public void clear() { stack.clear(); }

    void printStack(Integer O) {
        System.out.print("[");
        for (Integer I : stack) {
            System.out.print(I + " ");
        }
        System.out.println("]");
    }


    public int addition() throws ArithmeticException {
        if (stack.size() >= 2) {
            Integer Y = (Integer) stack.pop();
            Integer X = (Integer) stack.pop();
            Integer result = X + Y;


            stack.push(result);

            return result;
        } else {
//            clear();
            throw new ArithmeticException("No Variable in Stack");
        }
    }

    public int subtraction() throws ArithmeticException {
        System.out.println(stack.size());
        if (stack.size() >= 2) {
            Integer X = (Integer) stack.pop();
            Integer Y = (Integer) stack.pop();

            int result = Y - X;

            stack.push(result);
            return result;
        } else if (stack.size() == 1) {
            Integer X = (Integer) stack.pop();

            int result = -X;

            stack.push(result);
            return result;
        } else {
            throw new ArithmeticException("No Element in Stack");
        }
    }

    public int multiplication() throws ArithmeticException {
        if (stack.size() >= 2) {
            Integer X = (Integer) stack.pop();
            Integer Y = (Integer) stack.pop();

            int result = Y * X;

            stack.push(result);

            return result;
        } else {
//            clear();
            throw new ArithmeticException("No Element in Stack");
        }
    }

    public int division() throws ArithmeticException {
        if (stack.size() >= 2) {
            Integer X = (Integer) stack.pop();
            Integer Y = (Integer) stack.pop();

            int result = Y / X;

            stack.push(result);

            return result;
        } else {
            //clear();
            throw new ArithmeticException("No Element in Stack");
        }
    }


}
