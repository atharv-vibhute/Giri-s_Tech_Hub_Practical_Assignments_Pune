/*
Q46. Write a Java program to display all Twin Primes between 1 and n.
 Twin Primes are pairs of prime numbers that differ by 2.
 Example: (3, 5), (5, 7), (11, 13).
Explanation:
 Use loops:
First, loop through numbers from 2 to n.
For each, check if it and the next number +2 are both prime using an inner loop.
If both are prime, print the pair.
*/

public class Q46_Twin_Prime_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i, j, c, y;
		int x = 0;

		for(j = 1; j <= n; j++)
		{
			c = 0;
			y = 0;
			for(i = 1; i <= j; i++)
			{
				if(j % i == 0)
				{
					c++;
				}
				
				x = j + 2;
				if(x % i == 0)
				{
					y++;
				}
			}

			if(c == 2 && y == 1)
			{
				System.out.println("(" + j + "," + x + ")");
			}
		}
	}
}
