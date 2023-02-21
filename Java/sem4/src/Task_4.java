/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
 */
public class Task_4 {
    public static void main(String[] args) {
        myStack stack = new myStack();
        System.out.println(stack.size());
        stack.push(5);
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
