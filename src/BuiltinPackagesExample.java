import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class BuiltinPackagesExample {
	
	public static void main (String args[]) {

		// java-util package demonstration

		// using arraylist

		ArrayList<String> list = new ArrayList<>();

		list.add("Apple");

		list.add("Banana");

		list.add("cherry");
		System.out.println("ArrayList");

		for (String fruit: list) {
			System.out.println(fruit);
		}

		//using collections to sort the list

	    Collections.sort(list);

		System.out.println("Sorted Arraylist:");

		for (String fruit: list) {
			System.out.println(fruit);
		}

		// using Hashmap

		HashMap<String, Integer > map = new HashMap<>();
		map.put("Apple",1);
		map.put("Banana", 2);
		map.put("Cherry",3);
		System.out.println("HashMap:");
		for (String key: map.keySet()){
			   System.out.println(key + ":"+ map.get(key));
	    }

		// using Date

		Date date = new Date();

		System.out.println("Current Date:" + date );

		// java.io package demonstration

		// writing a file

		try {
			
			FileWriter writer = new FileWriter("example.txt");
			writer.write ("Hello this is a demonstration of java.io.package");
			writer.close();
			System.out.println("Successfully wrote to the file");
			
			//Reading from a file
			File file = new File("example.txt");
			Scanner reader = new Scanner (file);
			System.out.println("File content:");

			while(reader.hasNextLine()){ 
				String data = reader.nextLine();
				System.out.println(data);
			}

			reader.close();
		}
		catch(IOException e) {
			System.out.println("An error occured");
            e.printStackTrace();
		}
		// java time package demonstration
	    // Using LocalDate

		LocalDate today = LocalDate.now(); 
		System.out.println("Current Date:" +today);

		// Using LocalDateTime

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime= now.format(formatter);
		System.out.println("Current Date and Time:" + formattedDateTime);
	}
}