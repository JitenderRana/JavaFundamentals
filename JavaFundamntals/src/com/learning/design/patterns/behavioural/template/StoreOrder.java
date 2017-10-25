package com.learning.design.patterns.behavioural.template;

public class StoreOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		// TODO Auto-generated method stub
		System.out.println("checking out store order");
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("paying for store order in cash");
	}

	@Override
	public void doDelivery() {
		System.out.println("delivering the store order");
	}

	@Override
	public void wrapGift() {
		System.out.println("wrapping store gifts in red wrapper");
	}
}
