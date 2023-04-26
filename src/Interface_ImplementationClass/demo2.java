package Interface_ImplementationClass;

//IC or sub class 
public class demo2 implements demo1
{	
	public void m1()
	{
		System.out.println("method m1 completed in IC");
	}
	
	public void m2()
	{
		System.out.println("method m2 completed in IC");
	}
	
	public static void main(String[] args)
	{
		demo2 d2=new demo2();
		d2.m1();
		d2.m2();
		
	}
}
