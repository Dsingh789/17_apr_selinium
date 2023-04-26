package Generalization;
public class TestGeneralization
{
	public static void main(String[] args) 
	{
		System.out.println("---Features of Jio Simcard----");
		Jio j=new Jio();
		j.sms();
		j.ac();
		j.data();
		j.newFeatureA();
				
		System.out.println("---Features of Airtel Simcard----");
		Airtel a=new Airtel();
		a.sms();
		a.ac();
		a.data();
		a.newFeatureC();
				
		System.out.println("---Features of VI Simcard----");
		VI v=new VI();
		v.sms();
		v.ac();
		v.data();
		v.newFeatureB();
	}
}
