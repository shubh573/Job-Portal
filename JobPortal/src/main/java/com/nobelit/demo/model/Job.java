package com.nobelit.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Job")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jid;
	private String jtitle;
	private String compname;
	private int reqexp;
	private String skill;
	
	
	public Job() {
		// TODO Auto-generated constructor stub
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJtitle() {
		return jtitle;
	}
	public void setJtitle(String jtitle) {
		this.jtitle = jtitle;
	}
	public String getCompname() {
		return compname;
	}
	public void setCompname(String compname) {
		this.compname = compname;
	}
	public int getReqexp() {
		return reqexp;
	}
	public void setReqexp(int reqexp) {
		this.reqexp = reqexp;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Job [jid=" + jid + ", jtitle=" + jtitle + ", compname=" + compname + ", reqexp=" + reqexp + ", skill="
				+ skill + "]";
	}
	
}
