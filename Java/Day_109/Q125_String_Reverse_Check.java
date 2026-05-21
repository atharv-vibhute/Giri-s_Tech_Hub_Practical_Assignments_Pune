/*
Question 125: Check if Two Strings Are Reverse
Problem Statement:
Check if one string is the reverse of another using two pointers.
Input:
String1 = "abcd"
String2 = "dcba"

Output:
True

Explanation:
Pointer1 ? start of String1
Pointer2 ? end of String2

Compare characters.

Time Complexity = O(n)

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q125_String_Reverse_Check
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		boolean f = true;

		System.out.println("Enter the first string: ");
		String a = sc.next();
		char[] c = a.toCharArray();

		System.out.println("Enter the second string: ");
		String b = sc.next();
		char[] d = b.toCharArray();
		sc.close();

		int i = 0;
		int j = c.length - 1;

		if(a.length() != b.length()) System.out.println("String is not reverse");
		else
		{
			while(i <= j)
			{
				if(c[i] != d[j])
				{
					f = false;
					break;
				}
				else
				{
					i++;
					j--;
				}
			}

			if(f) System.out.println("String is reverse");
			else System.out.println("String is not reverse");
		}
	}
}	