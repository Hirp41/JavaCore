package tops.core;


public class StaticMethod {
	static int a=10;
	static int b;
	{
		System.out.println("Block 1");
	}
	public StaticMethod()
	{
		System.out.println("Default constructor called");
	}
	static void math(int x)
	{
		System.out.println("X: "+x);
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
	static
	{
		System.out.println("Static block initialized");
		b=a*4;
	}
	public static void main(String[] args) {
		StaticMethod s=new StaticMethod();
		math(12);
	}
	{
		System.out.println("Block 2");
	}
}
