package FileSize_FileExtension;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class JavaGetFileSizeUsingApacheCommonsIO {

	static final String FILE_NAME = "/Users/pankaj/Downloads/file.pdf";

	public static void main(String[] args) {
		File file = new File(FILE_NAME);

		long fileSize = FileUtils.sizeOf(file);

		System.out.println(fileSize + " bytes");
	}
}
