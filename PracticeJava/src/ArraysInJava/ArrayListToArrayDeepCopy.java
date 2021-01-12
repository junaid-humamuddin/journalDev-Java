package ArraysInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayDeepCopy {

	public static void main(String[] args) {
		Person p1 = new Person("Pankaj");
		Person p2 = new Person("Lisa");

		List<Person> pList = new ArrayList<>();
		pList.add(p1);
		pList.add(p2);

		// convert ArrayList to Array using deep copy
		Person[] pArray = new Person[pList.size()];

		for (int i = 0; i < pList.size(); i++) {
			Person p = pList.get(i);
			Person temp = new Person(p.getName());
			pArray[i] = temp;
		}

		System.out.println("Original List = " + pList);
		System.out.println("Created Array from ArrayList = " + Arrays.toString(pArray));

		// let's change the list and array
		pList.get(0).setName("David");
		pArray[1].setName("Ram");

		System.out.println("Modified List = " + pList);
		System.out.println("Modified Array = " + Arrays.toString(pArray));

	}

}