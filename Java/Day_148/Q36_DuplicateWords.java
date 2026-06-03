/*
36. Find Duplicate Words
Class Name: DuplicateWords
Methods:
void setString(String str)
void findDuplicateWords()
Example
Input:
 "Java is easy Java is powerful"
Output:
 Java, is
*/
import java.util.Scanner;

class Q36_POJO
{
	private String s;
	private int i, j;
	
	public void setString(String s)
	{
		this.s = s;
	}

	public void findDuplicateWords()
	{
		String[] h = s.split(" ");

		for(i = 0; i < h.length - 1; i++)
		{
			for(j = i + 1; j < h.length; j++)
			{
				if(h[i].equals(h[j])) System.out.print(h[i] + " ");
			}
		}
	}
}

public class Q36_DuplicateWords
{
	public static void main(String X[])
	{
		Q36_POJO o = new Q36_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		o.setString(sc.nextLine());

		sc.close();
		o.findDuplicateWords();
	}
}