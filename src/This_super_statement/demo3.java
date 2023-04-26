package This_super_statement;

public class demo3 extends demo2
{
	//Example of super statement
	demo3()
	{
		super(10,20);
		System.out.println("running sub class constructor");
	}
		
	
	public static void main(String[] args)
	{	
		demo3 d3=new demo3();	
	}
}
