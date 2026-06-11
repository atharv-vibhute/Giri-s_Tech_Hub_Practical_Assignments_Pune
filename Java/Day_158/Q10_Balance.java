/*
Question 10: Write a Java program to create a BankAccount class and check minimum balance condition.

Description: Create BankAccount class with accountNumber, customerName and balance. Initialize using constructor. If balance < 1000 display Minimum Balance Warning otherwise Valid Balance.
INPUT:
Enter Account Number: 12345
Enter Customer Name: Suresh
Enter Balance: 800

OUTPUT:
Customer Name: Suresh
Status: Minimum Balance Warning

EXPLANATION:
Create BankAccount with fields accountNumber, customerName, balance. Use constructor to initialize. Check if balance < 1000 then print "Minimum Balance Warning" else "Valid Balance". Display customer name and status.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q10_Bank
{
	Q10_Bank(int n, String s, int b)
	{
		System.out.println("Customer Name: " + s);
		System.out.println((b < 1000)? "Minimum Balance Warning" : "Valide Balance");
	}
}

public class Q10_Balance
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int n, b;
		String s;

		System.out.println("Enter Account Number: ");
		n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Customer Name: ");
		s = sc.nextLine();

		System.out.println("Enter Balance: ");
		b = sc.nextInt();
		
		sc.close();
		Q10_Bank o = new Q10_Bank(n, s, b);
	}
}