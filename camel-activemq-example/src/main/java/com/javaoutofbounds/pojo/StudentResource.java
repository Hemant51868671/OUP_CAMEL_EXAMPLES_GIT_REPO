package com.javaoutofbounds.pojo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class StudentResource {

	public StudentResource() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("/{name}")
	public String getStudent(@PathParam("name")String name){
		return "Hello Active Mq !!!!!";
	}
	
	@POST
	@Path("/sendStudentJson")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public StudentDetails saveStudentJson(StudentDetails inputDetail) {
		return inputDetail;
	}
	
	@POST
	@Path("/sendStudentXml")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public StudentXml sendStudentXml(StudentXml inputDetail) {
		return inputDetail;
	}
}
