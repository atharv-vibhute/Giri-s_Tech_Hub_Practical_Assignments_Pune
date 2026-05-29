/*
4. Check Palindrome String
Problem Statement
Create class PalindromeCheck with methods:
void setString(String str)
boolean isPalindrome()
Method Description
void setString(String str)
Accepts string input.
boolean isPalindrome()
Checks whether string is palindrome or not and returns true or false.
Example
Input: "madam"
Output: true
Explanation
Original and reverse strings are same.
*/
import java.util.Scanner;

class Q4_POJO
{
	private String s;
	private int i;

	public void setString(String s)
	{
		this.s = s;
	}

	public boolean isPalindrome()
	{
		for(i = 0; i <= s.length() / 2; i++)
		{
			if(s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}
}

public class Q4_Palindrome
{
	public static void main(String X[])
	{
		Q4_POJO d = new Q4_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		d.setString(sc.next());
		
		sc.close();
		System.out.println(d.isPalindrome());
	}
}