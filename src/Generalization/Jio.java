package Generalization;
//IC1
public class Jio implements Simcard
{
	public void sms() 
	{
		System.out.println("sms: 100");
	}

	public void ac()
	{
		System.out.println("ac: 500");
	}

	public void data() 
	{
		System.out.println("data: 1GB");
	}
	
	public void newFeatureA()
	{
		System.out.println("newFeature: A");
	}
}
