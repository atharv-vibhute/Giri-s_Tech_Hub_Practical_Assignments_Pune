/*
19. Toggle Case
Class Name: ToggleCase
Methods:
void setString(String str)
String toggle()
Description
Convert uppercase to lowercase and lowercase to uppercase.
Example
Input:
 "JaVa"
Output:
 "jAvA"
*/
import java.util.Scanner;

class Q19_POJO
{
	private String s;
	private String p = "";
	private int i;

	public void setString(String s)
	{
		this.s = s;
	}

	public String toggle()
	{
		for(i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				p = p + (char)(s.charAt(i) + 32);
			else
				p = p + (char)(s.charAt(i) - 32);
		}

		return p;
	}
}

public class Q19_Toggle_Case
{
	public static void main(String X[])
	{
		Q19_POJO g = new Q19_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		g.setString(sc.nextLine());
		
		sc.close();
		System.out.println(g.toggle());
	}
}