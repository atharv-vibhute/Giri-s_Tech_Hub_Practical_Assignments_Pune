/*
16. Remove Duplicate Characters
Class Name: RemoveDuplicate
Methods:
void setString(String str)
String removeDuplicateCharacters()
Description
Removes repeated characters from string.
Example
Input:
 "programming"
Output:
 "progamin"
*/
import java.util.Scanner;

class Q16_POJO
{
	private String s;
	private String p = "";
	private int i, j, l, k;
	private boolean f;

	public void setString(String s)
	{
		this.s = s;
		l = s.length();
	}

	public String removeDuplicateCharacter()
	{
		char[] a = s.toCharArray();

		for(i = l - 1; i >= 0; i--)
		{
			f = false;
		
			for(j = i; j >= 0; j--)
			{
				if(s.charAt(i) == s.charAt(j) && i != j)
				{
					f = true;
					break;
				}
			}

			if(f)
			{
				for(k = i; k < l - 1; k++)
				{
					a[k] = a[k + 1];
				}
			
				l--;
				j++;
			}
		}	

		for(i = 0; i < l; i++)
		{
			p += a[i];
		}

		return p;
	}
}

public class Q16_Duplicates_Remove
{
	public static void main(String X[])
	{
		Q16_POJO h = new Q16_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String = ");
		h.setString(sc.nextLine());

		sc.close();
		System.out.println(h.removeDuplicateCharacter());
	}
}