package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer 
{
	@Id
	@Column(name="cid")
	private int cid;
	
	@Column(name="name")
	private String name;
	
	@JoinColumn(name="cdid")
	@OneToOne(cascade=CascadeType.ALL)
	private CustomerDetails customerDetails;
	
	
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	List<Orders>orders;

	
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	
	public Customer() {
	}
	
	public Customer(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}


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


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + "]";
	}
	
	
}
