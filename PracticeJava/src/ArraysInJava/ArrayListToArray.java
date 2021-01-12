package ArraysInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("1");
		strList.add("2");
		strList.add("3");

		String[] strArr1 = null;

		strArr1 = strList.toArray(new String[strList.size()]);
		System.out.println(Arrays.toString(strArr1));
		
		
		Object[] strArr2 = null;
		
		strArr2 = strList.toArray();
		System.out.println(strArr2);
		
		for (Object obj : strArr2) 
            System.out.print(obj + " "); 
	}
}
