package com.spizza.service;

import com.spizza.domain.Customer;

public interface CustomerService {
	Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;

	void add(Customer customer);
}