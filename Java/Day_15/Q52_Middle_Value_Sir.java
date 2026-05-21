/*
Q52.Write a Java program to find the middle value among three distinct integers using ternary operator. 
Input: 
p = 10 
q = 20 
r = 15 
Output : Middle Number = 15
*/

public class Q52_Middle_Value_Sir
{
	public static void main(String X[])
	{
		int p = Integer.parseInt(X[0]);
		int q = Integer.parseInt(X[1]);
		int r = Integer.parseInt(X[2]);
		String s = ((p<q && p>r) || (p<r && p>q))? "Middle Value = "+p : ((q<p && q>r) || (q<r && q>p))? "Middle Value = "+q : "Middle Vale = "+r;
		System.out.println(s);
	}
}