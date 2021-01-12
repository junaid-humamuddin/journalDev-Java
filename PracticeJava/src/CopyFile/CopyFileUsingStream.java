package CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileUsingStream {

	public static void main(String[] args) {
		try {
			File Sourcefile = new File("C:/Users/junaid/testSource.txt");
			File Destinationfile = new File("C:/Users/junaid/testDestination1.txt");
			copyFileUsingStream(Sourcefile, Destinationfile);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	private static void copyFileUsingStream(File source, File dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}
	}

}
