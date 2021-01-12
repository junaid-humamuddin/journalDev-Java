package DeleteFileAndDirectories;

import java.io.File;

public class DeleteFileJava {

	/**
	 * This class shows how to delete a File in Java
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// absolute file name with path
		File file = new File("C:/Users/junaid/file.txt");
		if (file.delete()) {
			System.out.println("C:/Users/junaid/file.txt File deleted");
		} else
			System.out.println("File /Users/junaid/file.txt doesn't exist");

		// file name only
		file = new File("file.txt");
		if (file.delete()) {
			System.out.println("file.txt File deleted from Project root directory");
		} else
			System.out.println("File file.txt doesn't exist in the project root directory");

		// relative path
		file = new File("tmp/file1.txt");
		if (file.delete()) {
			System.out.println("tmp/file.txt File deleted from Project root directory");
		} else
			System.out.println("File tmp/file.txt doesn't exist in the project root directory");

		// delete empty directory
		file = new File("tmp");
		if (file.delete()) {
			System.out.println("tmp directory deleted from Project root directory");
		} else
			System.out.println("tmp directory doesn't exist or not empty in the project root directory");

		// try to delete directory with files
		file = new File("C:/Users/junaid/project");
		if (file.delete()) {
			System.out.println("C:/Users/junaid/project directory deleted from Project root directory");
		} else
			System.out.println("C:/Users/junaid/project directory doesn't exist or not empty");
	}

}
