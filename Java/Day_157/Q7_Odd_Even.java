/*
Question 7: Write a Java program to check whether a number is even or odd using constructor initialization.

Description: Create NumberCheck class with one integer variable. Initialize using constructor and check even or odd using logical condition.
INPUT:
Enter Number: 17

OUTPUT:
17 is Odd Number

EXPLANATION:
Create NumberCheck class with int number field. Use constructor public NumberCheck(int num) to initialize. Check if number % 2 == 0 then "Even" else "Odd". Display number and type. Create object new NumberCheck(17) and display result.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q7_Num
{
	Q7_Num(int n)
	{
		System.out.println((n % 2 == 0)? n + " is Even Number" : n + " is Odd Number");
	}
}

public class Q7_Odd_Even
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		Q7_Num u = new Q7_Num(n);
	}
}