package Array;

public class example2_StringArray
{
	public static void main(String[] args)
	{
		String [] ar=new String[4];    //0 to 3
		
		ar[0]="ganesh";
		ar[1]="suresh";
		ar[2]="mahesh";
		ar[3]="ramesh";
				
		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		System.out.println("---------------");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}		
	}
}
