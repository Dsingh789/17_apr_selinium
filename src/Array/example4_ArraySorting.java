package Array;
import java.util.Arrays;
public class example4_ArraySorting
{
	public static void main(String[] args)
	{		
		int [] ar=new int[5];    //0 to 4
		
		ar[0]=40;      //10
		ar[1]=50;      //20
		ar[2]=10;      //30
		ar[3]=30;      //40
		ar[4]=20;      //50		
		
		System.out.println("-----print original data-------");		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
						
		Arrays.sort(ar);   //diffclassname.methodname();
		
		System.out.println("-----print data in ascending order-----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}		
		
		System.out.println("-----print data in descending order-----");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}	
	}
}
