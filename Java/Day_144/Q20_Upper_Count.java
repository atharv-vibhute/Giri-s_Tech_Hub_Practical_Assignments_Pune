/*
20. Count Uppercase Letters
Class Name: UpperCaseCount
Methods:
void setString(String str)
int getUpperCaseCount()
Example
Input:
 "JaVA"
Output:
 3
*/
import java.util.Scanner;

class Q20_POJO
{
	private String s;
	private int c = 0;
	private int i;

	public void setString(String s)
	{
		this.s = s;
	}

	public int getUpperCaseCount()
	{
		for(i = 0; i < s.length(); i++) if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') c++;
		return c;
	}
}

public class Q20_Upper_Count
{
	public static void main(String X[])
	{
		Q20_POJO c = new Q20_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		c.setString(sc.nextLine());

		sc.close();
		System.out.println(c.getUpperCaseCount());
	}
}