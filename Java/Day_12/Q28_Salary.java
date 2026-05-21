/*
Q28. Write a Java program to calculate the net salary of an employee.
 Input:
 Basic = 20000
 HRA = 10%
 DA = 5%
 Tax = 2%
 Output : Net Salary = 22600
 Explanation : Allowances are added and tax is deducted.
*/

public class Q28_Salary 
{
	public static void main(String X[])
	{
		int b = Integer.parseInt(X[0]);
		int h = b * 10/100;
		int d = b * 5/100;
		int t = b * 2/100;
		int n = b + h + d - t;
		System.out.println("Net Salary = " + n);
	}
}
