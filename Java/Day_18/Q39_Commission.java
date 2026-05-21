/*
Q39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.
*/

public class Q39_Commission
{
	public static void main(String X[])
	{
		int s = Integer.parseInt(X[0]);
		int c;
		if(s>=0 && s<5000)
		{
			c = s * 2/100;
			System.out.println("Commission: " + c);
		}
		else if(s>=5000 && s<=10000)
		{
			c = s * 5/100;
			System.out.println("Commission: " + c);
		} 
		else if(s>10000)
		{
			c = s * 10/100;
			System.out.println("Commission: " + c);
		}
	}
}