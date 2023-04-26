package PolyMorphism;
//child/sub class
public class Son extends Father
{
	//example of method override
	
	public void bike() 
	{
		System.out.println("bike: FZ V3");
	}
	
	public void car()    //override
	{
		System.out.println("Car: Kia");
	}
	
	public void money()    //override
	{
		System.out.println("money: 2L");
	}

//	public void home() 
//	{
//		System.out.println("home: 2BHK");
//	}
	
		
	public static void main(String[] args)
	{
//		Father f=new Father();
//		f.car();
//		f.money();
//		f.home();
		
		Son s=new Son();
		s.car();
		s.money();
		s.home();	
	}
}
