/*
Q58. Develop a program to simulate a basic banking menu:
 1: Deposit
 2: Withdraw
 3: Check Balance
 4: Exit
 Use a switch to handle user choice and print appropriate messages.
Explanation: Switch on user choice. Use variables for balance and update accordingly.
*/

import java.util.Scanner;

public class Q58_Banking_Menu
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int d, w, b;
		int n = 0;
		System.out.println("Enter the bank balance amount: ");
		b = sc.nextInt();

		while(n!=4)
		{
			System.out.println("Menu -");
			System.out.println("1: Deposit");
			System.out.println("2: Withdraw");
			System.out.println("3: Check Balance");
			System.out.println("4: Exit");
			n = sc.nextInt();
			
			switch(n)
			{
				case 1:
					System.out.println("Enter the amount of deposit: ");
					d = sc.nextInt();
					b = b + d;
					System.out.println("Deposite completed");
					break;

				case 2:
					System.out.println("Enter the amount of withdraw: ");
					w = sc.nextInt();

					if(w>b)
					{
						System.out.println("Insufficient Fund");
						System.out.println("Withdraw incompleted");
					}
					else
					{
						b = b - w;
						System.out.println("Withdraw completed");
					}
					break;

				case 3:
					System.out.println("Balance: " + b);
					break;

				case 4:
					System.out.println("Exit");
					System.exit(0);

				default:
					System.out.println("Wrong number. Please enter the correct number.");
			}
		} 
		sc.close();
	}
}