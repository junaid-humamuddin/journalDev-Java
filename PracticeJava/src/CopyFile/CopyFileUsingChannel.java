package CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyFileUsingChannel {
	public static void main(String[] args) {
		try {
			File Sourcefile = new File("C:/Users/junaid/testSource.txt");
			File Destinationfile = new File("C:/Users/junaid/testDestination1.txt");
			copyFileUsingChannel(Sourcefile, Destinationfile);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	private static void copyFileUsingChannel(File source, File dest) throws IOException {
		FileChannel sourceChannel = null;
		FileChannel destChannel = null;
		try {
			sourceChannel = new FileInputStream(source).getChannel();
			destChannel = new FileOutputStream(dest).getChannel();
			destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
		} finally {
			sourceChannel.close();
			destChannel.close();
		}
	}

}
