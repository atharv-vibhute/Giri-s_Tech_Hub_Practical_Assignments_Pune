/*
Q57. Write a program to input an employee level (1-3) and display the salary range:
1: Junior (20,000 - 30,000)
2: Mid (31,000 - 50,000)
3: Senior (51,000 - 80,000)
Explanation: Use switch on the level number and print the salary range.
*/

public class Q57_Salary_Range
{
	public static void main(String X[])
	{
		int e = Integer.parseInt(X[0]);
		switch(e)
		{
			case 1:
				System.out.println("Junior (20,000 - 30,000)");
				break;

			case 2:
				System.out.println("Mid (31,000 - 50,000)");
				break;

			case 3:
				System.out.println("Senior (51,000 - 80,000)");
				break;

			default:
				System.out.println("Wrong Input");
		}
	}
}