package com.max.maxcreditcard.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.max.maxcreditcard.dao.MaxCreditCardDAO;
import com.max.maxcreditcard.model.Applicant;
import com.max.maxcreditcard.model.CreditCard;
import com.max.maxcreditcard.model.Customer;

public class MaxCreditCardService {
	@Autowired
	MaxCreditCardDAO maxCreditCardDAO;
	
	final static Logger logger = Logger.getLogger(MaxCreditCardService.class);

	
	/**
	 * This method is used to save the applicant info in the database by calling appropriate method of DAO.
	 * @param p
	 */
	public void saveApplicant(Applicant p) {
		logger.info("calling saveApplicant emthod for saving the applicant details");
		maxCreditCardDAO.saveApplicant(p);

	}

	
	/**
	 * This method is used for activation of credit card. It calls appropriate method of DAO.
	 * @param cardNumber
	 * @return
	 */
	public int activateCreditCard(String cardNumber) {
		logger.info("calling activateCreditCard emthod for activating the given card");
		return maxCreditCardDAO.activateCreditCard(cardNumber);
	}

	
	/**
	 * This method is used for registering the customer with the given detials.It call appropriate method of DAO.
	 * @param c
	 * @return
	 */
	public int registerCustomer(Customer c) {
		logger.info("calling registerCustomer method for saving the customer detials in database");
		return maxCreditCardDAO.registerCustomer(c);

	}

	
	/**
	 * This method is used to login the customer.It calls appropriate method in DAO. 
	 * @param c
	 * @return
	 */
	public CreditCard loginCustomer(Customer c) {
		logger.info("calling loginCustomer method for login the customer ");
		return maxCreditCardDAO.loginCustomer(c);
	}

}
