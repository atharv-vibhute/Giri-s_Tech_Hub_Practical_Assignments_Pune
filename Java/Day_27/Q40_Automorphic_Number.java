/* 
Q40. Write a Java program to print all automorphic numbers between 1 and n. An automorphic number’s square ends with the number itself (e.g., 5² = 25).
 Explanation:
 Use loop to check square and a while loop to match last digits.
*/

public class Q40_Automorphic_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		int r, s, t, m;
		
		while(i <= n)
		{
			t = i;
			m = 1;

			while(t != 0)
			{
				t = t / 10;
				m = m * 10;
			}

			s = i * i;
			r = s % m;
			
			if(i == r)
			{
				System.out.println(i);
			}

			i++;
		}
	}
}
