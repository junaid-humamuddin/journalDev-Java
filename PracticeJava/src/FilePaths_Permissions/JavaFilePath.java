package FilePaths_Permissions;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class JavaFilePath {

	public static void main(String[] args) throws IOException, URISyntaxException {
		File file = new File("C:/Users/junaid/test.txt");
		printPaths(file);
		// relative path
		file = new File("test.xsd");
		printPaths(file);
		// complex relative paths
		file = new File("C:/Users/junaid/../junaid/test.txt");
		printPaths(file);
		// URI paths
		file = new File(new URI("file:///Users/junaid/test.txt"));
		printPaths(file);
	}

	private static void printPaths(File file) throws IOException {
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Canonical Path: " + file.getCanonicalPath());
		System.out.println("Path: " + file.getPath());
	}

}
