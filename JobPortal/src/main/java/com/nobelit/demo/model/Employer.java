package com.nobelit.demo.model;

//import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Employer")
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int compid;
	private String compname;
	private String cpswd;
	private String compaddress;
	private String website;
//	@OneToMany
//	private List<Job> job = new ArrayList<Job>();
	
	public Employer() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCompid() {
		return compid;
	}
	public void setCompid(int compid) {
		this.compid = compid;
	}
	public String getCompname() {
		return compname;
	}
	public void setCompname(String compname) {
		this.compname = compname;
	}
	public String getCompaddress() {
		return compaddress;
	}
	public void setCompaddress(String compaddress) {
		this.compaddress = compaddress;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getCpswd() {
		return cpswd;
	}
	public void setCpswd(String cpswd) {
		this.cpswd = cpswd;
	}
	
//	public List<Job> getJob() {
//		return job;
//	}
//	public void setJob(List<Job> job) {
//		this.job = job;
//	}
	
	@Override
	public String toString() {
		return "Employer [compid=" + compid + ", compname=" + compname + ", compaddress=" + compaddress + ", website="
				+ website + "]";
	}
}
