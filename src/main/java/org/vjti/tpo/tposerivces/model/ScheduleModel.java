package org.vjti.tpo.tposerivces.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ScheduleModel {

	String date;
	String cname;
	String branch;
	String time;
	String year;
	public ScheduleModel(String date, String cname, String branch, String time, String year) {
		this.date = date;
		this.cname = cname;
		this.branch = branch;
		this.time = time;
		this.year = year;
	}
	public ScheduleModel() {}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
}
