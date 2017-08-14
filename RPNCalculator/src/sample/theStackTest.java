package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class theStackTest {
    @Test
    public void peek1() throws Exception {
        theStack stack = new theStack();
        for (int i = 0; i < 8; i++) {
            stack.push(String.valueOf(i));
        }
        System.out.println(stack.peek()); //result should be 7
    }

    @Test
    public void push() throws Exception {
        theStack stack = new theStack();
        for (int i = 0; i < 8; i++) {
            stack.push(String.valueOf(i));
            System.out.println(stack.getSize());
        }
        System.out.println(stack.push(String.valueOf(3)));//result should be 7
    }

    @Test
    public void getSize() throws Exception {
        theStack stack = new theStack();
        for (int i = 0; i < 8; i++) {
            stack.push(String.valueOf(i));
            System.out.println(stack.getSize());
        }
    }

    @Test
    public void pop() throws Exception {
        theStack stack = new theStack();
        for (int i = 0; i < 8; i++) {
            stack.push(String.valueOf(i));
            System.out.println(stack.getSize());
            System.out.println(stack.pop());// result should be 7
        }
    }

    @Test
    public void store() throws Exception {
    }

    @Test
    public void clear() throws Exception {
        theStack stack = new theStack();
        for (int i = 0; i < 8; i++) {
            stack.push(String.valueOf(i));
            System.out.println(stack.getSize());
//            System.out.println(stack.clear());// result should be 7
        }
    }
}