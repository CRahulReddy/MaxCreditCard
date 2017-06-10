package com.max.maxcreditcard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCard {

	@Id
	@Column(name = "creditcard_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String creditCardNumber;

	private String nameOnCard;
	private String cvv;
	private String expiryDate;
	private String creditLimit;
	private String cardActivationStatus;

	private int cardOwner_ID;

	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", creditCardNumber=" + creditCardNumber + ", nameOnCard=" + nameOnCard
				+ ", cvv=" + cvv + ", expiryDate=" + expiryDate + ", cardOwner_ID=" + cardOwner_ID + "]";
	}

	public int getCardOwner_ID() {
		return cardOwner_ID;
	}

	public void setCardOwner_ID(int cardOwner_ID) {
		this.cardOwner_ID = cardOwner_ID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getCardActivationStatus() {
		return cardActivationStatus;
	}

	public void setCardActivationStatus(String cardActivationStatus) {
		this.cardActivationStatus = cardActivationStatus;
	}

}
