package com.spizza.domain;


public class CashOrCheckPayment extends Payment {
  public CashOrCheckPayment() {}
  
  public String toString() {
    return "CASH or CREDIT CARD:  $" + getAmount();
  }

private String getAmount() {
	// TODO Auto-generated method stub
	return null;
}
}
