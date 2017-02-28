package com.pickshell.demo;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messageService")
public class XmlService {

	public XmlService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@POST
	@Path("/search")
	@Consumes("application/xml")
	@Produces(MediaType.APPLICATION_XML)
	public MessageResponse search(MessageRequest req) throws Exception {
		String mess = req.name + "," + req.age;
		MessageResponse res = new MessageResponse();
		res.result = mess;
		return res;
	}
}
