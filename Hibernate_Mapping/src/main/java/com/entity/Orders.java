package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders 
{
	@Id
	@Column(name="oid")
	private int oid;
	
	@Column(name="item")
	private String item;
	
	@Column(name="price")
	private int price;
	
	@JoinColumn(name="c_id")
	@ManyToOne(cascade=CascadeType.ALL)
	private Customer customer;
	
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Orders(int oid, String item, int price) {
		super();
		this.oid = oid;
		this.item = item;
		this.price = price;
	}
	public Orders() {
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", item=" + item + ", price=" + price + "]";
	}
	
	
	
}
