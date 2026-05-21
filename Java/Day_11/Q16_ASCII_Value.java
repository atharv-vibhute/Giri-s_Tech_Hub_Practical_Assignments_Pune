/*
Q16. Write a Java program to print the ASCII value of a given character.
 Input : Character = A
 Output : ASCII value = 65
 Explanation : Each character has a unique ASCII value.
*/

import java.util.Scanner;

public class Q16_ASCII_Value
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch;
		ch = sc.next().charAt(0);
		System.out.printf("ASCII Value: %d", (int)ch);
	}
}