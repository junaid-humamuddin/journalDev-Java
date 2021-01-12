package ArraysInJava;

import java.util.Arrays;

public class StringArrayToString {

	public static void main(String[] args) {
		String[] str = { "A", "E", "I", "O", "U" };
		System.out.println("toString: "+str.toString());
		System.out.println("customized toString method: "+toString(str));
		System.out.println("Arrays.toString: "+Arrays.toString(str));

		String[] strArr = new String[] { "1", "2", "3" };
		System.out.println("Arrays.toString: "+Arrays.toString(strArr));
		System.out.println("customized method with delimeter: "+convertStringArrayToString(strArr, ","));

	}

	public static String toString(Object[] a) {
		if (a == null)
			return "null";

		int iMax = a.length - 1;
		if (iMax == -1)
			return "[]";

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			b.append(String.valueOf(a[i]));
			if (i == iMax)
				return b.append(']').toString();
			b.append(", ");
		}
	}

	private static String convertStringArrayToString(String[] strArr, String delimiter) {
		StringBuilder sb = new StringBuilder();
		for (String str : strArr)
			sb.append(str).append(delimiter);
		//return sb.substring(0); -- returns 1,2,3,
		return sb.substring(0, sb.length() - 1);
	}
}
