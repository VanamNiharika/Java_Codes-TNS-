
// Java program to demonstrate the
// working of a LinkedHashSet
  
import java.util.*;
public class LinkedHashSet_SetInterface {
    public static void main(String args[])
    {
        // Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs
            = new LinkedHashSet<String>();
  
        lhs.add("Java");
        lhs.add("Language");
        lhs.add("is a");
        lhs.add("Programming");
        lhs.add("Language");
      //Printing of Elements is sequential 
     // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}