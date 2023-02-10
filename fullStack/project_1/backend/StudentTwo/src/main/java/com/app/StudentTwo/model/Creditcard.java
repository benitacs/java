package com.app.StudentTwo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Creditcard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer cardnumber;
	
	@Column
	private String bankName;
	
	@ManyToOne
	@JsonIgnore
	private Customer customer;
	
	@OneToMany(mappedBy="creditcard")
	private List<Purchase> purchase;

	public Creditcard(Integer id, Integer cardnumber, String bankName) {
		super();
		this.id = id;
		this.cardnumber = cardnumber;
		this.bankName = bankName;
	}

	public Creditcard() {
		super();
	}

	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Purchase> getPurchase() {
		return purchase;
	}

	public void setPurchase(List<Purchase> purchase) {
		this.purchase = purchase;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(Integer cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Creditcard [id=" + id + ", cardnumber=" + cardnumber + ", bankName=" + bankName + "]";
	}
	
	

}
