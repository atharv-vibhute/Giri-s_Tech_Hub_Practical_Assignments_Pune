/*
5. Convert String to Uppercase
Problem Statement
Create class UpperCaseConvert with methods:
void setString(String str)
String getUpperCase()
Method Description
void setString(String str)
Stores string.
String getUpperCase()
Converts lowercase letters into uppercase and returns result.
Example
Input: "java"
Output: "JAVA"
*/
import java.util.Scanner;

class Q5_POJO
{
	private String s;
	private String e = "";
	private int i;
	
	public void setString(String s)
	{
		this.s = s;
	}

	public String getUpperCase()
	{
		for(i = 0; i < s.length(); i++)
		{
			e = e + (char)(s.charAt(i) - 32);
		}
		return e;
	}
}

public class Q5_Uppercase
{
	public static void main(String X[])
	{
		Q5_POJO f = new Q5_POJO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		f.setString(sc.next());

		sc.close();
		System.out.println(f.getUpperCase());
	}
}
