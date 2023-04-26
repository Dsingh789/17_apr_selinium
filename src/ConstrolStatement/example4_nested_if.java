package ConstrolStatement;
public class example4_nested_if
{
	public static void main(String[] args)
	{
		int PEM=100;
		int MEM=600;
		
		// 400>=300
		if(PEM>=300)                //outer if
		{
			System.out.println("Eligible for mains exam");
			
			//600>=800
			if(MEM>=800)          //inner/nested if
			{
				System.out.println("got selected");
			}
			else
			{
				System.out.println("rejected from mains exam");
			}
		}
		else
		{
			System.out.println("Not Eligible for mains exam");
		}	
	}
}
