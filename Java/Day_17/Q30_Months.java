/*
Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming.
*/

public class Q30_Months
{
	public static void main(String X[])
	{
		int m = Integer.parseInt(X[0]);
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
		{
			System.out.println("31 Days");
		}
		else if(m==4 || m==6 || m==9 || m==11)
		{
			System.out.println("30 Days");
		}
		else if(m==2)
		{
			System.out.println("28/29 Days");
		}
	}
}