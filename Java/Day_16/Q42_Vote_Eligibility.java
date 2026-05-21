/*
Q42. Write a Java program to check whether a person is eligible to vote. 
Input : Age = 19 
Output : Eligible to Vote 
Explanation : Minimum voting age is 18 years. 
*/

public class Q42_Vote_Eligibility
{
	public static void main(String X[])
	{
		int a = Integer.parseInt(X[0]);
		if(a >= 18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
	}
}