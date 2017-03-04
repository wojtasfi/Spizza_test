package com.spizza.service;

import java.util.ArrayList;
import java.util.List;

import com.spizza.domain.Customer;

public class CustomerServiceImpl implements CustomerService {

	private List<Customer> customers;

	public CustomerServiceImpl() {
		customers = new ArrayList<Customer>();
	}

	public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {

		for (Customer customer : customers) {

			
			if (customer.getPhoneNumber().equals(phoneNumber)) {
				Customer newCustomer = new Customer();
				customer.setId(123);
				customer.setName("Craig Walls");
				customer.setAddress("3700 Dunlavy Rd");
				customer.setCity("Denton");
				customer.setArea("TX");
				customer.setZipCode("76210");
				customer.setPhoneNumber(phoneNumber);
				return newCustomer;
			} else {
				throw new CustomerNotFoundException();
			}
		}
		return null;
	}

	@Override
	public void add(Customer customer) {

		customers.add(customer);
	}
}
