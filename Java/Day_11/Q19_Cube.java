/*
Q19. Write a Java program that reads a number and displays its cube.
 Input : Number = 4
 Output : Cube = 64
 Explanation : Cube is calculated by multiplying the number three times.
*/

public class Q19_Cube 
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int c = n * n * n;
		System.out.println("Cube = " + c);
	}
}