package Inheritance;
//super class
public class WhatsAppV1 
{	
	public void sms()
	{
		System.out.println("sms");
	}
}


package Inheritance;
//super/sub
public class WhatsAppV2 extends WhatsAppV1 
{
	public void audioCalling() 
	{
		System.out.println("audio calling");
	}
	
//	public void sms()
//	{
//		System.out.println("sms");
//	}
}


package Inheritance;
//super/sub
public class WhatsAppV3 extends WhatsAppV2
{
	public void videoCalling()
	{
		System.out.println("video calling");
	}
	
	
//	public void audioCalling() 
//	{
//		System.out.println("audio calling");
//	}
	
//	public void sms()
//	{
//		System.out.println("sms");
//	}
}

package Inheritance;
public class example2_multiLevelInheritance
{
	public static void main(String[] args) {
		WhatsAppV3 v3=new WhatsAppV3();
		v3.sms();
		v3.audioCalling();
		v3.videoCalling();	
	}
}



