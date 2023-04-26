package Methods;

public class sample1 
{
	
	//main method
	public static void main(String[] args)   //pre-defined method  //method declaration
	{
		   System.out.println("hi"); //method body
		   
		   //1: static regular method call from same class
		   m1();      // methodname();
		   
		  //2: static regular method call from diff class
		   sample2.m2();     //diffclassname.methodname()
		   
		   //3: non-static regular method call from same class
		    //classname objectname=new classname();     //syntax of object creation 
		   sample1 s1=new sample1();
		   s1.m3();
		   
		   sample2 s2=new sample2();
		   s2.m4();
		   
		   System.out.println("Hello");
	}
	
	
	//static ->regular method
	public static void m1()   //user defined
	{
		System.out.println("running static regular method m1 from same class");
	}
	
	
	//non-static ->regular method
	public void m3()   //user defined
	{
		System.out.println("running non-static regular method m3 from same class");
	}	
}
