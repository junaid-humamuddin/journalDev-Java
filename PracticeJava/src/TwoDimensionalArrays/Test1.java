package TwoDimensionalArrays;

public class Test1 {

	public static void main(String[] args) {

		/*int[][] arr = new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}*/
		
		String[][] arrStr = new String[3][4];
		for (int i = 0; i < arrStr.length; i++) {
			for (int j = 0; j < arrStr[i].length; j++) {
				arrStr[i][j] =  "str"+j;
				System.out.print(arrStr[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
