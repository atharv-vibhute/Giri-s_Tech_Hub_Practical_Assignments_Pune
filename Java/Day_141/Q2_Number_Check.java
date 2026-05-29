/*
Question 2: Write a Java program to implement a Number Checker.
Create a class NumberCheck with a variable number.
Check whether the number is Even or Odd using a class object.
Input:
Enter Number : 45

Output:
Number : 45
Result : Odd Number

Explanation:
A class NumberCheck is created with an instance variable number.
An object of the class is created and the user enters a number using Scanner.
The condition used: if (number % 2 == 0) then Even, else Odd.
The modulo operator (%) gives the remainder when divided by 2.
Since 45 % 2 = 1 (not zero), the number is Odd.
If the user had entered 44, then 44 % 2 = 0, and it would print Even Number.
This program demonstrates class objects with basic arithmetic conditions.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q2_Display_Result
{
	int n;
	Scanner sc = new Scanner(System.in);

	void set()
	{
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		sc.close();
	}

	void check()
	{
		System.out.println("Number : " + n);
		System.out.print("Result : ");
		System.out.println((n % 2 == 0)? "Even Number" : "Odd Number");
	}
}

public class Q2_Number_Check
{
	public static void main(String X[])
	{
		Q2_Display_Result a = new Q2_Display_Result();
		a.set();
		a.check();
	}
}