package org.vjti.tpo.tposerivces.services;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vjti.tpo.tposerivces.model.StudentModel;
import org.vjti.tpo.tposerivces.resources.CompanyResources;

@Path("/company")
public class CompanyServices {
	
	CompanyResources companyRes=new CompanyResources();
	
	@Path("/shortliststudents")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String submitShortListed(StudentModel studentModel) throws Exception {
		return companyRes.submitShortList(studentModel);
	}
	
	@GET
	@Path("/student/{pointer}")
	public List<StudentModel> getStudentAccCriteria(@PathParam("pointer") int pointer) throws Exception{
		return companyRes.getAllStudent(pointer);
	}
	
}
