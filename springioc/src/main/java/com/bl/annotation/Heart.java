package com.bl.annotation;

public class Heart {
	private String name;
	private int noOfHearts; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfHearts() {
		return noOfHearts;
	}

	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}

	public void pump()
	{
		System.out.println("Heart is pumping blood.....");
		System.out.println("You alive....");
	}
}
