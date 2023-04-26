package Generalization;
//IC3
public class Airtel implements Simcard 
{
	public void sms() 
	{
		System.out.println("sms: 200");
	}

	public void ac()
	{
		System.out.println("ac: 700");
	}

	public void data() 
	{
		System.out.println("data: 3GB");
	}
	
	public void newFeatureC()
	{
		System.out.println("newFeature: C");
	}
}
