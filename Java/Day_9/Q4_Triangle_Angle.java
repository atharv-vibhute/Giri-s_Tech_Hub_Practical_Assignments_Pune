// Q 4. Write a java program to enter two angles of a triangle and find the third angle. 

public class Q4_Triangle_Angle 
{
	public static void main(String X[])
	{
		int ia1 = Integer.parseInt(X[0]);
		int ia2 = Integer.parseInt(X[1]);
		int ia3 = 180 - ia1 - ia2;
		System.out.println("Third Angle is " + ia3);
	}
}