package com.sandy.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sandy.model.User;

@Path("/xml/user")
public class XmlService {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public User generateXml()
	{
		User user = new User();
		user.setAge("10");
		user.setUserName("user");
		return user;
	}
}
