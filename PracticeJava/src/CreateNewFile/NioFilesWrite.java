package CreateNewFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NioFilesWrite {
	public static void main(String[] args) throws IOException {
		String fileData = "Mohammed Humamuddin Junaid";
		/*String fileSeparator = System.getProperty("file.separator");
		// absolute file name with path
		String absoluteFilePath = fileSeparator + "C:\\Users" + fileSeparator + "junaid" + fileSeparator
				+ "newFilesWrite_file.txt";*/
		Files.write(Paths.get("C:\\Users\\Junaid\\newFilesWrite_file.txt"), fileData.getBytes());

	}
}
