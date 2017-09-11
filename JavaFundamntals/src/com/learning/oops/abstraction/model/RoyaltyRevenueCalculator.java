package com.learning.oops.abstraction.model;

public class RoyaltyRevenueCalculator implements RevenueCalculator {

	private int royaltyRate = 500;
	
	@Override
	public int calculateRevenue(ClientEngagement ce) {		
		return royaltyRate;
	}

}
