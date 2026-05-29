/*
15. Replace Character
Class Name: ReplaceCharacter
Methods:
void setData(String str, char oldCh, char newCh)
String replaceCharacter()
Description
Replace old character with new character.
Example
Input:
 "java", 'a', 'o'
Output:
 "jovo"
*/
import java.util.Scanner;

class Q15_POJO
{
	private String s;
	private String c = "";
	private char o, n;
	private int i;

	public void setData(String s, char o, char n)
	{
		this.s = s;
		this.o = o;
		this.n = n;
	}

	public String replaceCharacter()
	{
		for(i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == o) c += n;
			else c += s.charAt(i);
		}

		return c;
	}
}

public class Q15_Replace_Character
{
	public static void main(String X[])
	{
		Q15_POJO e = new Q15_POJO();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the String: ");
		String s = sc.nextLine();

		System.out.println("Enter the character which is replace : ");
		String c = sc.nextLine();
		char d = c.charAt(0);

		System.out.println("Enter the character which is replace by : ");
		String a = sc.nextLine();
		char b = a.charAt(0);
		sc.close();

		e.setData(s, d, b);
		System.out.println(e.replaceCharacter());
	}
}
