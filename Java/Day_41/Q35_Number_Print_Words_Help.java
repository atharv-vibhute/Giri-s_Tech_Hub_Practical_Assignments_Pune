// Q35. Write a java program to enter a number and print it in words.

import java.util.Scanner;

public class Q35_Number_Print_Words_Help
{
	public static void main(String X[])
	{
		int n, r, a;
		int c = 0;
		int d = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		a = n;
		sc.close();

		for(; a > 9;)
		{
			a = a / 10;
			c++;
			d++;
		}

		for(; n > 0;)
		{
			a = (int)Math.pow(10, c);
			c--;
			r = n / a;
			n = n - r * a;

			if(r == 1)
			{
				System.out.print("One ");
			} 
			else if(r == 2)
			{
				System.out.print("Two ");
			}
			else if(r == 3)
			{
				System.out.print("Three ");
			}
			else if(r == 4)
			{
				System.out.print("Four ");
			}
			else if(r == 5)
			{
				System.out.print("Five ");
			}
			else if(r == 6)
			{
				System.out.print("Six ");
			}
			else if(r == 7)
			{
				System.out.print("Seven ");
			}
			else if(r == 8)
			{
				System.out.print("Eight ");
			}
			else if(r == 9)
			{
				System.out.print("Nine ");
			}
			else
			{
				System.out.print("Zero ");
			}
		}

		if(d == c + 3 && c == 0)
		{
			System.out.print("Zero");
		}
	}
}