/*
Question 75: Check whether a given number is prime or not.
A prime number is divisible only by 1 and itself.
Input:
n = 29

Output:
29 is a Prime Number

Explanation:
We check divisibility from 2 up to ?n.

If any number divides n ? Not prime.
If none divides ? Prime.

For n = 29
We check up to ?29 ? 5.

Time Complexity: O(?n)
Because loop runs from 2 to square root of n.

Asked In Companies:
Practice assignment
*/

public class Q75_Function_Prime
{
	public static void prime(int n)
	{
		int i;
		int c = 0;

		for(i = 1; i <= n; i++) if(n % i == 0) c++;

		if(c == 2) System.out.println(n + " is a Prime Number");
		else System.out.println(n + " is not a Prime Number");
	}

	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		prime(n);
	}
}