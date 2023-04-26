package Casting;
public class Upcasting 
{
	public static void main(String[] args)
	{		
		//create an object of subclass with reference(datatype) of super class	
		Father s=new Son();
		//s.bike();
		s.car();
		s.money();
		s.home();	
	}
}
