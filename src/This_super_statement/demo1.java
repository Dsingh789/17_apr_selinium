package This_super_statement;
public class demo1
{
	//example of this statement	
	demo1()
	{
		this(10,20);
		System.out.println("running without parameter constructor");		
	}
		
	demo1(String s1)
	{
		System.out.println("running String parameter constructor");
	}
	
	demo1(int a, int b)
	{
		this("abc");
		System.out.println("running 2 int parameter constructor");
	}
			
	public static void main(String[] args)
	{
		demo1 d1=new demo1();
	}
}
