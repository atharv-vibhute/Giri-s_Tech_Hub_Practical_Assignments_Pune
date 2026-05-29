/*
Question 19: Write a Java program to implement a Number Analyzer using Method Overloading.
Create a class NumberAnalyzer and overload method check():
- check(int num) => Check even or odd
- check(int num1, int num2) => Find the greater number
- check(int num1, int num2, int num3) => Find the smallest number
Input:
Enter number : 14
Enter two numbers : 20 15
Enter three numbers : 9 4 7

Output:
14 is Even
Greater Number : 20
Smallest Number : 4

Explanation:
check(14):
- 14 % 2 == 0 => Even. Prints: 14 is Even.
check(20, 15):
- Compares two values using if-else. 20 > 15 => Greater Number : 20.
check(9, 4, 7):
- Compares three values to find smallest.
- 4 < 9 and 4 < 7 => Smallest Number : 4.
Java distinguishes overloads by argument count.
This program combines arithmetic, comparison, and method overloading.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q19_Overloading_Check
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, x, y, z;

		System.out.println("Enter number : ");
		a = sc.nextInt();

		System.out.println("Enter two numbers : ");
		b = sc.nextInt();
		c = sc.nextInt();

		System.out.println("Enter three numbers : ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();

		check(a);
		check(b, c);
		check(x, y, z);
	}

	public static void check(int a)
	{
		System.out.println((a % 2 == 0)? a + " is Even" : a + " is Odd");
	}

	public static void check(int a, int b)
	{
		System.out.println((a > b)? "Greater Number : " + a : "Greater Number : " + b);
	}

	public static void check(int a, int b, int c)
	{
		System.out.println((c < a && c < b)? "Smaller Number : " + c : (a < c && a < b)? "Smaller Number : " + a : "Smaller Number : " + b);
	}
}