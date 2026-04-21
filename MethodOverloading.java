package tops.core;

public class MethodOverloading {
	void test()
	{
		System.out.println("Test with no arguments");
	}
	void test(int a)
	{ 
		System.out.println("Test with 1 argument");
	}
	void test(int a, int b)
	{
		System.out.println("Test with 2 argument");
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();   //we have to write this for calling methodoverloading 
		m.test();
		m.test(1);
		m.test(2,3);
	}
}
/*because same class are there but main method is static*/