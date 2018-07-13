package org.vjti.tpo.tposerivces.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CompanyModel {
	int cid;
	String name;
	String location;
	String idate;
	String itime;
	String pyear;
	String ptime;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getIdate() {
		return idate;
	}
	public void setIdate(String idate) {
		this.idate = idate;
	}
	public String getItime() {
		return itime;
	}
	public void setItime(String itime) {
		this.itime = itime;
	}
	public String getPyear() {
		return pyear;
	}
	public void setPyear(String pyear) {
		this.pyear = pyear;
	}
	public String getPtime() {
		return ptime;
	}
	public void setPtime(String ptime) {
		this.ptime = ptime;
	}
	public CompanyModel(int cid, String name, String location, String idate, String itime, String pyear, String ptime) {
		this.cid = cid;
		this.name = name;
		this.location = location;
		this.idate = idate;
		this.itime = itime;
		this.pyear = pyear;
		this.ptime = ptime;
	}
	
	
}
