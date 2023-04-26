package TypesOfVariable;

public class Sample1
{
	//1: example of local & global variable
	
	int num1=10;          //global variable
	
	public void m1() 
	{
		int num2=20;         //local variable
		System.out.println(num2);   //20
		System.out.println(num1);   //10
	}
	
	
	public void m2() 
	{
		int num3=30;            //local variable
		System.out.println(num3);//30
		//System.out.println(num2);
		System.out.println(num1);   //10
	}
	
	
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.m1();
		s1.m2();
	}
}
