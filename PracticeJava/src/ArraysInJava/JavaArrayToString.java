package ArraysInJava;

import java.util.Arrays;

public class JavaArrayToString {

	public static void main(String[] args) {
		A[] arr = { new A("1"), new A("2"), new A("3") };

		// default toString() method
		System.out.println(arr.toString());

		// using Arrays.toString() for printing object array contents
		System.out.println(Arrays.toString(arr));

		// converting Object Array to String
		//System.out.println(convertObjectArrayToString(arr, ","));
	}

	private static String convertObjectArrayToString(Object[] arr, String delimiter) {
		StringBuilder sb = new StringBuilder();
		for (Object obj : arr)
			sb.append(obj.toString()).append(delimiter);
		return sb.substring(0, sb.length() - 1);

	}

}

class A {
	private String name;

	public A(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		System.out.println("A toString() method called!!");
		return this.name;
	}
}
