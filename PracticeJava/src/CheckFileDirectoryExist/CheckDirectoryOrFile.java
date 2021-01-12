package CheckFileDirectoryExist;

import java.io.File;

public class CheckDirectoryOrFile {

	public static void main(String[] args) {
		File file = new File("C:/Users/junaid/source.txt");
		File dir = new File("C:/Users/junaid");
		File notExists = new File("C:/Users/junaid/notafile");

		System.out.println("C:/Users/junaid/source.txt is file?" + file.isFile());
		System.out.println("C:/Users/junaid/source.txt is directory?" + file.isDirectory());

		System.out.println("C:/Users/junaid is file?" + dir.isFile());
		System.out.println("C:/Users/junaid is directory?" + dir.isDirectory());

		System.out.println("C:/Users/junaid/notafile is file?" + notExists.isFile());
		System.out.println("C:/Users/junaid/notafile is directory?" + notExists.isDirectory());
	}

}
