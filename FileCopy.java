/* Copying a File from one folder to another folder */

package naren.sourcecodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String args[]) throws IOException {

		File file = new File("C:/Users/Naren/Desktop/Java Exercises/Java Source/FileParser.java"); //Source File Path
		if(file.exists()){
			FileInputStream fips = new FileInputStream(file);
			FileOutputStream fops = new FileOutputStream("C:/Users/Naren/Desktop/Java Exercises/Java Destination/ParseFile.java"); //Destination File Path
			byte[] buffer = new byte[fips.available()];
			fips.read(buffer);
			fops.write(buffer);
			System.out.println("File copied successfully.");
		}

	}

}