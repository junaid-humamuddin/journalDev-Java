package CopyFile;

import java.io.File;
import java.io.IOException;

public class JavaCopyFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		File source = new File("/Users/pankaj/tmp/source.avi");
		File dest = new File("/Users/pankaj/tmp/dest.avi");

		// copy file conventional way using Stream
		long start = System.nanoTime();
		//copyFileUsingStream(source, dest);
		System.out.println("Time taken by Stream  = " + (System.nanoTime() - start));

		// copy files using java.nio FileChannel
		source = new File("/Users/pankaj/tmp/sourceChannel.avi");
		dest = new File("/Users/pankaj/tmp/destChannel.avi");
		start = System.nanoTime();
		//copyFileUsingChannel(source, dest);
		System.out.println("Time taken by Channel  = " + (System.nanoTime() - start));

		// copy files using apache commons io
		source = new File("/Users/pankaj/tmp/sourceApache.avi");
		dest = new File("/Users/pankaj/tmp/destApache.avi");
		start = System.nanoTime();
		//copyFileUsingApacheCommonsIO(source, dest);
		System.out.println("Time taken by Apache Commons IO  = " + (System.nanoTime() - start));

		// using Java 7 Files class
		source = new File("/Users/pankaj/tmp/sourceJava7.avi");
		dest = new File("/Users/pankaj/tmp/destJava7.avi");
		start = System.nanoTime();
		//copyFileUsingJava7Files(source, dest);
		System.out.println("Time taken by Java7 Files  = " + (System.nanoTime() - start));
	}
}
