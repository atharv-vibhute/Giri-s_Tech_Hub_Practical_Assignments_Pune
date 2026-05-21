// Stack Implementation -

import java.util.Scanner;

public class Q1_Stack
{
	static int s[] = new int[5];
	static int t = -1;
	static int i;

	public static void pip(int n)
	{
		t++;
		s[t] = n;
		System.out.println(n + " is successfully inserted.");
	}

	public static void pop()
	{
		System.out.println(s[t] + " is successfully deleted.");
		t--;
	}

	public static void update(int n)
	{
		s[t] = n;
		System.out.println(n + " is successfully updated.");
	}

	public static void display()
	{
		System.out.println("The stack is -");
		for(i = 0; i <= t; i++) System.out.print(s[i] + " ");
	}

	public static void peek()
	{
		System.out.println("Last element is: " + s[t]);
	}

	public static void search(int n)
	{
		boolean f = false;

		for(i = 0; i <= t; i++)
		{
			if(n == s[i])
			{
				f = true;
				break;
			}
		}

		if(f) System.out.println(n + " is found at " + i + " index in a stack.");
		else System.out.println(n + " is not found in a stack.");
	}

	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int c, n;

		do
		{
			System.out.println("\n");
			System.out.println("Stack Operation -");
			System.out.println("1.Pip - Insert");
			System.out.println("2.Delete - Pop");
			System.out.println("3.Peek - Display Last Element");
			System.out.println("4.Update last element");
			System.out.println("5.Serach Element");
			System.out.println("6.Display");
			System.out.println("7.Exit");

			System.out.println("Enter the choice: ");
			c = sc.nextInt();
		
			switch(c)
			{
				case 1:
					if(t == s.length - 1) System.out.println("Stack is full");
					else 
					{
						System.out.println("Enter the element: ");
						n = sc.nextInt();
						pip(n);
					}
					break;

				case 2:
					if(t == -1) System.out.println("Stack is empty");
					else pop();
					break;

				case 3:
					if(t == -1) System.out.println("Stack is empty");
					else peek();
					break;

				case 4:
					if(t == -1) System.out.println("Stack is empty");
					else
					{
						System.out.println("Enter the updated element: ");
						n = sc.nextInt();
						update(n);
					}
					break;

				case 5:
					if(t == -1) System.out.println("Stack is empty");
					else
					{
						System.out.println("Enter the searching element: ");
						n = sc.nextInt();
						search(n);
					}
					break;

				case 6:
					if(t == -1) System.out.println("Stack is empty");
					else display();
					break;

				case 7:
					sc.close();
					System.out.println("You are exited successfully");
					System.exit(0);
				
	
				default:
					System.out.println("You entered wrong choice. Please enter the following Choice.");
			}
		}
		while(true);
	}
}