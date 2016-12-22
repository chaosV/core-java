package jaxb10;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class JaxbSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setName("zz");
		student.setGender("m");
		student.setName("21");
		student.setId("111");
		
		JAXBContext ctx;
		try {
			ctx=JAXBContext.newInstance(Student.class);
			ctx.createMarshaller().marshal(student, new File("student.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
