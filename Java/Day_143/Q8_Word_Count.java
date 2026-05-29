/*
8. Count Total Words
Problem Statement
Create class WordCount with methods:
void setString(String str)
int getWordCount()
Method Description
void setString(String str)
Accepts sentence.
int getWordCount()
Counts total words and returns count.
Example
Input: "Java is easy"
Output: 3
*/
import java.util.Scanner;

class Q8_POJO
{
	private String s;
	private int i;
	private int c = 1;
	
	public void setString(String s)
	{
		this.s = s;
	}

	public int getWordCount()
	{
		for(i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == ' ') 
			{
				c++;
			}
		}
		return c;
	}
}

public class Q8_Word_Count
{
	public static void main(String X[])
	{
		Q8_POJO v = new Q8_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		v.setString(sc.nextLine());

		sc.close();
		System.out.println(v.getWordCount());
	}
}

