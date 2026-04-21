package tops.core;
import java.util.*;

public class sample {
	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int a , b, c;
		System.out.println("Enter A: ");
		a = sc.nextInt();
		System.out.println("Enter B: ");
		b = sc.nextInt();
		c = a + b;
		System.out.println("Addition: "+ c);
		sc.close();
	}
}