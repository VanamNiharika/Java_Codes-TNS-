// Java program to demonstrate the
// working of a stack
  
import java.util.*;
public class Stack_ListInterface {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("I");
        stack.push("am");
        stack.push("Learning");
        stack.push("Java");
  
        // Iterator for the stack
        Iterator<String> itr
            = stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        
        stack.pop();
  
        // Iterator for the stack
        itr
            = stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

