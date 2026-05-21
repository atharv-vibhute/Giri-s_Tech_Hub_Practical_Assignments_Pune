// Q 6. Write a java program to enter marks of five subjects and calculate total marks and percentage. 

public class Q6_Marks_Percentage 
{
	public static void main(String X[])
	{
		int im1 = Integer.parseInt(X[0]);
		int im2 = Integer.parseInt(X[1]);
		int im3 = Integer.parseInt(X[2]);
		int im4 = Integer.parseInt(X[3]);
		int im5 = Integer.parseInt(X[4]);

		int itm = im1 + im2 + im3 + im4 + im5;
		float fp = (float)itm/5;
		
		System.out.println("Total Marks is " + itm);
		System.out.println("Percentage is " + fp + "%");
	}
}