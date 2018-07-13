package org.vjti.tpo.tposerivces.services;

import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vjti.tpo.tposerivces.model.ScheduleModel;
import org.vjti.tpo.tposerivces.model.StudentModel;
import org.vjti.tpo.tposerivces.resources.TPOResources;

@Path("/tpo")
public class TPOServices {

	//TPOServices tpoServ=new TPOServices();
	TPOResources TPORes=new TPOResources();
	@GET
	@Path("/studentrecord")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentModel> getAllStudentData() throws Exception{
		return TPORes.getAllStudent();
	}
	
	@Path("/schedule")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String submitShortListed(ScheduleModel scheduleModel) throws Exception {
		return TPORes.insertSchedule(scheduleModel);
	}
	
}
