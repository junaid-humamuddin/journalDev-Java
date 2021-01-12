package ReadFileToString;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFileUsingScanner {
	public static void main(String[] args) throws IOException {
		String fileName = "C:/Users/junaid/testSource.txt";
		Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
		String content = scanner.useDelimiter("\\A").next();
		System.out.println(content);
		scanner.close();
	}
}
