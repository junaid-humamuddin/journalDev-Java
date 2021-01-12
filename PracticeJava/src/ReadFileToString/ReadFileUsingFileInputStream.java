package ReadFileToString;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {
	public static void main(String[] args) throws IOException {
		String fileName = "C:/Users/junaid/testSource.txt";
		FileInputStream fis = new FileInputStream(fileName);
		FilesToStringUsingFileInputStream fs = new FilesToStringUsingFileInputStream();
		System.out.println(fs.filesToStringUsingFileInputStream(fis));
	}
}

class FilesToStringUsingFileInputStream {

	String filesToStringUsingFileInputStream(FileInputStream fis) throws IOException {
		byte[] buffer = new byte[10];
		StringBuilder sb = new StringBuilder();
		while (fis.read(buffer) != -1) {
			sb.append(new String(buffer));
			buffer = new byte[10];
		}
		fis.close();

		String content = sb.toString();
		return content;
	}

}