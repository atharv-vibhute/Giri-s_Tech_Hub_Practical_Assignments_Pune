/*
Q37. Write a Java program to input cost price and selling price and determine profit or 
loss. 
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
		int c = Integer.parseInt(X[0]);
		int s = Integer.parseInt(X[1]);
		if((s-c)>0)
		{
			System.out.println("Profit");
		}
		else
		{
			System.out.println("Loss");
		}
	}
}