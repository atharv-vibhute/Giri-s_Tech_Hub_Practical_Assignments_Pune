/*
38. Validate Email
Class Name: EmailValidation
Methods:
void setEmail(String email)
boolean isValidEmail()
Example
Input:
 "abc@gmail.com"
Output:
 true
*/
import java.util.Scanner;

class Q38_POJO
{
	private String s;

	public void setEmail(String s) 
	{
		this.s = s;
	}

	public Boolean isValidEmail()
	{
		return s.contains("@gmail.com");
	}
}

public class Q38_EmailValidation
{
	public static void main(String X[])
	{
		Q38_POJO p = new Q38_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the email: ");
		p.setEmail(sc.nextLine());

		sc.close();
		System.out.println(p.isValidEmail());
	}	
}