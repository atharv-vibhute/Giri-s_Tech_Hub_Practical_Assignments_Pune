/*
1. Count Total Vowels
Problem Statement
Create class name as CountVowel with two methods:
void setString(String str)
int getVowelCount()
Method Description
void setString(String str)
This method accepts a string as parameter and stores it inside class variable.
int getVowelCount()
This method counts total vowels (a, e, i, o, u) present in string and returns total count.
Example
Input: "Education"
Output: 5
Explanation
The vowels are:
 E, u, a, i, o
Total vowels = 5
*/
import java.util.Scanner;

class Q1_POJO
{
	private String s;
	private int v;
	private int i;
	private int c = 0;

	public void setString(String s)
	{
		this.s = s;
	}

	public int getVowelCount()
	{
		for(i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' ||
			s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') c++;
		}
		return c;
	}
}

public class Q1_Vowel_Count
{
	public static void main(String X[])
	{
		Q1_POJO a = new Q1_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		a.setString(sc.next());
		
		sc.close();
		System.out.println(a.getVowelCount());
	}
}