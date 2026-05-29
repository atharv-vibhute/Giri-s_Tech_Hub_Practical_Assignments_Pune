/*
2. Count Total Consonants
Problem Statement
Create class CountConsonant with methods:
void setString(String str)
int getConsonantCount()
Method Description
void setString(String str)
Accepts string from user.
int getConsonantCount()
Counts all consonants and returns count.
Example
Input: "Computer"
Output: 6
Explanation
Consonants are:
 C, m, p, t, r
*/
import java.util.Scanner;

class Q2_POJO
{
	private String s;
	private int i;
	private int c = 0;
	private String a;

	public void setString(String s)
	{
		this.s = s;
		a = s.toLowerCase();
	}

	public int getConsonantCount()
	{
		for(i = 0; i < a.length(); i++)
		{
			if(a.charAt(i) == 'b' || a.charAt(i) == 'c' || a.charAt(i) == 'd' || a.charAt(i) == 'f' || a.charAt(i) == 'g' || a.charAt(i) == 'h' || a.charAt(i) == 'j' ||
			a.charAt(i) == 'k' || a.charAt(i) == 'l' || a.charAt(i) == 'm' || a.charAt(i) == 'n' || a.charAt(i) == 'p' || a.charAt(i) == 'q' || a.charAt(i) == 'r' || 
			a.charAt(i) == 's' || a.charAt(i) == 't' || a.charAt(i) == 'v' || a.charAt(i) == 'w' || a.charAt(i) == 'x' || a.charAt(i) == 'y' || a.charAt(i) == 'z') 
				c++;
		}
		return c;
	}
}

public class Q2_Consent_Count
{
	public static void main(String X[])
	{
		Q2_POJO b = new Q2_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		b.setString(sc.next());

		sc.close();
		System.out.println(b.getConsonantCount());
	}
}