package hibernatemanager;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;
import com.entity.CustomerDetails;
import com.entity.Orders;

public class HibernateManager 
{
	static Session session = null;
	static
	{
		session = new Configuration().
		configure().
		addAnnotatedClass(Customer.class).
		addAnnotatedClass(CustomerDetails.class).
		addAnnotatedClass(Orders.class).
		buildSessionFactory().
		openSession();
	}

	//One To One
	//Add Customer
	public void addCustomer(Customer customer)
	{
		session.beginTransaction();
		session.persist(customer);
		session.getTransaction().commit();
	}


	public void addCustomerDetails(CustomerDetails cd) 
	{
		session.beginTransaction();
		session.persist(cd);
		session.getTransaction().commit();
		
	}
	
	//One To Many
	//Inserting
	public void insertOrders(Orders o)
	{
		session.beginTransaction();
		session.persist(o);
		session.getTransaction().commit();
	}
	
	//Deleting
	public void deleteOrders(int id)
	{
		session.beginTransaction();
		Orders order = session.get(Orders.class, id);
		session.delete(order);
		session.getTransaction().commit();
	}
	
	
	//Many to Many written in main
	
	
}
