package Generalization;
//IC2
public class VI implements Simcard
{	
	public void sms() 
	{
		System.out.println("sms: 150");
	}

	public void ac()
	{
		System.out.println("ac: 600");
	}

	public void data() 
	{
		System.out.println("data: 2GB");
	}
	
	public void newFeatureB()
	{
		System.out.println("newFeature: B");
	}
}
