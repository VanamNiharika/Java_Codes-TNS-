// Java program to demonstrate the
// working of a HashSet
  
import java.util.*;
public class HashSet_SetInterface {
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();
  
        
        hs.add("Java");
        hs.add("Language");
        hs.add("is a");
        hs.add("Programming");
        hs.add("Language");
        //duplicate elements cannot be added into hashset
        //Printing of Elements is not sequential ie, dynamic
         // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

  
