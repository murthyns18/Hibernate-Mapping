package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class CustomerDetails 
{
	@Id
	@Column(name="cdid")
	private int cdid;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private int phone;
	
	
	@OneToOne(mappedBy = "customerDetails" ,cascade = CascadeType.ALL)
	private Customer customer;
	
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerDetails(Customer customer) {
		super();
		this.customer = customer;
	}

	public CustomerDetails() {
	}
	
	public CustomerDetails(int cdid, String email, int phone) {
		super();
		this.cdid = cdid;
		this.email = email;
		this.phone = phone;
	}

	public int getCdid() {
		return cdid;
	}

	public void setCdid(int cdid) {
		this.cdid = cdid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CustomerDetails [cdid=" + cdid + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
}
