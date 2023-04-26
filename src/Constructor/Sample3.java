package Constructor;

public class Sample3
{
	//2: example of user defined without/zero parameter constructor 
	
	//step1: variable declaration
	int num1;     //10
	int num2;     //20
	
	//step2: variable initialization
	//user defined constructor  --> provided by user
	//use1: to initialize global variable
	//use2: to copy all the members of class into object
	Sample3()       //without/zero parameter constructor
	{
		num1=10;
		num2=20;
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
		Sample3 s3=new Sample3();
		s3.add();     //30
		s3.mul();     //200
			
		System.out.println("----------------");
		
		Sample4 s4=new Sample4();
		s4.sub();	
	}
}
