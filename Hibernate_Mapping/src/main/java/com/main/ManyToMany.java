package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;
import com.entity.CustomerDetails;
import com.entity.Employee;
import com.entity.Orders;
import com.entity.Project;

import hibernatemanager.HibernateManager;

public class ManyToMany
{

	public static void main(String[] args) 
	{
	Session	session = new Configuration().
				configure().
				addAnnotatedClass(Customer.class).
				addAnnotatedClass(CustomerDetails.class).
				addAnnotatedClass(Orders.class).
				addAnnotatedClass(Employee.class).
				addAnnotatedClass(Project.class).
				buildSessionFactory().
				openSession();
		
		HibernateManager hm = new HibernateManager();
		
		Employee e1 = new Employee(1,"Alex","alex@gmail.com");
		Employee e2 = new Employee(2, "bob", "bob@gmail.com");
		Employee e3 = new Employee(3, "Charli", "charli@gmail.com");
		
		Project p1 = new Project(1, "FoodApp");
		Project p2 = new Project(2, "E-commerce");

		List<Employee> project1 = new ArrayList<Employee>();
		List<Employee> project2 = new ArrayList<Employee>();
		
		
		//Adding employees to projects
		project1.add(e1);
		project1.add(e2);
		project1.add(e3);
		
		project2.add(e2);
		project2.add(e3);
		
		//Set employee object to projects using setters
		p1.setEmployees(project1);
		p2.setEmployees(project2);
		
		session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		session.save(p1);
		session.save(p2);
		
		
	}

}
