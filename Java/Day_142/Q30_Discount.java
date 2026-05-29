/*
Question 30: Write a Java program to implement a Product Discount Calculator using POJO class.
Create a POJO class Product with variables productId, price, and quantity.
Using getter and setter methods:
- Calculate total amount = price * quantity
- If total > 5000 => 10% discount
- Otherwise => No discount
Display final amount.
Input:
Enter Product Id : 101
Enter Price : 1200
Enter Quantity : 5

Output:
Product Id : 101
Total Amount : 6000
Discount : 600
Final Amount : 5400

Explanation:
A POJO class Product has private fields: productId, price, quantity.
Total Amount = price * quantity = 1200 * 5 = 6000.
Condition: if (totalAmount > 5000) => 10% discount.
Discount = 6000 * 10 / 100 = 600.
Final Amount = 6000 - 600 = 5400.
Setters store values entered by user. Getters retrieve them for calculation.
This demonstrates POJO encapsulation combined with business discount logic.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q30_POJO
{
	private int i, p, q;

	public void setI(int i)
	{
		this.i = i;
	}

	public int getI()
	{
		return i;
	}

	public void setP(int p)
	{
		this.p = p;
	}

	public int getP()
	{
		return p;
	}

	public void setQ(int q)
	{
		this.q = q;
	}

	public int getQ()
	{
		return q;
	}
}

public class Q30_Discount
{
	public static void main(String X[])
	{
		Q30_POJO a = new Q30_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Id : ");
		a.setI(sc.nextInt());

		System.out.println("Enter Price : ");
		a.setP(sc.nextInt());
	
		System.out.println("Enter Quantiy: ");
		a.setQ(sc.nextInt());

		int i = a.getI();
		int t = a.getP() * a.getQ();
		int d = (t > 5000)? 10 : 0;
		int f = t - t * d / 100;
		
		System.out.println("Final Amount: " + f);
	}
}