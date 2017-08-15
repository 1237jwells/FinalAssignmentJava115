package sample;

import org.junit.Test;
//Testing Stack and Stack methods
public class theStackTest {

    private void assertTrue(Double push) {
    }

    @Test//Testing Peek method
    public void peek1() throws Exception {
        theStack stack = new theStack();
        for (double i = (-5); i < 8; i++) {
            stack.push(Double.parseDouble(String.valueOf(i)));
            assertTrue(stack.peek());
        }
        System.out.println(stack.peek()); //result should be 7
    }
    @Test//Testing Push method
    public void push() throws Exception {
        theStack stack = new theStack();
        for (double i = (-5); i < 5; i++) {
            stack.push(Double.parseDouble(String.valueOf(i)));
            assertTrue(stack.push(Double.parseDouble(String.valueOf(i))));
            System.out.println(stack.push((Double.parseDouble(String.valueOf(i))))); //result should be 7
        }

    }
    @Test//Testing getSize method
    public void getSize() throws Exception {
        theStack stack = new theStack();
        for (double i = 0; i < 8; i++) {
            stack.push(Double.parseDouble(String.valueOf(i)));
            assertTrue(Double.valueOf(stack.getSize(String.valueOf(i))));
            System.out.println(Double.valueOf(stack.getSize(String.valueOf(i))));
        }
    }

    @Test//Testing Pop method
    public void pop() throws Exception {
        theStack stack = new theStack();
        for (double i = (-5); i < 8; i++) {
            stack.push(Double.parseDouble(String.valueOf(i)));
            assertTrue(Double.parseDouble(String.valueOf(i)));
            System.out.print(Double.parseDouble(String.valueOf(i)));
            stack.pop();
        }
    }

    @Test
    public void clear() throws Exception {
        theStack stack = new theStack();
        for (double i = 0; i < 8; i++) {
            stack.push(Double.parseDouble(String.valueOf(i)));
            assertTrue(Double.parseDouble(String.valueOf(i)));
            System.out.println(Double.parseDouble(String.valueOf(i)));
            stack.clear();
            System.out.println(Double.parseDouble(String.valueOf(i)));// result should be nothing in stack
        }
    }
}