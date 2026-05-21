// Q9. Write a java program to print a multiplication table of any number.

public class Q9_Multiplication_Table
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		while(i <= 10)
		{
			System.out.println(n + " X " + i + " = " + (n*i));
			i++;
		}
	}
}