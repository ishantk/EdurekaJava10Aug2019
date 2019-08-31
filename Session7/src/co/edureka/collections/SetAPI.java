package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetAPI {

	public static void main(String[] args) {

//		 Stores data with indexing technique
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Jennie");
		list.add("John");
		list.add("Jim");
		list.add("Jack");
		list.add("John");
		
//      Ref: https://en.wikipedia.org/wiki/Hash_function		
//		Stores data with hashing technique and not indexing technique
//		Output is unordered but unique due to Hashing		
		HashSet<String> set = new HashSet<String>();
		set.add("John");
		set.add("Jennie");
		set.add("John");
		set.add("Jim");
		set.add("Jack");
		set.add("John");
		
		System.out.println(">> list is: "+list);
		System.out.println(">> set is: "+set);
		
		// Since we have no indexes we need to use iterator api to iterate in HashSet
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String nm = itr.next();
			System.out.println(">> nm: "+nm);
		}

		set.remove("Jack");
		if(set.contains("John")) {
			System.out.println(">> John is in the set");
		}
		
		//set.addAll()
		System.out.println(">> size is: "+set.size());
		
		TreeSet<String> names = new TreeSet<String>();
		names.add("John");
		names.add("Ben");
		names.add("Ana");
		names.add("Sia");
		names.add("Ana");
		names.add("Kim");
		
		System.out.println(">> names are: "+names);
		
		
	}

}
