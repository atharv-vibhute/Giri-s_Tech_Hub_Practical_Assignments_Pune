/*
Question 35: Write a Java program to implement a Number Range Analyzer using POJO class.
Create a POJO class RangeCheck with variable number.
Using getter and setter methods, determine:
- number < 0 => Negative
- number 0 to 100 => Normal Range
- number > 100 => Large Number
Input:
Enter Number : 135

Output:
Number : 135
Category : Large Number

Explanation:
A POJO class RangeCheck has private field: number.
setNumber(135) stores the value. getNumber() retrieves it for checking.
If-else ladder:
- number < 0 => Negative
- number >= 0 && number <= 100 => Normal Range
- number > 100 => Large Number
Since 135 > 100, Category = Large Number.
If number = -5, output would be Negative.
If number = 50, output would be Normal Range.
This demonstrates range checking logic using POJO encapsulation.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q35_POJO
{
	private int n;

	public void setN(int n)
	{
		this.n = n;
	}

	public int getN()
	{
		return n;
	}
}

public class Q35_Number
{
	public static void main(String X[])
	{
		Q35_POJO m = new Q35_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		m.setN(sc.nextInt());

		sc.close();
		int n = m.getN();

		System.out.println("Number : " + n);
		System.out.println((n < 0)? "Negative" : (n > 100)? "Large Number" : "Normal Range");
	}
}