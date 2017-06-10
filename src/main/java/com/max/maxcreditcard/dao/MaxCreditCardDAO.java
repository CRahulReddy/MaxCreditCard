package com.max.maxcreditcard.dao;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.max.maxcreditcard.model.Applicant;
import com.max.maxcreditcard.model.CreditCard;
import com.max.maxcreditcard.model.Customer;

@Transactional
public class MaxCreditCardDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	final static Logger logger = Logger.getLogger(MaxCreditCardDAO.class);


	public void setSessionFactory(SessionFactory sf) {
		
		this.sessionFactory = sf;
	}

	public void saveApplicant(Applicant p) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);

	}

	
	/**
	 * This method is used to activate the creditcard
	 * @param cardNumber
	 * @return
	 */
	public int activateCreditCard(String cardNumber) {
		Session session = this.sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Query query = session.createQuery("FROM CreditCard WHERE creditCardNumber = :cardNumber");
		query.setString("cardNumber", cardNumber);
		CreditCard creditCard = (CreditCard) query.uniqueResult();

		if (creditCard != null) {
			if (creditCard.getCardActivationStatus().equals("new")) {
				creditCard.setCardActivationStatus("activated");
				session.update(creditCard);
				logger.info("activation of creditcard is done");
				t.commit();
				session.close();

				return 1;// card activated
			} else {
				logger.info("card is already activated");
				return 0;// card is already activated
			}

		}

		return -1;// not a valid card number
	}

	
	/**
	 * This method is used to register the customer.
	 * @param c
	 * @return
	 */
	public int registerCustomer(Customer c) {
		System.out.println(c);
		String cardNumber = c.getCardNumber();
		Session session = this.sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("FROM Customer WHERE cardNumber = :cardNumber");
		query.setString("cardNumber", cardNumber);
		Customer customer = (Customer) query.uniqueResult();
		if (customer != null) {
			t.commit();
			session.close();
			logger.info("card is already registered with user");
			return 0;// card is already registered with customer
		}
		query = session.createQuery("FROM CreditCard WHERE creditCardNumber = :cardNumber");
		query.setString("cardNumber", cardNumber);
		CreditCard creditCard = (CreditCard) query.uniqueResult();
		System.out.println(creditCard);

		if (creditCard != null) {
			c.setApplicant_ID(creditCard.getCardOwner_ID());
			session.persist(c);

			t.commit();
			session.close();
			logger.info("customer detials like username, password are succesfully stored in database");
			return +1;// cardNumber exists in the database so customer login
						// detials are stored in database
		}
		t.commit();
		session.close();
		logger.info("There is no creditcard with the given credit card inofrmation");
		return -1;// there is no creditcard with the given number in the
					// database
	}

	
	/**
	 * This method is used for login the customer.
	 * @param c
	 * @return
	 */
	public CreditCard loginCustomer(Customer c) {
		Session session = this.sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("FROM Customer WHERE userName = :userName and password=:password");
		query.setString("userName", c.getUserName());
		query.setString("password", c.getPassword());
		Customer customer = (Customer) query.uniqueResult();
		t.commit();
		session.close();

		if (customer != null) {
			session = this.sessionFactory.openSession();
			t = session.beginTransaction();
			query = session.createQuery("FROM CreditCard WHERE creditCardNumber = :cardNumber");
			query.setString("cardNumber", customer.getCardNumber());
			CreditCard creditCard = (CreditCard) query.uniqueResult();
			t.commit();
			session.close();
			logger.info("after login, the creditcard detils are displayed to the user");
			logger.info(creditCard);
			return creditCard;
		}
		logger.info("the details provided by the customer are invalid");
		return null;
	}

}
