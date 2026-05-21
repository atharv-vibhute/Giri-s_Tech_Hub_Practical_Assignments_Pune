/*
Q57. Write a Java program to display the following series:
     1 1 2 3 5 8 13 21 34
(Fibonacci series using loop — first 9 terms)
*/

public class Q57_Fibonacci_Series_Help
{
	public static void main()
	{
		int a = 0;
		int b = 1;
		int i = 1;
		int s;

		System.out.print("1 ");
		do
		{
			s = a + b;
			a = b;
			b = s;
			System.out.print(s + " ");
			i++;
		} while(i < 9);
	}
}	