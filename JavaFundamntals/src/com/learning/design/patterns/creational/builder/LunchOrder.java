package com.learning.design.patterns.creational.builder;

public class LunchOrder {
	
	private final String bread;
	private final String condiments;
	private final String sweets;
	
	
	public static class Builder{
		
		private String bread;
		private String condiments;
		private String sweets;
		
		public Builder(){}
		
		public Builder bread(String bread)
		{
			this.bread = bread;
			return this;
		}		
		public Builder condiments(String condiments)
		{
			this.condiments = condiments;
			return this;
		}		
		public Builder sweets(String sweets)
		{
			this.sweets = sweets;
			return this;
		}			
		public LunchOrder build()
		{
			return new LunchOrder(this);
		}
	}
	
	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.sweets = builder.sweets;
		this.condiments = builder.condiments;
	}
	
	public String getBread() {
		return bread;
	}
	
	public String getCondiments() {
		return condiments;
	}
	
	public String getSweets() {
		return sweets;
	}
	
}
