/*
Q11. Write a Java program to enter marks of five subjects and calculate total marks and percentage.
 Input : Marks: 70, 75, 80, 65, 60
 Output : Total = 350		Percentage = 70%
 Explanation : Total is sum of marks, percentage is total/5.
*/

public class Q11_Marks_Percentage
{
	public static void main(String X[])
	{
		int m1 = Integer.parseInt(X[0]);
		int m2 = Integer.parseInt(X[1]);
		int m3 = Integer.parseInt(X[2]);
		int m4 = Integer.parseInt(X[3]);
		int m5 = Integer.parseInt(X[4]);

		int tm = m1 + m2 + m3 + m4 +m5;
		float p = (float)tm/5;

		System.out.println("Total Marks: " + tm);
		System.out.println("Percentage: " + p + "%");
	}
}
