package Array;

public class example3_printArrayInReverseOrder
{
	public static void main(String[] args)
	{		
		int [] ar=new int[5];    //0 to 4
		
		ar[0]=40;
		ar[1]=50;
		ar[2]=10;
		ar[3]=30;
		ar[4]=20;
				
		System.out.println("-----print original data-------");		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
				
		System.out.println("-----print array in reverse order-------");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}	
	}
}
