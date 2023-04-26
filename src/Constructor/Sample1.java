package Constructor;

public class Sample1
{		
	//1: example of default constructor
	
	//default constructor  --> provided by compiler
//	Sample1()
//	{
//		
//	}
		
	public static void main(String[] args) 
	{	
		Sample1 s1=new Sample1();
		s1.m1();
		
		//1: Sample1  --> classname  --> datatype
		//2:  s1   --> objetName   --> to identify object
		//3: new  --> keyword  -->  to create blank/empty object
		//4: Sample1() --> classname()  --> constructor call  --> 	use to copy all the members of class into object
		
		Sample2 s2=new Sample2();
		s2.m2();
	}
		
	public void m1()
	{
		System.out.println("running method m1");
	}
}
