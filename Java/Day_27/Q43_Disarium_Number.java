/*
Q43. Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
 Use a loop to count digits. Use another loop to extract each digit and calculate the digit raised to its position power using only loops (no Math.pow()). Check if the sum equals the original number.
*/

public class Q43_Disarium_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int s = 0;
		int t = n;
		int i = 0;
		int m, j, r;

		for(;t!=0;)
		{
			t = t / 10;
			i++;
		}

		t = n;
		for(;t!=0;)
		{
			r = t % 10;
			t = t / 10;
			m = 1;

			for(j=0; j<i ; j++)
			{
				m = m * r;
			}

			s = s + m;
			i--;
		}

		if(n == s)
		{
			System.out.println("Disarium Number");
		}
		else
		{
			System.out.println("Not Disarium Number");
		}
	}
}