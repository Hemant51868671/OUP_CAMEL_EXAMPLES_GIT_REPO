package com.javaoutofbounds.pojo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class StudentResource {

	StudentResource(){

	}
	
	@GET
	@Path("/welcome1")
	@Produces(MediaType.APPLICATION_JSON)
	public String welcomeStudent(){
		return "Welcome to Student Rest Service";
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public StudentDetails getStudent(@PathParam("id")String id){
		StudentDetails sd1 = new StudentDetails();
		sd1.setId("101");
		sd1.setName("Sam Wood");
		sd1.setGrade("B");
		sd1.setMarks(65.78);
		System.out.println("Student details returned =================== "+sd1.toString());
		return sd1;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public StudentDetails saveStudent(StudentDetails inputDetail) {
		System.out.println("Student details returned =================== "+inputDetail.toString());
		return inputDetail;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public StudentXml saveStudentXml(StudentXml inputDetail) {
		return inputDetail;
	}
}
