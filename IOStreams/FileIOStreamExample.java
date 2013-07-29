package naren.sourcecodes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExample {
    public static void main(String[] args) throws IOException {

        FileInputStream fips = null;
        FileOutputStream fops = null;

        try {
            fips = new FileInputStream("C:/Users/Naren/Desktop/Java Training/Java File Operations/Java Source/filein.txt");
            fops = new FileOutputStream("C:/Users/Naren/Desktop/Java Training/Java File Operations/Java Destination/fileout.txt");
            int c;

            while ((c = fips.read()) != -1) {
                fops.write(c);
            }
        } finally {
            if (fips != null) {
                fips.close();
            }
            if (fops != null) {
                fops.close();
            }
        }
    }
}