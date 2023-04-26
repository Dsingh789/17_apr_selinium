package Methods;

public class sample3 
{
	//method with return Type
	
	public static void main(String[] args)
	{		
		mul(10,20);    //initialization
		mul(5,6);
		
		System.out.println("-------");
		
		sample3 s3=new sample3();
		s3.sub(10, 8);
		s3.sub(9, 15);
		
	}
	
	
	
	
	//method with 2 int (int , int) parameter
	public static void mul(int num1, int num2)   //variable declaration
	{
		System.out.println(num1*num2);
	}

	
	//method with 2 int (int , int) parameter
	public void sub(int num1, int num2)   //variable declaration
	{
		System.out.println(num1-num2);
	}
}
