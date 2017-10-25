package com.learning.design.patterns.behavioural.template;

public class WebOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		// TODO Auto-generated method stub
		System.out.println("checking out web order");
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("paying for web order");
	}

	@Override
	public void doDelivery() {
		System.out.println("delivering the web order");
	}

	@Override
	public void wrapGift() {
		System.out.println("wrapping web gifts in green wrapper");
	}

}
