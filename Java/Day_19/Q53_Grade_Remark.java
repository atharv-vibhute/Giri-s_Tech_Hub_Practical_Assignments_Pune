/*
Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
Explanation: Use a char or string in switch to match grades and print remarks.
*/

import java.util.Scanner;

public class Q53_Grade_Remark
{
	public static void main(String X[])
	{
		System.out.println("Grades -");
		System.out.println("A: Excellent");
		System.out.println("B: Good");
		System.out.println("C: Average");
		System.out.println("D: Poor");
		System.out.println("F: Fail");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c = sc.nextLine().charAt(0);
		sc.close();

		switch(c)
		{
			case 'A': 
				System.out.println("Excellent");
				break;

			case 'B':
				System.out.println("Good");
				break;

			case 'C':
				System.out.println("Average");
				break;

			case 'D':
				System.out.println("Poor");
				break;

			case 'F':
				System.out.println("Fail");
				break;

			default:
				System.out.println("Wrong Choise");
		}
	}
}