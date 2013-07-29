package naren.sourcecodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
public class SerializationAndDeserializationExample {
	public static void main(String args[]) throws Exception, IOException {
		File file = new File("C:/Users/Naren/Desktop/Java Training/objects/emplyee.txt");
		Employee emp = new Employee("Naren");
		ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream(file));
		ops.writeObject(emp); //serialize

		ObjectInputStream ips = new ObjectInputStream(new FileInputStream(file));
		emp = (Employee) ips.readObject(); //deserialize
		System.out.println("After deserialization the user name is: " + emp.getUser());
	}
}