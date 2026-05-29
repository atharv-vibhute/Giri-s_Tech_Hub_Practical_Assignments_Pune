/*
9. Compare Two Strings
Problem Statement
Create class CompareString with methods:
void setStrings(String s1, String s2)
boolean isEqual()
Method Description
void setStrings(String s1, String s2)
Accepts two strings.
boolean isEqual()
Compares both strings and returns true if same.
Example
Input:
 "java", "java"
Output:
 true
*/
import java.util.Scanner;

class Q9_POJO
{
	private String s1, s2;
	
	public void setS1(String s1)
	{
		this.s1 = s1;
	}

	public void setS2(String s2)
	{
		this.s2 = s2;
	}

	public Boolean isEqual()
	{
		return s1.equals(s2);
	}
}

public class Q9_String_Equal
{
	public static void main(String X[])
	{
		Q9_POJO m = new Q9_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string: ");
		m.setS1(sc.next());
		System.out.println("Enter second string: ");
		m.setS2(sc.next());

		sc.close();
		System.out.println(m.isEqual());
	}
}