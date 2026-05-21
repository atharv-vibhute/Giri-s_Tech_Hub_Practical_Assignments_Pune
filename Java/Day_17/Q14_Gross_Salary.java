/*
Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                                	Basic Salary <= 10000 : HRA = 20%, DA = 80%
                                	Basic Salary <= 20000 : HRA = 25%, DA = 90%
                                	Basic Salary > 20000 : HRA = 30%, DA = 95%
*/

public class Q14_Gross_Salary
{
	public static void main(String X[])
	{
		int b = Integer.parseInt(X[0]);
		int h;
		int d;
		int g;

		if(b>=0 && b<=10000)
		{
			h = b * 20/100;
			d = b * 80/100;
			g = b + h + d;
			System.out.println("Gross Salary = " + g);

		}
		else if(b>10000 && b<=20000)
		{
			h = b * 25/100;
			d = b * 90/100;
			g = b + h + d;
			System.out.println("Gross Salary = " + g);

		}
		else if(b>20000)
		{
			h = b * 30/100;
			d = b * 95/100;
			g = b + h + d;
			System.out.println("Gross Salary = " + g);

		}
	}
}
