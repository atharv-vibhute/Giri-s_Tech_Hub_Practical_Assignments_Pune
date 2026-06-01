/*
30. Count Occurrence of Word
Class Name: WordOccurrence
Methods:
void setData(String sentence, String word)
int getOccurrence()
Example
Input:
 Sentence: "Java is easy and Java is powerful"
Word: "Java"
Output:
 2
*/
import java.util.Scanner;

class Q30_POJO
{
	private String s;
	private String w;
	private int c = 0;
	private int i;

	public void setData(String s, String w)
	{
		this.s = s;
		this.w = w;
	}

	public int getOccurrence()
	{
		String[] l = s.split(" ");

		for(i = 0; i < l.length; i++)
		{
			if(w.equals(l[i]))
				c++;
		}

		return c;
	}
}

public class Q30_WordOccurrence
{
	public static void main(String X[])
	{
		Q30_POJO g = new Q30_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sentence: ");
		String s = sc.nextLine();

		System.out.println("Enter the word: ");
		String w = sc.nextLine();

		sc.close();
		g.setData(s, w);
		System.out.println(g.getOccurrence());
	}
}
