/*
21. Count Lowercase Letters
Class Name: LowerCaseCount
Methods:
void setString(String str)
int getLowerCaseCount()
Example
Input:
 "JaVA"
Output:
 1
*/
import java.util.Scanner;

class Q21_POJO
{
	private String s;
	private int c = 0;
	private int i;

	public void setString(String s)
	{
		this.s = s;
	}

	public int getLowerCaseCount()
	{
		for(i = 0; i < s.length(); i++) if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') c++;
		return c;
	}
}

public class Q21_Lower_Count
{
	public static void main(String X[])
	{
		Q21_POJO r = new Q21_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		r.setString(sc.nextLine());

		sc.close();
		System.out.println(r.getLowerCaseCount());
	}
}