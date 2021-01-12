package RenameAndMoveFile;

import java.io.File;

public class RenameFileJava {

	/**
	 * Rename File or Move File in Java example
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// absolute path rename file
		File file = new File("C:/Users/junaid/java.txt");
		File newFile = new File("C:/Users/junaid/java1.txt");
		if (file.renameTo(newFile)) {
			System.out.println("File rename success");
			;
		} else {
			System.out.println("File rename failed");
		}

		// relative path rename file
		file = new File("tmp/file");
		newFile = new File("tmp/file1");
		if (file.renameTo(newFile)) {
			System.out.println("File rename success");
			;
		} else {
			System.out.println("File rename failed");
		}

		// java move file from one directory to another
		file = new File("C:/Users/junaid/DB.properties");
		newFile = new File("DB_Move.properties");
		if (file.renameTo(newFile)) {
			System.out.println("File move success");
			;
		} else {
			System.out.println("File move failed");
		}

		// when source file is not present
		file = new File("C:/Users/junaid/xyz.txt");
		newFile = new File("xyz.properties");
		if (file.renameTo(newFile)) {
			System.out.println("File move success");
		} else {
			System.out.println("File move failed");
		}

		// when destination already have a file with same name
		file = new File("C:/Users/junaid/export.sql");
		newFile = new File("C;/Users/junaid/java1.txt");
		if (file.renameTo(newFile)) {
			System.out.println("File move success");
			;
		} else {
			System.out.println("File move failed");
		}
	}

}
