package Constructor;

public class Sample5
{
	//3: example of user defined with parameter constructor 
	
	int num3;   //50
	int num4;   //60
	
	//user defined with 2 int(int,int) parameter constructor
	Sample5(int a, int b)    //50, 60      //local variable declaration
	{
		num3=a;  //50                      //assign local variable info into global variable
		num4=b;	 //60	
	}
	
	public void add()
	{
		System.out.println(num3+num4);
	}
	public void mul()
	{
		System.out.println(num3*num4);
	}
	
	public static void main(String[] args) 
	{
		Sample5 s5=new Sample5(10,20);      //local variable initialization
		s5.add();     //30
		s5.mul();     //200
				
		System.out.println("-----------");
		
		Sample5 s6=new Sample5(50,60);
		s6.add();     //110
		s6.mul();     //3000
		
		System.out.println("---------------------------------------");
		
		Sample6 s7=new Sample6(40,33);
		s7.sub();
		
		System.out.println("-------");
				
		Sample6 s8=new Sample6(40,99);
		s8.sub();	
	}
}
