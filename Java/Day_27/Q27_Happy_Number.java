/*
Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/

public class Q27_Happy_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int s = 0;
		boolean f = false;
		int r;

		while((s!=1) && (s!=4))
		{
			s = 0;
			
			while(n != 0)
			{
				r = n % 10;
				s = s + r * r;
				n = n / 10;
			}

			if(s == 1)
			{
				f = true;
			} 
			else if (s == 4)
			{
				f = false;
			}
			else 
			{
				n = s;
			}
		}

		if(f)
		{
			System.out.println("Happy Number");
		}
		else
		{
			System.out.println("Not Happy Number");
		}
	}
}