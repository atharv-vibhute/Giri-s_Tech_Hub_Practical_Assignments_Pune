/*
Q43. Calculate fine for library book return:
Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.
*/

public class Q43_Library_Fine
{
	public static void main(String X[])
	{
		int d = Integer.parseInt(X[0]);
		int r;

		if(d>=0 && d<=5)
		{
			r = d*2;
			System.out.println("Total fine: " + r);
			System.out.println("Membership Status: Not Canceled");
		}

		if(d>5 && d<=10)
		{
			d = d - 5;
			r = d*3 + 5*2;
			System.out.println("Total fine: " + r);
			System.out.println("Membership Status: Not Canceled");
		}
		
		if(d>10 & d<=30)
		{
			d = d - 10;
			r = d*5 + 5*3 + 5*2;
			System.out.println("Total fine: " + r);
			System.out.println("Membership Status: Not Canceled");
		}

		if(d>30)
		{
			r = 500;
			System.out.println("Total fine: " + r);
			System.out.println("Membership Status: Canceled");		}
	}
}

