/*
Q40. Write a Java program to check whether a character is an alphabet, digit, or special character.
 Input : Character = @
 Output : Special Character
 Explanation : Characters outside alphabets and digits are special characters.
*/

import java.util.Scanner;

public class Q40_Character_Check
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char c = sc.next().charAt(0);
		sc.close();
		String s = ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))? "Alphabet": (c >= '0' && c <= '9')? "Digit": "Special Character";
		System.out.println(s);
	}
}