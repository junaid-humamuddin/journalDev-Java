package ReadFileToString;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

public class ReadFileUsingApacheCommonsIOFileUtils {
	public static void main(String[] args) throws IOException {
		String fileName = "C:/Users/junaid/testSource.txt";
		String content = FileUtils.readFileToString(new File(fileName), StandardCharsets.UTF_8);
		System.out.println(content);
	}
}
