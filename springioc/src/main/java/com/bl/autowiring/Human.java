package com.bl.autowiring;

public class Human {
	private Heart heart;
	
	
	/*
	 * public Human(Heart heart) { this.heart = heart; }
	 */
	 
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setters are ready to work...........");
	}

	public void startPumping()
	{
		if(heart!=null)
		{
			heart.pump();
		}
		else
		{
			System.out.println("Your dead.........");
		}
	}
	
	

}
