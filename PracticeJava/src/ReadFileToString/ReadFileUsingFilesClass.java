package ReadFileToString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileUsingFilesClass {
	public static void main(String[] args) throws IOException {
		String fileName = "C:/Users/junaid/testSource.txt";
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		System.out.println(content);
	}
}
