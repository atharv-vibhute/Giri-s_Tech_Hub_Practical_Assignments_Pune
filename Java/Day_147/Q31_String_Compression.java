/*
31. String Compression
Class Name: StringCompression
Methods:
void setString(String str)
String compress()
Description
Compress repeated characters.
Example
Input:
 "aaabbcc"
Output:
 "a3b2c2"
*/
import java.util.Scanner;

class Q31_POJO
{
	private String s;
	private int i;
	private int[] b = new int[26];
	private String r = "";
	
	public void setString(String s)
	{
		this.s = s;
	}

	public String compress()
	{
		for(i = 0; i < s.length(); i++) b[s.charAt(i) - 'a']++;

		for(i = 0; i < 26; i++)
		{
			if(b[i] > 0) r = r + (char)(i + 97) + b[i];
		}

		return r;
	}
}

public class Q31_String_Compression
{
	public static void main(String X[])
	{
		Q31_POJO a = new Q31_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		a.setString(sc.nextLine());

		sc.close();
		System.out.println(a.compress());
	}
}