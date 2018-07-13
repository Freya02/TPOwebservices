package org.vjti.tpo.tposerivces.model;

public class StudentModel {
	int sid;
	String fname;
	String lname;
	int year;
	int sem;
	String branch;
	String email;
	int cgpa;
	public StudentModel() {}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCgpa() {
		return cgpa;
	}
	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	public StudentModel(int sid, String fname, String lname, int year, int sem, String branch, String email, int cgpa) {
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.year = year;
		this.sem = sem;
		this.branch = branch;
		this.email = email;
		this.cgpa = cgpa;
	}
	
}
