/*
Q40. Classify temperature reading: 
Input: Temperature in Celsius
Logic:
<0 → Freezing
0–20 → Cold
21–35 → Warm
35 → Hot
Output: Display weather type.
*/

public class Q40_Temperature
{
	public static void main(String X[])
	{
		int t = Integer.parseInt(X[0]);
		if(t<0)
		{
			System.out.println("Freezing");
		}
		else if(t>=0 && t<=20)
		{
			System.out.println("Cold");
		}
		else if(t>20 && t<=35)
		{
			System.out.println("Warm");
		}
		else if(t>35)
		{
			System.out.println("Hot");
		}
	}
}