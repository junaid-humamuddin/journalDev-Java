package CopyFile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyFileUsingApacheCommonsIO {
	public static void main(String[] args) throws IOException {
		File Sourcefile = new File("C:/Users/junaid/testSource.txt");
		File Destinationfile = new File("C:/Users/junaid/testDestination2.txt");
		copyFileUsingApacheCommonsIO(Sourcefile, Destinationfile);
	}

	private static void copyFileUsingApacheCommonsIO(File source, File dest) throws IOException {
		FileUtils.copyFile(source, dest);
	}

}
