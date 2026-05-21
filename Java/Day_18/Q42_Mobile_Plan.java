/*
Q42. Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.
*/

public class Q42_Mobile_Plan
{
	public static void main(String X[])
	{
		int m = Integer.parseInt(X[0]);
		float r;

		if(m>=0 && m<=100)
		{
			r = 199f;
			System.out.println("Total monthly bill: " + r);
		}

		if(m>100 && m<=300)
		{
			m = m - 100;
			r = m*1 + 199f;
			System.out.println("Total monthly bill: " + r);
		}

		if(m>300 && m<=500)
		{
			m = m - 300;
			r = m*1.5f + 200*1 + 199;
			System.out.println("Total monthly bill: " + r);
		}

		if(m>500)
		{
			m = m - 500;
			r = m*2 + 200*1.5f + 200*1 + 199;
			System.out.println("Total monthly bill: " + r);
		}
	}
}