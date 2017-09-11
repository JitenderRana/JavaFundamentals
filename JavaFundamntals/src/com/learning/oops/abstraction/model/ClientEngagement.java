package com.learning.oops.abstraction.model;

public class ClientEngagement {
	
	Integer clientId;
	String clientName;
	int noOfHourWorked;
	
	public ClientEngagement(Integer clientId, String clientName, int noOfHourWorked) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.noOfHourWorked = noOfHourWorked;
	}
	
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getNoOfHourWorked() {
		return noOfHourWorked;
	}
	public void setNoOfHourWorked(int noOfHourWorked) {
		this.noOfHourWorked = noOfHourWorked;
	}

}
