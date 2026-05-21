/*
Q 11. Write a Java program to input an amount of money in rupees and convert it into the minimum number of currency notes of denominations:
Rs. 500, 200, 100, 50, 20, 10, 5, 2, and 1.
Also display the total number of notes required. 
*/

public class Q11_Currency_Notes 
{
	public static void main(String X[])
	{
		int money = Integer.parseInt(X[0]);
		int n500 = money / 500;
		money = money - n500 * 500;
		int n200 = money / 200;
		money = money - n200 * 200;
		int n100 = money / 100;
		money = money - n100 * 100;
		int n50 = money / 50;
		money = money - n50 * 50;
		int n20 = money / 20;
		money = money - n20 * 20;
		int n10 = money / 10;
		money = money - n10 * 10;
		int n5 = money / 5;
		money = money - n5 * 5;
		int n2 = money / 2;
		money = money - n2 * 2;
		int n1 = money / 1;

		int tn = n500 + n200 + n100 + n50 + n20 + n10;
		System.out.println("Total Notes: " + tn);
		System.out.println("Rs.500: " + n500);
		System.out.println("Rs.200: " + n200);
		System.out.println("Rs.100: " + n100);
		System.out.println("Rs.50: " + n50);
		System.out.println("Rs.20: " + n20);
		System.out.println("Rs.10: " + n10);
		System.out.println("Rs.5: " + n5);
		System.out.println("Rs.2: " + n2);
		System.out.println("Rs.1: " + n1);
	}
}
