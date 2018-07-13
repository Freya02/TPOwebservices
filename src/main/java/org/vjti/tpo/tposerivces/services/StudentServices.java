package org.vjti.tpo.tposerivces.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vjti.tpo.tposerivces.model.ScheduleModel;
import org.vjti.tpo.tposerivces.model.StudentModel;
import org.vjti.tpo.tposerivces.resources.StudentResources;

@Path("/student")
public class StudentServices {
	StudentResources sr=new StudentResources();
	
	@Path("/schedule")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ScheduleModel> getMessage() throws Exception{
		return sr.getSchedule();
	}
	
	@Path("/register")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String regiserStudent(StudentModel std) throws Exception {
		return sr.regStudent(std);
	}
}
