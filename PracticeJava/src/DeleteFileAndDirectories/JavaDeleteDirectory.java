package DeleteFileAndDirectories;

import java.io.File;

public class JavaDeleteDirectory {

	public static void main(String[] args) {
		File dir = new File("C:/Users/junaid/log1");

		if (dir.isDirectory() == false) {
			System.out.println("Not a directory. Do nothing");
			/*
			 * NOTE: You can only use return without any expression following it in a void
			 * method. It serves as an immediate termination point for the method. It is
			 * mostly used inside some early termination branches that bypass the main logic
			 * of a method: public void logIfNegative(int value) {
			 */
			return;
		}
		File[] listFiles = dir.listFiles();
		for (File file : listFiles) {
			System.out.println("Deleting " + file.getName());
			file.delete();
		}
		// now directory is empty, so we can delete it
		System.out.println("Deleting Directory. Success = " + dir.delete());

	}

}
