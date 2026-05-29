/*
Question 28: Write a Java program to implement a Number Property Checker using POJO class.
Create a POJO class Number with variable num.
Using getter and setter methods, determine:
- Whether the number is Even or Odd
- Whether the number is Positive or Negative
Input:
Enter Number : -14

Output:
Number : -14
Even Number
Negative Number

Explanation:
A POJO class Number has private field num.
setNum(-14) stores the value. getNum() retrieves it for checking.
Even/Odd check: (-14) % 2 == 0 => Even Number.
Positive/Negative check: -14 < 0 => Negative Number.
Both checks run independently on the same stored value.
Note: The number -14 is both Even AND Negative, so two lines are printed.
This program shows how POJO encapsulation is used with two separate logical checks.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q28_POJO
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

public class Q28_Number
{
	public static void main(String X[])
	{
		Q28_POJO s = new Q28_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		s.setN(sc.nextInt());
		sc.close();
		int i = s.getN();

		System.out.println((i % 2 == 0)? "Even Number" : "Odd Number");
		System.out.println((i > 0)? "Positive Number" : (i < 0)? "Negative Number" : "Zero");
	}
}