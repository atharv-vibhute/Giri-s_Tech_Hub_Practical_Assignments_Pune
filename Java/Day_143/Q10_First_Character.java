/*
10. Find First Character
Problem Statement
Create class FirstCharacter with methods:
void setString(String str)
char getFirstCharacter()
Method Description
void setString(String str)
Stores string.
char getFirstCharacter()
Returns first character from string.
Example
Input: "Computer"
Output: 'C'
*/
import java.util.Scanner;

class Q10_POJO
{
	private String s;
	
	public void setString(String s)
	{
		this.s = s;
	}

	public char getFirstCharacter()
	{
		return s.charAt(0);
	}
}

public class Q10_First_Character
{
	public static void main(String X[])
	{
		Q10_POJO y = new Q10_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		y.setString(sc.next());

		sc.close();
		System.out.println(y.getFirstCharacter());
	}
}