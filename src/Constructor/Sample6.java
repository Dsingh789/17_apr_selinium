package Constructor;

public class Sample6 
{
	int num5;   //40
	int num6;    //33
	
	//user defined with 2 int parameter constructor 
	Sample6(int c, int d)    //40 , 33
	{
		num5=c;      //40
		num6=d;    //33
	}
	
	
	public void sub() 
	{
		System.out.println(num5-num6);
	}

}
