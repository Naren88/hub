package naren.sourcecodes;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SerializeXStream {

	public static void main(String[] args) {

		  XStream xStream = new XStream(new DomDriver());

		  Student student = new Student();

		  student.setId("abc123");
		  student.setName("XYZ");
		
		  //Serializing the object to xml
		  xStream.alias("student", Student.class);
		  String xml = (String) xStream.toXML(student);
		  System.out.println("Serializing the object to xml: \n");
		  System.out.println(xml);
		
		  //Deserializing the object from xml
		  Student stud = (Student) xStream.fromXML(xml);
		  
		  System.out.println("\nDeserializing the object from xml: \n");
		  System.out.println(stud.id);
		  System.out.println(stud.name);

		 }
	
}

/*

Output:

Serializing the object to xml: 

<student>
  <id>abc123</id>
  <name>XYZ</name>
</student>

Deserializing the object from xml: 

XYZ
abc123

*/