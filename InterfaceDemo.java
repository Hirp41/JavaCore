package tops.core;

interface Ifs1
{
	static void math1()
	{
		System.out.println("Math defined in Ifs1");
	}
}
interface Ifs2
{
	void math2();
}
public class InterfaceDemo implements Ifs1,Ifs2{
	 public static void main(String[] args) {
		 InterfaceDemo i=new InterfaceDemo();
		 Ifs1.math1();
		 i.math2();
	}
	 public void math2()
	 {
		 System.out.println("Math2 defined in class");
	 }
}
