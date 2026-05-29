/*
6. Convert String to Lowercase
Problem Statement
Create class LowerCaseConvert with methods:
void setString(String str)
String getLowerCase()
Method Description
void setString(String str)
Accepts string.
String getLowerCase()
Converts uppercase letters into lowercase.
Example
Input: "JAVA"
Output: "java"
*/
import java.util.Scanner;

class Q6_POJO
{
	private String s;
	private String u = "";
	private int i;

	public void setString(String s)
	{
		this.s = s;
	}

	public String getLowerCase()
	{
		for(i = 0; i < s.length(); i++)
		{
			u = u + (char)(s.charAt(i) + 32);
		}
		return u;
	}
}

public class Q6_Lower_Case
{
	public static void main(String X[])
	{
		Q6_POJO v = new Q6_POJO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		v.setString(sc.next());

		sc.close();
		System.out.println(v.getLowerCase());
	}	
}