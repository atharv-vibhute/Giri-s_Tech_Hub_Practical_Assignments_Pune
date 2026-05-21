// Q35. Write a java program to enter a number and print it in words.

public class Q35_Number_Print_Words
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r;
		int a = n;
		int c = 0;

		if(n == 0)
		{
			System.out.print("Zero");
		}
	
		for(; a > 0;)
		{
			a = a / 10;
			c++;
		}

		for(; n > 0;)
		{
			c--;
			a = (int)Math.pow(10, c);
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

		if(c == 1)
		{
			System.out.print("Zero");
		}
	}
}