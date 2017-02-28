package com.pickshell.demo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

public class XmlTool {

	@Test
	public void obj2XmlTest() {
		Employee employee = new Employee();
		employee.setId(102);
		employee.setAge(21);
		// 尽管name是require的，不设置也不会报错
		employee.setName("Tom");
		employee.gender = "Male";
		employee.addPhone("56234890");
		employee.addPhone("13012459890");

		Department depart = new Department();
		depart.id = "901";
		depart.name = "Sales";
		employee.setDepart(depart);
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			// jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
			// true);

			jaxbMarshaller.marshal(employee, System.out);
			// to string
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			jaxbMarshaller.marshal(employee, os);
			String xml = new String(os.toByteArray(), "UTF-8");
			// System.out.println(xml);
			// end to string
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void xmlxObjTest() {
		try {
			File file = new File("src/main/java/com/pickshell/demo/employee.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Employee employee = (Employee) jaxbUnmarshaller.unmarshal(file);
			System.out.println(employee);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
