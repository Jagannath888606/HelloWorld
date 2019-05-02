package com.bl.loosecoupling;

public class AirtelServiceCenter
{
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	public void serviceAlerts()
	{
		service.services();
	}
}
