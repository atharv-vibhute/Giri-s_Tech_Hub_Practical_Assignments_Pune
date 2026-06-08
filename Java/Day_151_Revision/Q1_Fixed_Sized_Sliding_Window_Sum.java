// Fixed-Sized Sliding Window
import java.util.Scanner;

public class Q1_Fixed_Sized_Sliding_Window_Sum
{
	public static void main(String X[])
	{
		int i, s, k, n;
		int m = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		s = sc.nextInt();
		int[] a = new int[s];

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++) a[i] = sc.nextInt();

		System.out.println("Enter the window size: ");
		k = sc.nextInt();
		sc.close();

		for(i = 0; i < k; i++) m += a[i];
		n = m;
			
		for(i = 1; i <= s - k; i++) 
		{
			m = m - a[i - 1] + a[i + k - 1];
			n = Math.max(n, m);
		}
		System.out.println(n);
	}
}