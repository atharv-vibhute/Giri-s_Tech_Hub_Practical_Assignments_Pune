/*
Q9. Write a Java program to enter two angles of a triangle and find the third angle. 
Input: 
Angle1 = 50 
Angle2 = 60 
Output : Third Angle = 70 
Explanation  :  Sum of angles in a triangle is 180°. 
*/

public class Q9_Triangle_Angle
{
	public static void main(String X[])
	{
		int Angle1 = Integer.parseInt(X[0]);
		int Angle2 = Integer.parseInt(X[1]);

		int Angle3 = 180 - Angle1 - Angle2;
		System.out.println("Third Angle = " + Angle3);	
	}
}