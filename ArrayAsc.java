package tops.core;
import java.util.*;

public class Array {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		int temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter "+(i+1)+" Element : ");
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are ");	
	for(i=0;i<a.length;i++)
	{
		System.out.println("A["+i+"] = "+a[i]);
	}
	for(int j=0;j<a.length;j++)
	{
		for(int k=j+1;k<a.length;k++)
		{
			if(a[j]>a[k])
			{
				temp=a[j];
				a[j]=a[k];
				a[k]=temp;
				
			}
		}
	}
	System.out.println("Ascending Order:");
	for(i = 0; i < a.length; i++)
	{
	    System.out.println("A[" + i + "] = " + a[i]);
	}
	}
}


 