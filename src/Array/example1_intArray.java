package Array;

public class example1_intArray
{
	public static void main(String[] args)
	{		
		int [] ar=new int[5];    //0 to 4
		
		ar[0]=40;
		ar[1]=50;
		ar[2]=10;
		ar[3]=30;
		ar[4]=20;
				
		System.out.println(ar[1]);
		System.out.println(ar.length);
		
		System.out.println("-----print all data-------");
//		for(int i=0; i<=4; i++)
//		{
//			System.out.println(ar[i]);
//		}
				
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}	
	}
}
