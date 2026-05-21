/*
Q6.Write a Java program that uses a void function to check whether a given two-digit number is a special number.
A number is special if: (sum of digits + product of digits) = original number
Explanation
Pass the number to a function
Extract digits using % and /
Calculate sum and product
Print result inside the function
*/
public class Q6_Function_Special_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		special_number(n);
	}
	public static void special_number(int n)
	{
		int s = 0;
		int p = 1;
		int r;
		int t = n;
		while(t != 0)
		{
			r = t % 10;
			t = t / 10;
			s = s + r;
			p = p * r;
		}
		System.out.println(((s + p) == n)? "Special Number" : "Not Special Number");
	}
}

