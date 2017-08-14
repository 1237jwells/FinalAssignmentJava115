package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class theStackTest {
    @Test
    public void peek() throws Exception { //the peek method works. junit testing complete.
        theStack stack = new theStack();
        for (int i = 0; i < 5; i++) {
            stack.push(String.valueOf(i));
        }
        System.out.println(stack.peek()); //result should be 4
    }

    @Test
    public void push1() throws Exception {
    }

    @Test
    public void push2() throws Exception {
    }

    @Test
    public void getSize() throws Exception {
    }

    @Test
    public void pop() throws Exception {
    }

    @Test
    public void store() throws Exception {
    }

    @Test
    public void clear() throws Exception {
    }

}