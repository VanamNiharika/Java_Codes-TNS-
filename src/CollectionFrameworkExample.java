import java.util.*;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // Example of ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("ArrayList Example:");
        for (String lang : arrayList) {
            System.out.println(lang);
        }

        System.out.println();

        // Example of HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate element, will not be added

        System.out.println("HashSet Example:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        System.out.println();

        // Example of HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        System.out.println("HashMap Example:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();

        // Example of LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");

        System.out.println("LinkedList Example:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }
    }
}