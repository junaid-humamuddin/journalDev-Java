package ReadTextFile_ScannerClass;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) throws IOException {

		RandomAccessFile file = new RandomAccessFile("C:/Users/junaid/testSource.txt", "r");
		String str;

		while ((str = file.readLine()) != null) {
			System.out.println(str);
		}
		file.close();

	}
}
