package ConstrolStatement;

public class example3_else_if
{
	public static void main(String[] args)
	{
		int marks=33;
		
		if(marks>=65)
		{
			System.out.println("Distinction");
		}
		else if(marks>=60 & marks<=64)                  //60  to 64
		{
			System.out.println("1st class");
		}
		else if(marks>=50 & marks<=59)     //50  to 59
		{
			System.out.println("2nd class");
		}
		else if(marks>=35 & marks<=49)
		{
			System.out.println("Pass");
		}
		else if(marks<35)
		{
			System.out.println("fail");
		}	
	}
}
