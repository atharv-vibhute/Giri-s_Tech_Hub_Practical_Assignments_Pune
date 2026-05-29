/*
11. Count Digits in String
Class Name: DigitCount
Methods:
void setString(String str)
int getDigitCount()
Description
Count total numeric digits present in string.
Example
Input: "Java123"
Output: 3
*/
import java.util.Scanner;

class Q11_POJO
{
	private String s;
	private int i;
	private int c = 0;

	public void setString(String s)
	{
		this.s = s;
	}

	public int getDigitCount()
	{
		for(i = 0; i < s.length(); i++) if(s.charAt(i) >= '0' && s.charAt(i) <= '9') c++;
		return c;
	}
}

public class Q11_Count_Digit
{
	public static void main(String s[])
	{
		Q11_POJO z = new Q11_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		z.setString(sc.next());

		sc.close();
		System.out.println(z.getDigitCount());
	}
}