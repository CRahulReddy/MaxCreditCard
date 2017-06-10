package com.max.maxcreditcard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customer_id;
	private String userName;
	private String password;
	private String cardNumber;
	private int applicant_ID;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCoustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getApplicant_ID() {
		return applicant_ID;
	}

	public void setApplicant_ID(int applicant_ID) {
		this.applicant_ID = applicant_ID;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", userName=" + userName + ", password=" + password
				+ ", cardNumber=" + cardNumber + ", applicant_ID=" + applicant_ID + "]";
	}

}
