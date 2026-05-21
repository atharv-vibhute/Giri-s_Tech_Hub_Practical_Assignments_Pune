/*
Q41. Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.
*/

public class Q41_Employee_Salary_Hike
{
	public static void main(String X[])
	{
		int r = Integer.parseInt(X[0]);
		int se = Integer.parseInt(X[1]);
		int sa = Integer.parseInt(X[2]);
		if(r>=4 && sa>4)
		{
			sa = sa + sa * 20/100;
			System.out.println("New salary: " + sa);
		}
		else if(r==3 && (se>=0 && se<=4))
		{
			sa = sa + sa * 10/100;
			System.out.println("New Salary: " + sa);
		}
		else if((r>0 && r<3) && (se>=0 && se<=4))
		{
			sa = sa + sa * 5/100;
			System.out.println("New Salary: " + sa);
		}
	}
}
