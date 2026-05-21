/*
Q27. Write a Java program to toggle the case of an alphabet using ASCII values.
 Input : a
 Output : A
 Explanation : ASCII values are used to change case.
*/

import java.util.Scanner;

public class Q27_Toggle_Alphabet
{
	public static void main(String X[])
	{
		System.out.println("Enter the Charater:");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);

		if(c >= 'A' && c <= 'Z')
		{
			c = (char)((int)c + 32);
			System.out.println(c);
		}
		else if(c >= 'a' && c <= 'z')
		{
			c = (char)((int)c - 32);
			System.out.println(c);
		}
		else 
		{
			System.out.println("This is not character");
		}
	}
}