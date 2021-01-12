package ArraysInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayMutableObjects {

	public static void main(String[] args) {
		Person p1 = new Person("Pankaj");
		Person p2 = new Person("Lisa");

		List<Person> pList = new ArrayList<>();
		pList.add(p1);
		pList.add(p2);

		Person[] pArray = pList.toArray(new Person[0]);

		System.out.println("Original List = " + pList);
		System.out.println("Created Array from ArrayList = " + Arrays.toString(pArray));

		// let's change the list and array
		pList.get(0).setName("David");
		pArray[1].setName("Ram");

		System.out.println("Modified List = " + pList);
		System.out.println("Modified Array = " + Arrays.toString(pArray));

	}

}

class Person {
	private String name;

	public Person(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
