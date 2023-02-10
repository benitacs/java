package com.app.StudentTwo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Purchase {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String purchasedetail;

	
	@ManyToOne
	@JsonIgnore
	private Creditcard creditcard;

	public Purchase(Integer id, String purchasedetail) {
		super();
		this.id = id;
		this.purchasedetail = purchasedetail;
	}

	public Purchase() {
		super();
	}
	
	

	public Creditcard getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(Creditcard creditcard) {
		this.creditcard = creditcard;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPurchasedetail() {
		return purchasedetail;
	}

	public void setPurchasedetail(String purchasedetail) {
		this.purchasedetail = purchasedetail;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", purchasedetail=" + purchasedetail + "]";
	}

}
