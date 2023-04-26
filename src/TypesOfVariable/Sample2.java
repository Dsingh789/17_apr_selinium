package TypesOfVariable;

public class Sample2 
{	
	//2: example of static global variable
	
	static int num=10;        //static global variable (class variable)

	
	public static void main(String[] args) 
	{
		//1: static global variable call from same class
		System.out.println(num);      //variableName
		
		
		//1: static global variable call from diff class
		System.out.println(Sample3.b);    //diffclassname.variablename	
	}
	
	
	public static void m1()
	{
		System.out.println(num);
	}
	
	public void m2() 
	{
		System.out.println(num);
	}
}
