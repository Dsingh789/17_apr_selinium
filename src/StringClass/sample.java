package StringClass;

public class sample 
{
	public static void main(String[] args)
	{
		
		String s1="ab";	
		s1=s1+"cd"; //ab + cd = abcd                 //re-initialization	
		s1=s1+"XYZ";    //abcd + xyz = abcdxyz
		
		System.out.println(s1);
			
		//object creation string : without new keyword
		String s5="abcd";
		String s6="abcd";
		String s7="abcd1";
				
		//object creation string : using new keyword
		String s8=new String("abcd");
		String s9=new String("abcd");
			
		System.out.println(s5==s6);   //true
		System.out.println(s5==s7);    //false
		System.out.println(s5==s8);   //false
		
	}
}
