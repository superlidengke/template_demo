package com.pickshell.demo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//此注解不可少
@XmlRootElement(name = "MessageRequest")
public class MessageRequest {
	@XmlElement(name = "name")
	public String name;

	public String age;

}
/*
 * <MessageRequest> <name>Tom</name> <age>29</age> </MessageRequest>
 */