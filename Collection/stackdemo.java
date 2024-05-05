import java.util.Stack;

public class stackdemo {

    
    public static void main(String[] args) {

        Stack stack1 = new Stack();

        Stack<String> stack2 = new Stack<String>();

        stack1.push("A");
        stack1.push("Amit");
        stack1.push("Arya");

        stack2.push("This");
        stack2.push("Is");
        stack2.push("Amit");

        System.out.println(stack1);
        System.out.println(stack2);
    }
}
