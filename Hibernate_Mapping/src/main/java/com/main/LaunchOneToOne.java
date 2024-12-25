package com.main;

import com.entity.Customer;
import com.entity.CustomerDetails;
import com.entity.Orders;

import hibernatemanager.HibernateManager;

public class LaunchOneToOne 
{

	public static void main(String[] args) 
	{
		Customer c = new Customer(6,"venkat");
		CustomerDetails cd = new CustomerDetails(506,"v@gmail.com",326545454);
		HibernateManager hm = new HibernateManager();
			
		//Adding Customer Details to Customer
		c.setCustomerDetails(cd);
		
		
//		hm.addCustomer(c);
		
		cd.setCustomer(c);
		
		hm.addCustomerDetails(cd);
		System.out.println("Done");
		
		
	}

}
