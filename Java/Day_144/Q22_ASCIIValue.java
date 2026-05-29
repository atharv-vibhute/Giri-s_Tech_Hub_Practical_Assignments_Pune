/*
22. Find ASCII Value
Class Name: ASCIIValue
Methods:
void setCharacter(char ch)
int getASCII()
Example
Input:
 'A'
Output:
 65
*/
import java.util.Scanner;

class Q22_POJO
{
	private char c;
	
	public void setCharacter(char c)
	{
		this.c = c;
	}

	public int getASCII()
	{
		return (int)c;
	}
}

public class Q22_ASCIIValue
{
	public static void main(String X[])
	{
		Q22_POJO o = new Q22_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the character: ");
		String s = sc.nextLine();
		sc.close();

		o.setCharacter(s.charAt(0));
		System.out.println(o.getASCII());
	}
}