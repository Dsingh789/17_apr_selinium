package PolyMorphism;
public class sample1 
{
	//Example of method overloading
		
	//addition method with 2 int parameter
	public void addition(int num1, int num2)     // 10 ,  20
	{
		System.out.println(num1+num2);
	}
	
	//addition method with 3 int parameter
	public void addition(int num1, int num2, int num3) 
	{
		System.out.println(num1+num2);
	}
		
	
	public static void main(String[] args)
	{
		
		sample1 s1=new sample1();
		s1.addition(10, 20);	
	}
}
