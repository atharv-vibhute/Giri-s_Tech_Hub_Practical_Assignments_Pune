// Queue Implementation

import java.util.Scanner;

public class Q1_Queue
{
	static int[] a = new int[5];
	static int r = -1;
	static int f = -1;
	static int i;

	public static void insert(int n)
	{
		r++;
		a[r] = n;
	}

	public static void delete()
	{
		// Old Logic -
		/*
			f++;
			if(f > r) 
			{
				f = -1;
				r = -1;
			}
		*/

		// New Logic -
		System.out.println(a[f] + " deleted successfully.");
		for(i = f; i < r; i++) a[i] = a[i + 1];
		r--;
		if(r == -1) f = -1;
	}

	public static void display()
	{
		System.out.println("The Queue elements are - ");
		for(i = f; i <= r; i++) System.out.print(a[i] + " ");
	}

	public static void search(int n)
	{
		boolean b = false;

		for(i = f; i <= r; i++)
		{
			if(a[i] == n)
			{
				b = true;
				break;
			}
		}

		System.out.println((b)? n + " found at " + i + " index." : n + " not found.");
	}

	public static void last_element_display()
	{
		System.out.println("Last element is : " + a[r]);
	}

	public static void update(int n)
	{
		a[r] = n;
	}

	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int n, c;
		
		do
		{
			System.out.println("\n");
			System.out.println("Queue Operation -");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Searching");
			System.out.println("5. Display last element");
			System.out.println("6. Update last element");
			System.out.println("7. Exit");

			System.out.println("Enter the choice: ");
			c = sc.nextInt();

			switch(c)
			{
				case 1:
					if(r == a.length - 1) System.out.println("Queue is full");
					else 
					{
						if(f == -1) f = 0;

						System.out.println("Enter the number: ");
						n = sc.nextInt();
						insert(n);
						System.out.println(n + " is successfully added.");
					}
					break;

				case 2:
					if(r == -1) System.out.println("Queue is empty");
					else delete();
					break;

				case 3:
					if(r == -1) System.out.println("Queue is empty");
					else display();
					break;

				case 4: 
					if(r == -1) System.out.println("Queue is empty");
					else
					{
						System.out.println("Enter the searching element: ");
						n = sc.nextInt();
						search(n);
					}
					break;

				case 5:
					if(r == -1) System.out.println("Queue is empty");
					else last_element_display();
					break;

				case 6:
					if(r == -1) System.out.println("Queue is empty");
					else
					{
						System.out.println("Enter the updated number: ");
						n = sc.nextInt();
						update(n);
						System.out.println(n + " is succesfully updated");
					}
					break;

				case 7:
					sc.close();
					System.out.println("You exited successfully.");
					System.exit(0);

				default:
					System.out.println("You entered wrong choice.");
			}
		}
		while(true);
	}
}