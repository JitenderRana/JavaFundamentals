package com.learning.design.patterns.behavioural.template;

//template class
public abstract class OrderTemplate {

	private boolean isGift;

	public abstract void doCheckout();

	public abstract void doPayment();

	public abstract void doDelivery();

	public abstract void wrapGift();

	// algorithum havings various steps, this is final to make sure algo remains
	// same throughout all implementations, only the algo steps should change
	public final void processOrder() {
		doCheckout();
		doPayment();
		if (isGift) {
			wrapGift();
		}
		doDelivery();
	}
}
