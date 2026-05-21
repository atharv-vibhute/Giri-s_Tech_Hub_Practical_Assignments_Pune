// Q1. Write a java program to find the frequency of each digit in a given integer number. 

public class Q1_Frequency_Of_Digit
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i, t, r, c;

		for(i = 0; i <= 9; i++)
		{
			t = n;
			c = 0;
			
			while(t != 0)
			{
				r = t % 10;
				t = t / 10;

				if(i == r)
				{
					c++;
				}
			}

			if(c > 0)
			{
				System.out.println("Frequency of " + i + " = " + c);
			}
		}
	}
}