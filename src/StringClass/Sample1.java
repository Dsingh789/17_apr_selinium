package StringClass;

public class Sample1
{
	public static void main(String[] args)
	{		
		String s1="velocity";
		String s2="ABCD";
		String s3="abcd";
		String s4="my name is abc";
		String s5="abcabcab";   //0 to 7
		String s6="";
			
		String[] ar = s4.split(" ");    //my(0) name(1)  is(2)   abc(3)
		System.out.println(ar[0]);
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("-----------------");
		
		System.out.println(s4.replace("abc", "rahul"));
		
		System.out.println(s5.isEmpty());
		System.out.println(s2+s3);
		System.out.println(s2.concat(s3));
		
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(4, 6));   //4-5 
		
		System.out.println("------------");
		System.out.println(s5.lastIndexOf('a'));
		System.out.println(s5.indexOf('b'));
		System.out.println(s1.charAt(7));   //o
		System.out.println(s4.endsWith("abc"));
		System.out.println(s4.startsWith("my"));
		System.out.println("----------");
		System.out.println(s2.equals(s3));   //false
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s4.contains("is"));    //true 
		
		
		
		System.out.println(s1.length());
		
//		s1=s1.toUpperCase();
//		System.out.println(s1);		
		System.out.println(s1.toUpperCase());  //VELOCITY
		
		
//		s2=s2.toLowerCase();
//		System.out.println(s2);		
		System.out.println(s2.toLowerCase());  //abcd
		
		
		
	}

}
