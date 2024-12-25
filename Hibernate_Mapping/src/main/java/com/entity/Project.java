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
@Table(name="project")
public class Project
{
	@Id
	@Column(name="project_id")
	private int project_id;
	
	@Column(name="name")
	private String name;

	@ManyToMany(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(name="emp_project", joinColumns = @JoinColumn(name="project_id"), inverseJoinColumns = @JoinColumn(name="eid"))
	List<Employee> employees;
	
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Project() 
	{
		
	}

	public Project(int project_id, String name) {
		super();
		this.project_id = project_id;
		this.name = name;
	}

	public int getPid() {
		return project_id;
	}

	public void setPid(int project_id) {
		this.project_id = project_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Project [pid=" + project_id + ", name=" + name + "]";
	}
	
	
}
