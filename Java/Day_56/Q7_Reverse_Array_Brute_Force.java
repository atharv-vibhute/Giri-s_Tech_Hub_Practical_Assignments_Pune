/*
Q7. Write a java program to display the reverse array.
Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/
import java.util.Scanner;

public class Q7_Reverse_Array_Brute_Force
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int i, j, t, k;
		int a[] = new int[n];

		System.out.println("Enter the element in the array: ");
		for(i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		for(i = 0, k = a.length - 1; i < a.length/2; i++, k--)
		{
			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}

		System.out.print("\nReverse array = ");
		for(i = 0; i < a.length; i++)
		{
	
			
				System.out.print(a[i] + " ");

		}
	}
}
/*
import java.util.*;
public class Q7_Reverse_Array_Brute_Force
{
   public static void main(String x[])
   {
      int a[]=new int[5];
	  Scanner xyz = new Scanner(System.in);
	  System.out.println("Enter five values in array");
	  for(int i=0; i<a.length; i++)
	  {
	    a[i]=xyz.nextInt();
	  }
	  System.out.println("Array before reverse");
	  for(int i=0; i<a.length; i++)
	  { System.out.printf("a[%d]--->%d\n",i,a[i]);
	  }
	  int i;
	  int j;
	  i=j=0;
	  for(i=0;i<a.length; i++)
	  {
		    int temp=a[0];
			for(j=0; j<(a.length-1-i);j++)
			{
				 a[j]=a[j+1];
			}
			a[j]=temp;
	  }
	  System.out.println("\nArray after reverse");
	  for(i=0; i<a.length; i++)
	  { System.out.printf("a[%d]--->%d\n",i,a[i]);
	  }
   }
}
*/
