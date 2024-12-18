package CopyFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFileUsingJava7Files {
	public static void main(String[] args) throws IOException {
		File Sourcefile = new File("C:/Users/junaid/testSource.txt");
		File Destinationfile = new File("C:/Users/junaid/testDestination3.txt");
		copyFileUsingJava7Files(Sourcefile, Destinationfile);
	}

	private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
		Files.copy(source.toPath(), dest.toPath());
	}

}
