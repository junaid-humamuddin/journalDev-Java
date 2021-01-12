package FileNameFilter;

import java.io.File;

public class FileNameFilterExample {

	public static void main(String[] args) {
		String dir = "C:/Users/junaid/tmp";
		String extension = ".txt";
		File file = new File(dir);
		if (!file.exists())
			System.out.println(dir + " Directory doesn't exists");
		
		/*The listFiles() method is a part of File class.
		The function returns an array of Files denoting the files in a given abstract pathname if the path name is a directory else returns null. 
		The function is an overloaded function. 
			One of the function does not have any parameter, 
			the second function takes FilenameFilter object as parameter, 
			the third function takes FileFilter object as parameter*/
		
		FilenameFilter filter = new FilenameFilter();
		File[] listFiles = file.listFiles(filter);
		// File[] listFiles = file.listFiles((d, s) -> {
		// return s.toLowerCase().endsWith(extension);
		// });

		if (listFiles.length == 0) {
			System.out.println(dir + "doesn't have any file with extension " + extension);
		} else {
			for (File f: listFiles)
				System.out.println("File: " + dir + File.separator + f.getName());
		}
	}
}
	
	class FilenameFilter implements java.io.FilenameFilter{
		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return true;
		}
	}

	// FileNameFilter implementation
	/*public static class MyFileNameFilter implements FilenameFilter {

		private String extension;

		public MyFileNameFilter(String extension) {
			this.extension = extension.toLowerCase();
		}

		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean accept(File dir, String name) {
			return name.toLowerCase().endsWith(extension);
		}

	}*/
