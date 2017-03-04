package com.spizza.service;

import java.util.ArrayList;
import java.util.List;

import com.spizza.domain.Order;

public class OrderServiceImpl implements OrderService {

	private List<Order> orders;

	public OrderServiceImpl() {
		orders = new ArrayList<Order>();
	}

	@Override
	public void add(Order order) {
		orders.add(order);

	}
}
