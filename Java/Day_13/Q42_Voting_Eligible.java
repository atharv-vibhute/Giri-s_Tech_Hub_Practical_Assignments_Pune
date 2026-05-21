/*
Q42. Write a Java program to check whether a person is eligible to vote.
 Input : Age = 19
 Output : Eligible to Vote
 Explanation : Minimum voting age is 18 years.
*/

public class Q42_Voting_Eligible
{
	public static void main(String X[])
	{
		int a = Integer.parseInt(X[0]);
		String s = (a>=18)? "Eligible to vote":"Not Eligible to vote";
		System.out.println(s);
	}
}