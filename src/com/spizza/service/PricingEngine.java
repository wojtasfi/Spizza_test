package com.spizza.service;

import com.spizza.domain.Order;

public interface PricingEngine {
  public float calculateOrderTotal(Order order);
}
