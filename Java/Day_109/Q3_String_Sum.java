/*
Q3. Write a program to find the sum of digit present in given string
Ex.  Given String  :  sth3j5j1jj     
       output  : 3+5+1 = 9
*/
public class Q3_String_Sum
{
	public static void main(String X[])
	{
		String s = X[0];
		char[] c = s.toCharArray();
		int i;
		int a = 0;
		for(i = 0; i < c.length; i++) if(c[i] >= '1' && c[i] <= '9') a = a + (int)c[i] - 48;
		System.out.println("Sum: " + a);		
	}
}	