package com.pickshell.demo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	@XmlElement
	public String gender;
	private String name;
	private int age;
	private int id;
	private Department depart;

	@XmlElementWrapper(name = "phones")
	@XmlElement(name = "phone")
	List<String> phones;

	@XmlElement(required = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void addPhone(String phoneNumber) {
		if (phones == null) {
			phones = new ArrayList<String>();
		}
		phones.add(phoneNumber);
	}

	public Department getDepart() {
		return depart;
	}

	public void setDepart(Department depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ",name=" + name + ",age=" + age + "]";
	}
}
