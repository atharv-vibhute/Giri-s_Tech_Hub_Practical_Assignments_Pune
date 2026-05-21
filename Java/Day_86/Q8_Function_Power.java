/*
Q8. Write a Java program that uses a void function to calculate power of a number using a loop.
Explanation
Pass base and exponent to the function
Multiply base repeatedly using a loop
Print the final result inside the function
*/
public class Q8_Function_Power
{
	public static void main(String X[])
	{
		long b = Long.parseLong(X[0]);
		long e = Long.parseLong(X[1]);
		power(b, e);
	}
	public static void power(long b, long e)
	{
		long i;
		long j = b;
		double f;
		if(e == 0) System.out.println("1");
		else if(e < 0)
		{
			for(i = -1; i > e; i--) b = j * b;
			f = 1.0d / b;
			System.out.println(f);
		}
		else 
		{
			for(i = 1; i < e; i++) b = j * b;
			System.out.println(b);
		}
	}
}