/*
39. Password Strength Checker
Class Name: PasswordChecker
Methods:
void setPassword(String password)
String checkStrength()
Description
Checks whether password is weak, medium, or strong.
Example
Input:
 "Abc@1234"
Output:
 "Strong Password"
*/
import java.util.Scanner;

class Q39_POJO
{
	private String s;
	private int i, a;
	private int l = 0;
	private int d = 0;
	private int o = 0;

	public void setPassword(String s)
	{
		this.s = s;
	}

	public String checkStrength()
	{
		for(i = 0; i < s.length(); i++)
		{
			if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) l = 1;
			else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') d = 1;
			else o = 1;
		}

		a = l + d + o;
		if(a == 3) return "Strong";
		else if(a == 2) return "Medium";
		return "Weak";
	}
}

public class Q39_PasswordChecker
{
	public static void main(String X[])
	{
		Q39_POJO t = new Q39_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the password: ");
		t.setPassword(sc.nextLine());
		
		sc.close();
		System.out.println(t.checkStrength());
	}
}