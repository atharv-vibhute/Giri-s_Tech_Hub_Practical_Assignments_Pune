// Q34. Write a java program to find the frequency of each digit in a given integer.

public class Q34_Frequency_Digit
{
	public static void main(String X[])
	{
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		int f5 = 0;
		int f6 = 0;
		int f7 = 0;
		int f8 = 0;
		int f9 = 0;
		int f0 = 0;
		int r = 0;
		int n = Integer.parseInt(X[0]);

		while(n != 0)
		{
			r = n % 10;
			n = n / 10;

			if(r == 1)
			{
				f1++;
			}
			else if(r == 2)
			{
				f2++;
			}
			else if(r == 3)
			{
				f3++;
			}
			else if(r == 4)
			{
				f4++;
			}
			else if(r == 5)
			{
				f5++;
			}
			else if(r == 6)
			{
				f6++;
			}
			else if(r == 7)
			{
				f7++;
			}
			else if(r == 8)
			{
				f8++;
			}
			else if(r == 9)
			{
				f9++;
			}
			else 
			{
				f0++;
			}
		}

		System.out.println("Zero: " + f0);
		System.out.println("One: " + f1);
		System.out.println("Two: " + f2);
		System.out.println("Three: " + f3);
		System.out.println("Four: " + f4);
		System.out.println("Five: " + f5);
		System.out.println("Six: " + f6);
		System.out.println("Seven: " + f7);
		System.out.println("Eight: " + f8);
		System.out.println("Nine: " + f9);
	}
}