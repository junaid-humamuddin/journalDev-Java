package ReadTextFile_ScannerClass;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws IOException {
		String fileName = "C:/Users/junaid/testSource.txt";
		Path path = Paths.get(fileName);
		Scanner scanner = new Scanner(path);
		System.out.println("Read text file using Scanner");
//read line by line
		while (scanner.hasNextLine()) {
			// process each line
			String line = scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();

	}
}
