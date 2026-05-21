// Q2. Write a program to take a string as input and count number of vowels, consonents, digits, special symbol

public class Q2_String_Count
{
	public static void main(String X[])
	{
		String s = X[0];
		char[] c = s.toCharArray();
		int d = 0;
		int e = 0;
		int v = 0;
		int a = 0;
		int b = 0;
		int i;

		for(i = 0; i < c.length; i++)
		{
			if(c[i] >= '0' && c[i] <= '9') d++;
			else if((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z'))
			{
				b++;
				if(c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U' || c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') v++;
				else a++;
			}
			else e++;
		}

		System.out.println("Number of letters is: " + b);
		System.out.println("Number of vowels is: " + v);
		System.out.println("Number of consonents is: " + a);
		System.out.println("Number of digits is: " + d);
		System.out.println("Number of special symbol is: " + e);
	}
}
