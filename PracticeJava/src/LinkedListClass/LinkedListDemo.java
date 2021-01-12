package LinkedListClass;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		/*NOTE:- Without using Generics, Java LinkedList supports Heterogeneous elements. 
		However, it is not recommended to use Collections without Generics. 
		Let us explore Java Generics Advantages and usage in the coming section 
			with one simple example.*/
		
		List names = new LinkedList();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
		names.add(2011);

		System.out.println("LinkedList content: " + names);
		System.out.println("LinkedList size: " + names.size());
	}
}
