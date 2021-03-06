package org.vjti.tpo.tposerivces.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import org.vjti.tpo.tposerivces.model.ScheduleModel;
import org.vjti.tpo.tposerivces.model.StudentModel;

public class TPOResources {
	Connection conn=null;
	public List<StudentModel> getAllStudent() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tpo", "root", "");
		Statement stmt=conn.createStatement();
		ResultSet res=stmt.executeQuery("SELECT * FROM `student`");
		List<StudentModel> list=new ArrayList<>();
		while(res.next()) {
			StudentModel m=new StudentModel();
			m.setSid(res.getInt(1));
			m.setFname(res.getString(2));
			m.setLname(res.getString(3));
			m.setYear(res.getInt(4));
			m.setSem(res.getInt(5));
			m.setBranch(res.getString(6));
			m.setEmail(res.getString(7));
			m.setCgpa(res.getInt(8));
			list.add(m);
		}
		return list;
	}
	
	public String insertSchedule(ScheduleModel scheduleModel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tpo", "root", "");
		Statement stmt=conn.createStatement();
		String query="INSERT INTO `schedule`(`idate`, `cname`, `branch`, `itime`, `year`) VALUES ('"+scheduleModel.getDate()+"','"+scheduleModel.getCname()+"','"+scheduleModel.getBranch()+"','"+scheduleModel.getTime()+"','"+scheduleModel.getYear()+"')";
		stmt.executeUpdate(query);
		return "Insert was successful";
	}
	
}
