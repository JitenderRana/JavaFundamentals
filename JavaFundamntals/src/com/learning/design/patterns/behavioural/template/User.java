package com.learning.design.patterns.behavioural.template;

public class User {

	public static void main(String[] args) {
		
		OrderTemplate order = new WebOrder();		
		order.processOrder();
		
		OrderTemplate order1 = new StoreOrder();
		order1.processOrder();
	}

}
