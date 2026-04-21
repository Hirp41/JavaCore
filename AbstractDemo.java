package tops.core;

abstract class RBI{
	void show()
	{
		System.out.println("Hello this is RBI");
	}
	abstract void roi(double r);
}
class SBI extends RBI
{
	void roi(double r)
	{
		System.out.println("Rate Of Intrest Given By SBI is : "+r);
	}
}
class HDFC extends RBI
{
	void roi(double r)
	{
		System.out.println("Rate Of Intrest Given By HDFC is : "+r);
	}
}
public class AbstractDemo
{
	public static void main(String[] args) {
		SBI s=new SBI();
		s.roi(6.78);
		
		HDFC h=new HDFC();
		h.roi(6.88);
	}
}