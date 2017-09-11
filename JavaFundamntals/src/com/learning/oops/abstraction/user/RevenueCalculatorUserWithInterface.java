package com.learning.oops.abstraction.user;

import com.learning.oops.abstraction.model.ClientEngagement;
import com.learning.oops.abstraction.model.FixedRateRevenueCalculator;
import com.learning.oops.abstraction.model.HourlyRevenueCalculator;
import com.learning.oops.abstraction.model.RoyaltyRevenueCalculator;

public class RevenueCalculatorUserWithInterface {

	public static void main(String[] args) {
		
		ClientEngagement ce = new ClientEngagement(1, "Ericsson", 200);
		System.out.println(new HourlyRevenueCalculator().calculateRevenue(ce));
		System.out.println(new FixedRateRevenueCalculator().calculateRevenue(ce));
		System.out.println(new RoyaltyRevenueCalculator().calculateRevenue(ce));

	}

}
