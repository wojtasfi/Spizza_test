package com.spizza.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.spizza.domain.Order;
import com.spizza.domain.Pizza;
import com.spizza.domain.PizzaSize;

@SuppressWarnings("serial")
public class PricingEngineImpl 
    implements PricingEngine, Serializable {
  private static final Logger LOGGER = 
      Logger.getLogger(PricingEngineImpl.class);
  
  private static Map<PizzaSize, Float> SIZE_PRICES;
  static {
    SIZE_PRICES = new HashMap<PizzaSize, Float>();
    SIZE_PRICES.put(PizzaSize.SMALL, 6.99f);
    SIZE_PRICES.put(PizzaSize.NORMAL, 7.99f);
    SIZE_PRICES.put(PizzaSize.BIG, 8.99f);
    SIZE_PRICES.put(PizzaSize.BIG, 9.99f);
  }
  private static float PRICE_PER_TOPPING = 0.20f;
  
  public PricingEngineImpl() {}
  
  public float calculateOrderTotal(Order order) {
    LOGGER.debug("Liczymy caÅ‚kowitÄ… kwotÄ™ zamÃ³wienia");
    
    float total = 0.0f;
    
    for (Pizza pizza : order.getPizzas()) {
      float pizzaPrice = SIZE_PRICES.get(pizza.getSize());
      if(pizza.getToppings().size() > 2) {
        pizzaPrice += (pizza.getToppings().size() * 
            PRICE_PER_TOPPING);
      }
      total += pizzaPrice;
    }
    
    return total;
  }
}
