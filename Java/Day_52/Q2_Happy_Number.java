/*
Q2. Write a java program to Check If a Number Is a Happy Number or Not. 
Example : A number is called happy if it leads to 1 after a sequence of steps wherein 
each step number is replaced by the sum of squares of its digit, that is if we start with 
Happy Number and keep replacing it with digits square sum, we reach 1.
*/

public class Q2_Happy_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int s = 0;
		int r, i;
		boolean flag = false;
		
		while(s != 4 && s != 1)
		{
			s = 0;
			while(n != 0)
			{
				r = n % 10;
				n = n / 10;
				s = s + r * r;
			}
				
			if(s == 4)
			{
				flag = true;
			}
			else
			{
				n = s;
			}
		}

		if(flag)
		{
			System.out.println("Not Happy Number");
		}
		else
		{
			System.out.println("Happy Number");
		}
	}
}
