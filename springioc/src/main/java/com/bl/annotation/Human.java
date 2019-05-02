package com.bl.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("heart")
	private Heart heart;

	/*
	 * public Human() { }
	 * 
	 * public Human(Heart heart) { this.heart = heart;
	 * System.out.println("Your constructor has activated"); }
	 * 
	 * 
	 * public void setHeart(Heart heart) { this.heart = heart;
	 * System.out.println("Setters are ready to work..........."); }
	 */
	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println(
					"Name of person: " + heart.getName() + " and Number of hearts are: " + heart.getNoOfHearts());
		} else {
			System.out.println("Your dead.........");
		}
	}

}
