package com.learning.oops.abstraction.model;

public class FixedRateRevenueCalculator implements RevenueCalculator {
	
	private int fixedRate = 50;

	@Override
	public int calculateRevenue(ClientEngagement ce) {
		return ce.noOfHourWorked*fixedRate;
	}

}
