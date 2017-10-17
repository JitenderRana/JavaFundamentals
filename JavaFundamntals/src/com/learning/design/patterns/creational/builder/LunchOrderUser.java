package com.learning.design.patterns.creational.builder;

public class LunchOrderUser {

	public static void main(String[] args) {
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread(null).condiments("ketchup").sweets("sweets");		
		LunchOrder lunchOrder = builder.build();		
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getSweets());
		System.out.println(lunchOrder.getBread());
	}

}
