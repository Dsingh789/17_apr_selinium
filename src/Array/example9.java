package Array;
public class example9
{
	public static void main(String[] args) {
		
		int ar1 [] = {10, 20, 40, 50,10,20};
		int ar2 [] = {10, 20, 90, 100, 10,20};
			
		for(int i=0; i<=5; i++)
		{
			if(ar1[i]!=ar2[i])
			{
				System.out.println(i+": "+ar1[i]+" "+ ar2[i]);
			}			
		}		
	}
}
