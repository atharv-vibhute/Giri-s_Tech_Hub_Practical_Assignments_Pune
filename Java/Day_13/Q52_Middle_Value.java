/*
Q52.Write a Java program to find the middle value among three distinct integers using ternary operator.
 Input:
 p = 10
 q = 20
 r = 15
 Output : Middle Number = 15
 Explanation : 15 lies between 10 and 20
*/

public class Q52_Middle_Value
{
	public static void main(String X[])
	{
		int p = Integer.parseInt(X[0]);
		int q = Integer.parseInt(X[1]);
		int r = Integer.parseInt(X[2]);
		String s = (p>q && p>r && q>r)? "Middle Number = "+q:(p>q && p>r && r>q)? "Middle Number = "+r:(q>p && q>r && p>r)? "Middle Number = "+p:(q>p && q>r && r>p)? "Middle Number = "+r:(r>p && r<q && p>q)? "Middle Number = "+p : "Middle Number = "+q;
		System.out.println(s);
	}
}