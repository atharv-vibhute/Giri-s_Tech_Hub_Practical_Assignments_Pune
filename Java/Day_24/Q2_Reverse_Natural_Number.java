// Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.


public class Q2_Reverse_Natural_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = n;
		while(i != 0)
		{
			System.out.println(i);
			i--;
		}
	}
}
