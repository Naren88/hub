package naren.sourcecodes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataIOStreamExample {
	public static void main(String[] a)throws Exception{
        FileOutputStream  fos = new FileOutputStream("C:/Users/Naren/Desktop/Java Training/Java File Operations/Java Source/datain.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeByte(0);
        dos.writeInt(128);
        dos.writeFloat(10);
        dos.writeDouble(10.001);
        fos.close();
        dos.close();
		
        FileInputStream fis = new FileInputStream("C:/Users/Naren/Desktop/Java Training/Java File Operations/Java Destination/dataout.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readByte());
        System.out.println(dis.readInt());
        System.out.println(dis.readFloat());
        System.out.println(dis.readDouble());
        dis.close();
        fis.close();
    }
}