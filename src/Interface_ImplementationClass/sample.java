package Interface_ImplementationClass;
//sub class or IC
//example of multiple inheritance using interface
public class sample implements I1, I2
{	
	public void m1() 
	{
		System.out.println("method m1 from I1 completed IC");
	}

	public void m2()
	{
		System.out.println("method m2 from I1 completed IC");		
	}
	
	public void m3()
	{
		System.out.println("method m3 from I2 completed IC");	
	}

	public void m4()
	{
		System.out.println("method m4 from I2 completed IC");
		
	}
	
	public static void main(String[] args)
	{
		sample s=new sample();
		s.m1();
		s.m2();
		s.m3();
		s.m4();	
	}
}
