package com.bl.objects;

public class AnotherStudent
{
	private MathsSubject mathsSub;

	public void setMathsSub(MathsSubject mathsSub) {
		this.mathsSub = mathsSub;
	}
	public void detailsEntire()
	{
		mathsSub.mathsDetails();
	}
}
