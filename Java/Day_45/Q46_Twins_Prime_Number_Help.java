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

import java.util.Scanner;

public class Q46_Twins_Prime_Number_Help
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		int d, i, j, l, e;
		int k = 2;
		
		do
		{
			i = 1;
			j = 1;
			l = k + 2;
			d = 0;
			e = 0;
			
			while(i <= k)
			{
				if(k % i == 0)
				{
					d++;
				}
				i++;
			} 

			while(j <= l)
			{
				if(l % j == 0)
				{
					e++;
				}
				j++;
			} 


	
			if(e == 2 && d == 2)
			{
				System.out.print("(" + k + " , " + l + ")");
			}
			k++;
		} while(k <= no);
	}
}