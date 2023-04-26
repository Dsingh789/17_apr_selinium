package Constructor;

public class Sample4 
{
	//step1: variable declaration
	int num1;    //30
	int num2;     //5 
	
	//step2: variable initialization
	//user defined constructor  --> provided by user
	//use1: to initialize global variable
	//use2: to copy all the members of class into object
	Sample4()    //without/zero parameter constructor
	{
		num1=30;
		num2=5;
	}
	
	public void sub()
	{
		System.out.println(num1-num2);
	}
}
