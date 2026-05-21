/*
Q9. Write a Java program using a void function to check whether a number is a Strong Number.
A Strong Number is a number whose sum of factorials of digits equals the number.
Explanation
Extract each digit
Calculate factorial using a loop (no recursion)
Add factorials
Compare with original number
Print result inside function
*/
public class Q9_Function_Strong_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		strong_number(n);
	}
	public static void strong_number(int n)
	{
		int t = n;
		int f;
		int i, r;
		int s = 0;
		while(t != 0)
		{
			f = 1;
			r = t % 10;
			t = t / 10;
			for(i = 2; i <= r; i++) f = f * i;
			s = s + f;
		}
		System.out.println((n == s)? "Strong Number" : "Not Strong Number");
	}
}