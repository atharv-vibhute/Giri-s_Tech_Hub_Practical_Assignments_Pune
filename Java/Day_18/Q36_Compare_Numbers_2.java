/*
Q36. Compare two numbers: greater, smaller, or equal.
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.  
*/

public class Q36_Compare_Numbers_2
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int m = Integer.parseInt(X[1]);
		if(n>m)
		{
			System.out.println("Greater");
		}
		else if(m>n)
		{
			System.out.println("Smaller");
		}
		else
		{
			System.out.println("Equal");
		}
	}
}