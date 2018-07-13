package org.vjti.tpo.tposerivces.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.vjti.tpo.tposerivces.model.ScheduleModel;
import org.vjti.tpo.tposerivces.model.StudentModel;

public class StudentResources {
	
	Connection conn=null;
	public List<ScheduleModel> getSchedule() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tpo", "root", "");
		Statement stmt=conn.createStatement();
		ResultSet res=stmt.executeQuery("SELECT * FROM `schedule`");
		List<ScheduleModel> list=new ArrayList<>();
		while(res.next()) {
			ScheduleModel m=new ScheduleModel();
			m.setBranch(res.getString(3));
			m.setCname(res.getString(2));
			m.setDate(res.getString(1));
			m.setTime(res.getString(4));
			m.setYear(res.getString(5));
			list.add(m);
		}
		return list;
	}
	
	public String regStudent(StudentModel std) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tpo", "root", "");
		Statement stmt=conn.createStatement();
		String query="INSERT INTO `student`(`sid`, `fname`, `lname`, `year`, `sem`, `branch`, `email`, `cgpa`) VALUES ("+std.getSid()+",'"+std.getFname()+"','"+std.getLname()+"',"+std.getYear()+","+std.getSem()+",'"+std.getBranch()+"','"+std.getEmail()+"','"+std.getCgpa()+"')";
		stmt.executeUpdate(query);
		return "Insert was successful";
	}
	
}
