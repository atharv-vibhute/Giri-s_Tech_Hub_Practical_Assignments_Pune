/*
Q37. Write a Java program to input cost price and selling price and determine profit or loss.
 Input:
 Cost Price = 500
 Selling Price = 650
 Output : Profit
 Explanation : Selling price is greater than cost price.
*/

public class Q37_Profit_Loss
{
	public static void main(String X[])
	{
		int cp = Integer.parseInt(X[0]);
		int sp = Integer.parseInt(X[1]);
		String s = (sp > cp)? "Profit" : "Loss";
		System.out.println(s);
	}
}