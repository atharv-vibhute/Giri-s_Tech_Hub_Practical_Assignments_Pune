/*
Q4. Write a Java program to enter length and breadth of a rectangle and calculate its area. 
Formula: area = length × breadth 
Input: 
Length = 10 
Breadth = 5 
Output  :  Area = 50 
Explanation  :  The area is calculated by multiplying length and breadth.
*/

public class Q4_Area_Rectangle 
{
	public static void main(String X[])
	{
		int Length = Integer.parseInt(X[0]);
		int Breadth = Integer.parseInt(X[1]);
		int Area = Length * Breadth;
		System.out.println("Area = " + Area);
	}
}