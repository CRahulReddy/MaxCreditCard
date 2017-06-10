package com.max.maxcreditcard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.max.maxcreditcard.model.Applicant;
import com.max.maxcreditcard.model.CreditCard;
import com.max.maxcreditcard.model.Customer;
import com.max.maxcreditcard.service.MaxCreditCardService;

/**
 * This is the controller class which has various methods that can handle
 * various requests.
 * 
 * @author Bootcamp User 021
 *
 */
@Controller
public class MaxCreditCardController {

	@Autowired
	private MaxCreditCardService maxCreditCardService;

	final static Logger logger = Logger.getLogger(MaxCreditCardController.class);

	public void setCitiCreditCardService(MaxCreditCardService maxCreditCardService) {
		this.maxCreditCardService = maxCreditCardService;
	}

	
	/**
	 * This method is used to return des.jsp page for displaying to the user.
	 * 
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloWorld() {
		logger.info("displaying of home page");
		return "dex";
	}

	
	/**
	 * This method is used to return apply.jsp page for providing the
	 * application form for the user to enter.
	 * 
	 * @return
	 */
	@RequestMapping("/apply")
	public ModelAndView applyPage() {
		logger.info("displaying of apply page ");
		return new ModelAndView("apply");
	}

	
	/**
	 * This method is used to return activate.jsp page to the cutomer so that he
	 * can enter the detials for activating the credit card.
	 * 
	 * @return
	 */
	@RequestMapping("/activate")
	public ModelAndView activatePage() {
		logger.info("displaying of activate page ");
		return new ModelAndView("activate");
	}

	
	/**
	 * This method is used to return register.jsp page for the customer.
	 */
	@RequestMapping("/register")
	public ModelAndView registerPage() {
		logger.info("displaying of register page ");
		ModelAndView mv = new ModelAndView("register", "message", "Register your credit card.");
		return mv;
	}

	
	/**
	 * This method is used to return apply.jsp page once the customer submits
	 * the application.
	 * 
	 * @param p
	 * @return
	 */
	@RequestMapping(value = "/saveapplicant", method = RequestMethod.POST)
	public ModelAndView saveApplicant(@ModelAttribute Applicant p) {
		maxCreditCardService.saveApplicant(p);
		logger.info("displaying of apply page after saving the applicant details ");
		return new ModelAndView("messagepage","message","Thanks for applying for Max Credit Card.We will send an email once we processed your application.I might take two business days to process the application");
	}

	
	/**
	 * This method is used to return the status of the card activation.
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/card/activation", method = RequestMethod.POST)
	public ModelAndView activateCreditCard(HttpServletRequest request, HttpServletResponse response) {
		String cardNumber = request.getParameter("cardNumber");
		int status = maxCreditCardService.activateCreditCard(cardNumber);
		String message = null;

		if (status == -1) {
			message = "Please enter valid card number";
			logger.info(message);
			return new ModelAndView("activate", "message", message);
		} else if (status == 0) {
			message = "Your card is already activated.";
			logger.info(message);
			return new ModelAndView("activate", "message", message);
		} else {
			message = "Congrats!!!.Your Card is successfully Activated";
			logger.info(message);
			return new ModelAndView("messagepage", "message", message);
		}
	}

	
	/**
	 * This method is used to display appropriate message once the customer
	 * submits the detials for registering the account.
	 * 
	 * @param c
	 * @return
	 */
	@RequestMapping(value = "/registerCoustomer", method = RequestMethod.POST)
	public ModelAndView registerCustomer(@ModelAttribute Customer c) {

		int status = maxCreditCardService.registerCustomer(c);
		if (status == 1) {
			logger.info("Successfull registration");
			return new ModelAndView("messagepage", "message", "You have been successfully registered.");
		} else if (status == 0) {
			logger.info("The given card is already registered");
			return new ModelAndView("register", "message", "This card number is already registered with customer");
		} else {
			logger.info("Wrong card details");
			return new ModelAndView("register", "message", "Please Enter card detials correctly!!");
		}
	}


	/**
	 * This method is used to display appropriate information once the customer
	 * submits the login page.
	 * 
	 * @param c
	 * @return
	 */
	@RequestMapping(value = "/loginCustomer", method = RequestMethod.POST)
	public ModelAndView loginCustomer(@ModelAttribute Customer c) {
		CreditCard creditCard = maxCreditCardService.loginCustomer(c);
		if (creditCard != null) {
			logger.info("Successfull login");
			return new ModelAndView("useraccount", "message", creditCard);
		}
		logger.info("Please enter correct details");
		return new ModelAndView("dex","message","Please enter correct detials.");

	}

}
