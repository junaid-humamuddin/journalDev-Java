package ReadFileToString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		String fileName = "C:/Users/junaid/testSource.txt";
		BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
		FilesToStringUsingBufferReader br = new FilesToStringUsingBufferReader();
		System.out.println(br.filesToStringUsingBufferReader(reader1));

		BufferedReader reader2 = new BufferedReader(new FileReader(fileName));
		FilesToStringUsingBufferReaderAndCharArray br_ca = new FilesToStringUsingBufferReaderAndCharArray();
		System.out.println(br_ca.filesToStringUsingBufferReaderAndCharArray(reader2));
	}

}

class FilesToStringUsingBufferReader {
	String filesToStringUsingBufferReader(BufferedReader reader) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;
		String ls = System.getProperty("line.separator");
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		// delete the last new line separator
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		reader.close();

		String content = stringBuilder.toString();
		return content;

	}
}

class FilesToStringUsingBufferReaderAndCharArray {
	String filesToStringUsingBufferReaderAndCharArray(BufferedReader reader) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		char[] buffer = new char[10];
		while (reader.read(buffer) != -1) {
			stringBuilder.append(new String(buffer));
			buffer = new char[10];
		}
		reader.close();

		String content = stringBuilder.toString();
		return content;

	}
}