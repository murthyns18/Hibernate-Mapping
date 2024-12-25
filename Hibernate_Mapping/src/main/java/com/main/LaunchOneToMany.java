package com.main;

import com.entity.Customer;
import com.entity.CustomerDetails;
import com.entity.Orders;

import hibernatemanager.HibernateManager;

public class LaunchOneToMany
{

	public static void main(String[] args)
	{
		Customer c = new Customer(4,"Charli");
		CustomerDetails cd = new CustomerDetails(504,"charli@gmail.com",326545454);
		HibernateManager hm = new HibernateManager();
			
		//Adding Customer Details to Customer
		c.setCustomerDetails(cd);

		
		Orders o1 = new Orders(704,"Pizza", 200);
		Orders o2 = new Orders(705,"Burger", 300);
		Orders o3 = new Orders(706,"Chapati", 300);
		
		//Fetch customer object
				
		o1.setCustomer(c);
		o2.setCustomer(c);
		o3.setCustomer(c);
//		
//		hm.insertOrders(o1);
//		hm.insertOrders(o2);
//		hm.insertOrders(o3);
		
		hm.deleteOrders(701);
	}

}
