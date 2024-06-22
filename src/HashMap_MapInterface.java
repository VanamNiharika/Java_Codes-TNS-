// Java program to demonstrate the
// working of a HashMap
  
import java.util.*;
public class HashMap_MapInterface {
    public static void main(String args[])
    {
        // Creating HashMap and
        // adding elements
        HashMap<Integer, String> hm
            = new HashMap<Integer, String>();
  
        hm.put(1, "I");
        hm.put(2, "am");
        hm.put(3, "Niharika");
     // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));
  
        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
