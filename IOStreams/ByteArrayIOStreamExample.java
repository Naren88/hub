package naren.sourcecodes;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;

public class ByteArrayIOStreamExample {
	
	public static void main(String[] args)throws Exception{
        InputStreamReader   inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Enter the array of data: ");
        String line = bufferedReader.readLine();
		
        byte[] b1 = line.getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(b1);
		
        System.out.println("Reading the data from ByteArrayStream: ");
        byte[] b2 = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(b2);
        int c = 0;
        while ((c=bais.read()) != -1){
            System.out.print((char)c);
        }
		
        bais.close();
        baos.close();

    }
}