/*
Q25.Write a java program to find the total number of notes in a given amount. 
            Enter the amount: 2528
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1
*/

public class Q25_Notes
{
	public static void main(String X[])
	{
		int a = Integer.parseInt(X[0]);
		int n500 = a / 500;
		a = a - n500 * 500;
		int n100 = a / 100;
		a = a - n100 * 100;
		int n50 = a / 50;
		a = a - n50 * 50;
		int n20 = a / 20;
		a = a - n20 * 20;
		int n10 = a / 10;
		a = a - n10 * 10;
		int n5 = a / 5;
		a = a - n5 * 5;
		int n2 = a / 2;
		a = a - n2 * 2;
		int n1 = a;
		System.out.println("n500 = " + n500 + "\t n100 = " + n100 + "\t n50 = " + n50 + "\t n20 = " + n20 + "\t n10 = " + n10 + "\t n5 = " + n5 + "\t n2 = " + n2 + "\t n1 = " +n1);
	}
}