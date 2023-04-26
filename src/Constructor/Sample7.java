package Constructor;

public class Sample7
{
	//4: example of multiple constructor --> constructor overloading
	
	int num1;   
	int num2;  
	String name;
	
	//user defined without parameter constructor
	Sample7()
	{
		num1=10;
		num2=20;
	}
	
	//user defined with 2 int parameter constructor
	Sample7(int a, int b)   //40 , 50
	{
		num1=a;   //40 
		num2=b;	  //50
	}
	
	//user defined with Sttring parameter constructor 
	Sample7(String s1)   //Pratik
	{
		name=s1;   // Pratik
	}
	
	
	public void studentName() 
	{
		System.out.println(name);
	}
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void mul() 
	{
		System.out.println(num1*num2);
	}
		
	public static void main(String[] args)
	{
		Sample7 s7=new Sample7();
		s7.add();   //10
		s7.mul();   //200
		
		System.out.println("-----------");
		
		Sample7 s8=new Sample7(40, 50);
		s8.add();
		s8.mul();
		
		System.out.println("------------------");
		Sample7 s9=new Sample7("Pratik");
		s9.studentName();
		
	}
	

}
