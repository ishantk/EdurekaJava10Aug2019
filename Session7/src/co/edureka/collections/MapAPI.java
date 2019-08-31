package co.edureka.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapAPI {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(501, "John");
		map.put(111, "Jennie");
		map.put(321, "Ben");
		map.put(909, "Sia");
		map.put(101, "Ana");
		map.put(333, "John");
		map.put(141, null);
		map.put(null, "Leo");
		
		// Multiple null values but only 1 null key
		// Keys in HashMap are unique. i.e. once they are created they will not be re-created
		
		map.put(111, "Becca"); // update the value rather than creating a new key as keys are unique
		
		System.out.println(">> map is: "+map);
		
		String name = map.get(111);
		System.out.println(">> name is: "+name);
		
		System.out.println(">> map size is: "+map.size());
		
		if(map.containsKey(501)) {
			System.out.println(">> Key 501 is in the Map");
		}
		
		if(map.containsValue("Leo")) {
			System.out.println(">> Leo is in the Map");
		}
		
		Set<Integer> keys = map.keySet(); // Fetch all the keys from HashMap
		System.out.println("===Map Keys===");
		System.out.println(keys);
		
		Iterator<Integer> itr = keys.iterator();
		
		// Iterating in Set of Keys we can iterate in HashMap itself
		while(itr.hasNext()) {
			Integer key = itr.next();
			String nam = map.get(key);
			
			System.out.println(key+"\t"+nam);
		}
		
		System.out.println();
		
//		Entry<Integer, String> // Key Value Pair in Map is an Entry Object
		
		Set<Entry<Integer, String>> entries = map.entrySet(); // We will directly get set of Entries
		Iterator<Entry<Integer, String>> itr1 = entries.iterator();
		
		while(itr1.hasNext()) {
			Entry<Integer, String> entry = itr1.next();
			
			Integer key = entry.getKey();
			String nam = entry.getValue();
			
			System.out.println(key+"\t"+nam);
			
		}
		
		// Hashtable is Thread-Safe i.e. it is Synchronized version of HashMap
		// It wont allow null keys or null values
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(501, "John");
		table.put(111, "Jennie");
		table.put(321, "Ben");
		table.put(909, "Sia");
		table.put(101, "Ana");
		table.put(333, "John");
		//table.put(141, null);   // null value not allowed
		//table.put(null, "Leo"); // null key not allowed
		
		System.out.println(">> table is: "+table);
		
	}

}
