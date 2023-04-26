package This_Super_keyword;

public class demo2 extends demo1
{
	//int a=10;    //global variable from super class
	
	int a=20;           //global variable from same class
	
	public void m1() 
	{
		int a=30;          //local variable
		System.out.println(a);        //30
		System.out.println(this.a);    //20
		System.out.println(super.a);   //10
	}
	
	
	
	public static void main(String[] args) 
	{	
		demo2 d2=new demo2();
		d2.m1();	
	}
}
