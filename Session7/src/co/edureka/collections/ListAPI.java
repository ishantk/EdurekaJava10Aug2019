package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/*
 	interface List{
 	
 	}
 	
 	class ArrayList implements List{
 	
 	}
 	
 */

class Product{
	
	String name;
	int price;
	
	public String toString() {
		return name+" - "+price;
	}
}

public class ListAPI {

	public static void main(String[] args) {
		
		//List list1 = new ArrayList(); 						// Polymorphic Statement
		// list1 is hetrogeneous list | Any Objects
		ArrayList list1 = new ArrayList();						// Direct Object Construction
		
		// list2 is homogeneous | Only String Objects
		ArrayList<String> list2 = new ArrayList<String>(); 		 //  Direct Object Construction 
		
		// list3 is homogeneous | Only Product Objects
		ArrayList<Product> list3 = new ArrayList<Product>();  	//  Direct Object Construction 
		
		
		Product p1 = new Product();
		p1.name = "iPhoneX";
		p1.price = 80000;
		
		Product p2 = new Product();
		p2.name = "PS4";
		p2.price = 27000;
		
		Product p3 = new Product();
		p3.name = "Samsung LED";
		p3.price = 50000;
		
		//System.out.println(">> p1 is: "+p1);
		
		
		// 1. Add Data i.e. Objects in the list
		list1.add(0,100);		// 0
		list1.add('A');			// 1
		list1.add(2.2);			// 2
		list1.add("Hello");		// 3
		list1.add(p1);			// 4
		
		list2.add("John");		// 0
		list2.add("Jennie");	// 1
		list2.add("Fionna");	// 2
		list2.add("Jack");		// 3
		list2.add("Kim");		// 4
		list2.add("Fionna");	// 5
		//list2.add(100); 		// err
		//list2.add(p1);  		// err
		
		list3.add(p1);			// 0
		list3.add(p2);			// 1
		list3.add(p3);			// 2
		//list3.add(100);	 	// err
		//list3.add("Hello");	// err
		
		// 2. Check size of list
		System.out.println(">> list1 size is "+list1.size());
		System.out.println(">> list2 size is "+list2.size());
		System.out.println(">> list3 size is "+list3.size());
		
		// 3. Read the list by printing reference variable
		System.out.println(">> list1 data: ");
		System.out.println(list1);
		System.out.println();
		
		System.out.println(">> list2 data: ");
		System.out.println(list2);
		System.out.println();
		
		System.out.println(">> list3 data: ");
		System.out.println(list3);
		System.out.println();
		
		// 4. Update Operation
		System.out.println(">> list2 BEFORE: "+list2);
		list2.set(1, "Becca");
		System.out.println(">> list2 AFTER: "+list2);
		
		// 5. Contains Operation
		if(list2.contains("Becca")) {
			System.out.println(">> Becca is in the list");
		}
		
		// 6. Fetching of Index
		int idx = list2.indexOf("Fionna");
		System.out.println(">> index of Fionna: "+idx);
		idx = list2.lastIndexOf("Fionna");
		System.out.println(">> last index of Fionna: "+idx);
		
		// 7. Removing the Element
		list2.remove(2);
		System.out.println(">> list2 now is: "+list2);
		
		// 8. Remove All
		//list2.clear();
		//System.out.println(">> list2 after clear is: "+list2);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ben");
		names.add("Harry");
		names.add("George");
		
		names.addAll(list2); // we are adding all the elements of list2 into names
		System.out.println(">> list2 is: "+list2);
		System.out.println(">> names is: "+names);
		
		// 9. Get Single Element from List
		String name = list2.get(1);
		System.out.println(">> name is: "+name);
		
		// list1 is hetrogeneous i.e. type of data is not know as all elements are some different types
		// Object is Parent to all in Java and as per RTP it can point to any child
		Object oRef = list1.get(0);
		System.out.println(">> oRef is: "+oRef);
		
		Product pRef = list3.get(2);
		
		System.out.println(">> name is: "+name);
		System.out.println(">> oRef is: "+oRef);
		System.out.println(">> pRef is: "+pRef);
		
		names.add(list2.get(2)); // add a specific index element from another list
		
		// 10. Iterating in a List
		
		// 10.1 Using a For Loop
		System.out.println("===for loop==");
		
		System.out.println(">> list1 data");
		for(int i=0;i<list1.size();i++) {
			Object o = list1.get(i);
			System.out.println(o);
		}
		
		System.out.println(">> list2 data");
		for(int i=0;i<list2.size();i++) {
			String str = list2.get(i);
			System.out.println(str);
		}
		
		System.out.println(">> list3 data");
		for(int i=0;i<list3.size();i++) {
			Product p = list3.get(i);
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("===enhanced for loop==");
		
		System.out.println(">> list1 data");
		for(Object o : list1) {
			System.out.println(o);
		}
		
		System.out.println(">> list2 data");
		for(String str : list2) {
			System.out.println(str);
		}
		
		System.out.println(">> list3 data");
		for(Product p : list3) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("===iterator api==");
		
		Iterator<String> itr2 = list2.iterator();
		/*System.out.println(">> "+itr2.next());
		System.out.println(">> "+itr2.next());
		System.out.println(">> "+itr2.next());*/
		
		while(itr2.hasNext()) {
			String nm = itr2.next();
			System.out.println(">> "+nm);
			
			if(nm.equals("Becca")) {
				itr2.remove(); // remove data from list directly
			}
		}
		
		System.out.println(">> list2 now is: "+list2);
		
//		Iterator<Object> itr1 = list1.iterator();
//		Iterator<Product> itr3 = list3.iterator();
		
		System.out.println();
		System.out.println("===listIterator api==");
		
		ListIterator<String> listItr2 = list2.listIterator();
		
		while(listItr2.hasNext()) {
			String nm = listItr2.next();
			System.out.println(">> "+nm);
		}	
		System.out.println("----");
		while(listItr2.hasPrevious()) {
			String nm = listItr2.previous();
			System.out.println(">> "+nm);
		}
		
		System.out.println();
		System.out.println("===enumeration api==");
		
		Enumeration<String> enm = Collections.enumeration(list2); // read only api : cannot perform delete operation
		while(enm.hasMoreElements()) {
			String nm = enm.nextElement();
			System.out.println(">> nm is: "+nm);
		}
		
		
		// Vector is a Thread-Safe Version of ArrayList
		Vector<String> vector = new Vector<String>();
		vector.add("John");		// 0
		vector.add("Jennie");	// 1
		vector.add("Fionna");	// 2
		vector.add("Jack");		// 3
		vector.add("Kim");		// 4
		vector.add("Fionna");	// 5
		
		System.out.println(">> vector data ");
		System.out.println(vector);
		
		// ArrayList is a better version as we have indexed approach :)
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("John");
		linkedList.add("Fionna");
		linkedList.add("Harry");
		linkedList.add("Kia");
	}

}
