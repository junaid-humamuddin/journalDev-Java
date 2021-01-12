package TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetComparable {

	public static void main(String[] args) {
		// Create a sorted set with user defined class
		SortedSet<Person> sortedSet = new TreeSet<>();
		sortedSet.add(new Person(1, "Mark"));
		sortedSet.add(new Person(2, "Vispi"));
		sortedSet.add(new Person(3, "Harmony"));
		sortedSet.forEach(System.out::println);
	}
}

class Person implements Comparable<Person> {
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}

	@Override
	public String toString() {
		return this.name;
	}
}
