package com.learning.oops.abstraction.user;

import com.learning.oops.abstraction.model.ClientEngagement;

public class RevenueCalculatorWithoutInterface {

	private int hourlyRate = 500;
	private int fixedRate = 50;
	private int royaltyRate = 500;

	public static void main(String[] arr) {
		ClientEngagement ce = new ClientEngagement(1, "Ericsson", 200);

		RevenueCalculatorWithoutInterface rc = new RevenueCalculatorWithoutInterface();
		System.out.println(rc.calculateRevenue(ce, "hourly"));
		System.out.println(rc.calculateRevenue(ce, "fixed_rate"));
		System.out.println(rc.calculateRevenue(ce, "royalty"));

	}

	private int calculateRevenue(ClientEngagement ce, String method) {

		switch (method) {
		case "hourly":
			return ce.getNoOfHourWorked() * hourlyRate;
		case "fixed_rate":
			return ce.getNoOfHourWorked() * fixedRate;
		case "royalty":
			return royaltyRate;
		default:
			throw new IllegalArgumentException("Please use correct method as an argument");
		}

	}

}
