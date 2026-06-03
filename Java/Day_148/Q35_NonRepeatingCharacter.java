/*
35. Find First Non-Repeating Character
Class Name: NonRepeatingCharacter
Methods:
void setString(String str)
char getFirstNonRepeating()
Example
Input:
 "aabbcdde"
Output:
 'c'
*/
import java.util.Scanner;

class Q35_POJO
{
	private String s;
	private int i, j;
	private Boolean f;
	
	public void setString(String s)
	{
		this.s = s;
	}

	public char getFirstNonRepeating()
	{
		for(i = 0; i < s.length(); i++)
		{
			f = true;

			for(j = 0; j < s.length(); j++)
			{
				if(s.charAt(i) == s.charAt(j) && i != j)
				{
					f = false;
					break;
				}
			}

			if(f) return s.charAt(i);
		}

		return '\0';
	}
}

public class Q35_NonRepeatingCharacter
{
	public static void main(String X[])
	{
		Q35_POJO m = new Q35_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		m.setString(sc.nextLine());

		sc.close();
		char c = m.getFirstNonRepeating();

		if(c == '\0') System.out.println("There is no repeating character.");
		else System.out.println(c);
	}
}