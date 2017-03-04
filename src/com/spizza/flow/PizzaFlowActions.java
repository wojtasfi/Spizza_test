package com.spizza.flow;

import static com.spizza.domain.PaymentType.CREDIT_CARD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spizza.domain.CashOrCheckPayment;
import com.spizza.domain.CreditCardPayment;
import com.spizza.domain.Customer;
import com.spizza.domain.Order;
import com.spizza.domain.Payment;
import com.spizza.domain.PaymentDetails;
import com.spizza.service.CustomerNotFoundException;
import com.spizza.service.CustomerService;
import com.spizza.service.OrderService;

@Component
public class PizzaFlowActions {

	@Autowired
	CustomerService customerService;

	@Autowired
	OrderService orderService;
	
	

	public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
		Customer customer = customerService.lookupCustomer(phoneNumber);
		if (customer != null) {
			return customer;
		} else {
			throw new CustomerNotFoundException();
		}
	}

	public void addCustomer(Customer customer) {
		customerService.add(customer);
	}

	public Payment verifyPayment(PaymentDetails paymentDetails) {
		Payment payment = null;
		if (paymentDetails.getPaymentType() == CREDIT_CARD) {
			payment = new CreditCardPayment();
		} else {
			payment = new CashOrCheckPayment();
		}

		return payment;
	}

	public void saveOrder(Order order) {
		orderService.add(order);
	}

	public boolean checkDeliveryArea(String zipCode) {
		
		
		
		if(Integer.parseInt(zipCode) < 60000){
			return false;
		}
		return true;
	}

}
