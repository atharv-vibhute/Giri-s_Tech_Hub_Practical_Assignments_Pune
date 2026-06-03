/*
40. Convert Sentence into Pig Latin
Class Name: PigLatinConverter
Methods:
void setString(String str)
String convertPigLatin()
Example
Input:
 "java"
Output:
 "avajay"
*/

/*
Pig Latin is a word game where you transform English words according to simple rules.

For the example in your assignment:

Input:

java

Output:

avajay
Rule Used Here

If a word starts with a consonant:

Remove the first letter.
Put it at the end of the word.
Add "ay".

Example:

java
↓
avaj + ay
↓
avajay

More examples:

Input	Output
java	avajay
computer	omputercay
book	ookbay
cat	atcay
*/
import java.util.Scanner;

class Q40_POJO
{
	private String s;
	private String p = "";
	private char t;
	private int i;

	public void setString(String s)
	{
		this.s = s;
	}

	public String convertPigLatin()
	{
		char[] c = s.toCharArray();

		t = c[0];
		for(i = 0; i < c.length - 1; i++) c[i] = c[i + 1];
		c[c.length - 1] = t;
 		
		for(i = 0; i < c.length; i++) p += c[i];
		p = p + 'a' + 'y';
		return p;
	}
}

public class Q40_PigLatinConverter
{
	public static void main(String X[])
	{
		Q40_POJO z = new Q40_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		z.setString(sc.nextLine());

		sc.close();
		System.out.println(z.convertPigLatin());
	}
}