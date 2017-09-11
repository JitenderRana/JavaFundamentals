package com.learning.oops.abstraction.model;

public class HourlyRevenueCalculator implements RevenueCalculator {

	private int hourlyRate = 500;
	
	@Override
	public int calculateRevenue(ClientEngagement ce) {
		return ce.getNoOfHourWorked()*hourlyRate;
	}

}
