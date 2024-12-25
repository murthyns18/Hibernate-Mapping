package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@Column(name="eid")
	private int eid;
	
	@Column(name="name")
	private String name;
	
	@ManyToMany(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(name="emp_project", joinColumns = @JoinColumn(name="eid"), inverseJoinColumns = @JoinColumn(name="project_id"))
	List<Project> projects ;
	
	
	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Column(name="email")
	private String email;
	
	public Employee() {
	}

	public Employee(int eid, String name, String email) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
	}
	
	
	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
