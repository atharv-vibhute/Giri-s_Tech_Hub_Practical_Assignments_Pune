/*
29. Convert First Letter Capital
Class Name: CapitalizeWord
Methods:
void setString(String str)
String capitalize()
Example
Input:
 "java programming"
Output:
 "Java Programming"
*/
import java.util.Scanner;

class Q29_POJO
{
	private String s;
	private String r = "";
	private int i;

	public void setString(String s)	
	{
		this.s = s;
	}

	public String capitalize()
	{
		if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z') 
			r += (char)(s.charAt(0) - 32);
		else
			r += (char)(s.charAt(0));

		for(i = 0; i < s.length() - 1; i++)
		{
			if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' && s.charAt(i + 1) >=  'a' && s.charAt(i + 1) <= 'z')
				r += (char)(s.charAt(i + 1) - 32);
			else
				r += (char)(s.charAt(i + 1));
		}

		return r;
	}
}

public class Q29_CapitalizeWord
{
	public static void main(String X[])
	{
		Q29_POJO p = new Q29_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		p.setString(sc.nextLine());

		sc.close();
		System.out.println(p.capitalize());
	}
}