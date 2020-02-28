package com.nobelit.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	private String uname;
	private String upswd;
	private String uaddress;
	private long ucontact;
	private String qualification;
	private int experience;
//	@OneToMany
//	private List<Job> job = new ArrayList<Job>();
	
	public User(String uname, String upswd, String uaddress, long ucontact, String qualification, int experience) {
		super();
		this.uname = uname;
		this.upswd = upswd;
		this.uaddress = uaddress;
		this.ucontact = ucontact;
		this.qualification = qualification;
		this.experience = experience;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpswd() {
		return upswd;
	}
	public void setUpswd(String upswd) {
		this.upswd = upswd;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public long getUcontact() {
		return ucontact;
	}
	public void setUcontact(long ucontact) {
		this.ucontact = ucontact;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
//	public List<Job> getJob() {
//		return job;
//	}
//	public void setJob(List<Job> job) {
//		this.job = job;
//	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", uname=" + uname + ", upswd=" + upswd + ", uaddress=" + uaddress
				+ ", ucontact=" + ucontact + ", qualification=" + qualification + ", experience=" + experience + "]";
	}
}
