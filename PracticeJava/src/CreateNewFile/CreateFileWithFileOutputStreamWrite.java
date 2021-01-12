package CreateNewFile;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileWithFileOutputStreamWrite {
	public static void main(String[] args) throws IOException {
		String fileData = "Junaid";
		String fileSeparator = System.getProperty("file.separator");

		// absolute file name with path
		String absoluteFilePath = fileSeparator + "C:\\Users" + fileSeparator + "junaid" + fileSeparator
				+ "fileOutputStreamWrite_file.txt";
		FileOutputStream fos = new FileOutputStream(absoluteFilePath);
		fos.write(fileData.getBytes());
		fos.flush();
		fos.close();

	}

}
