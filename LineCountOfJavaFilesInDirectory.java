/* Program that counts the number of lines of actual code in a Java source file from a given directory */

package naren.sourcecodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCountOfJavaFilesInDirectory {
	
	public static int countJavaFilesInDirectory(File directory) throws FileNotFoundException {
		int count = 0;
		for (File file : directory.listFiles()) {
			if (file.isFile() && file.getName().endsWith(".java")) {
				
				count = count + appenedFileCount(file);
			}
			else if (file.isDirectory()) {
				count = count + countJavaFilesInDirectory(file);
			}
		}
		return count;
	}
	
	public static int appenedFileCount(File file) throws FileNotFoundException {

		int count = 0;
		int commentLines = 0;
		int lineComment = 0;
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {

			String string = scanner.nextLine().trim();

			if ((string.contains("/**") || string.contains("/*") || string.contains("//") || string.trim().isEmpty())) {
				commentLines = commentLines + 1;
			}
			else if (string.startsWith("*")) {
				lineComment = lineComment + 1;
			}

			count = count + 1;

		}
		System.out.println(file.getName() + " --> Number of lines : " + (count - commentLines - lineComment));
		System.out.println();
		return (count - commentLines - lineComment);
	}

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("path_of_the_directory");
		countJavaFilesInDirectory(file);
	
	}

}