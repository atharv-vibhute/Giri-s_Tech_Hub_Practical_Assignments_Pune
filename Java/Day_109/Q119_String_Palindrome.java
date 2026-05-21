/*
Question 119: Check if String is Palindrome (Two Pointer)
Problem Statement:
Given a string, determine whether the string is a palindrome.

Use the Two Pointer Technique by comparing characters from both ends moving toward the center.
Input:
String = "madam"

Output:
Palindrome

Explanation:
Left pointer ? 'm'
Right pointer ? 'm' ? match
Move inward
'a' == 'a'
Move inward
'd' == 'd'
All characters matched ? palindrome

Time Complexity = O(n)

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q119_String_Palindrome
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		boolean f = true;

		System.out.println("Enter the string: ");
		String s = sc.next();
		sc.close();

		char[] c = s.toCharArray();
		int l = 0;
		int r = c.length - 1;

		while(l <= r)
		{
			if(c[l] != c[r])
			{
				f = false;
				break;
			}
			else
			{
				l++;
				r--;
			}
		}

		if(f) System.out.println("String is palindrome");
		else System.out.println("String is not palindrome");
	}
}