package com.pickshell.demo;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/json")
public class JsonService {

	@POST
	@Path("/search")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public JsonResponse search(JsonRequest req) throws Exception {
		String mess = req.name + "," + req.age;
		JsonResponse res = new JsonResponse();
		res.result = mess;
		return res;
	}
}
