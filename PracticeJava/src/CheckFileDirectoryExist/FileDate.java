package CheckFileDirectoryExist;

import java.io.File;
import java.util.Date;

public class FileDate {

	public static void main(String[] args) {
		File file = new File("tmp/file.txt");

		long timestamp = file.lastModified();
		System.out.println("file.txt last modified date = " + new Date(timestamp));
	}

}
