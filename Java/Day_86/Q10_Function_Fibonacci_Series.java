/*
Q10. Write a Java program that uses a void function to print the Fibonacci series up to N terms.
Explanation
Pass number of terms to the function
Use loop to generate series
Print each term inside the function
No recursion and no return type
*/
public class Q10_Function_Fibonacci_Series
{
	public static void main(String X[])
	{
		long n = Integer.parseInt(X[0]);
		fibonacci_series(n);
	}
	public static void fibonacci_series(long n)
	{
		long f = 0;
		long s = 1;
		long i;
		long t = f + s;
		if(n == 0) System.out.print(" ");
		else if(n == 1) System.out.print(f);
		else if(n == 2) System.out.print(f + " " + s);
		else if(n > 2)
		{
			System.out.print(f + " " + s + " ");
			for(i = 2; i < n; i++)
			{
				f = s;
				s = t;
				t = f + s;
				System.out.print(t + " ");
			}
		}
		else System.out.print("Invaild input");
	}
}