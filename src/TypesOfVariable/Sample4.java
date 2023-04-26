package TypesOfVariable;
public class Sample4
{
	int c=30;     //non-static global variable  (instance variable)
	
	public static void main(String[] args)
	{
		//3: non-static global variable call from same class
		Sample4 s4=new Sample4();     //create object of same class
		System.out.println(s4.c);     //variable Call --> objectName.varioableName
		
		
		//4: non-static global variable call from diff class
		Sample5 s6=new Sample5();   //create object  of diff class
		System.out.println(s6.d);   //variable call --> diffclassObjectName.variableName	
	}
	
	public static void m3()
	{
		Sample4 s5=new Sample4();
		System.out.println(s5.c);	
	}
	
	
	public void m4() 
	{
		System.out.println(c);
	}
}
