// Circular Queue

import java.util.Scanner;

public class Q1_Circular_Queue
{
	static int[] a = new int[5];
	static int f = -1;
	static int r = -1;
	static int i;

	public static void insert(int n)
	{
		r = (r + 1) % a.length;
		a[r] = n;
	}

	public static void delete()
	{
		System.out.println(a[f] + " element deleted successfully.");
		f = (f + 1) % a.length;
		if(f == r)
		{
			f = -1;
			r = -1;
		}
	}

	public static void display()
	{
		System.out.println("Circular Queue is - ");
		for(i = f; ;i = (i + 1) % a.length)
		{
			System.out.print(a[i] + " ");
			if(i == r) break;
		}

	}

	public static void search(int n)
	{
		boolean b = false;
		for(i = f; ; i = (i + 1) % a.length)
		{
			if(n == a[i])
			{
				b = true;
				break;
			}

			if(i == r) break;
		}

		System.out.println((b)? n + " element is found at " + i + " index in circular queue." : n + " element is not found in circular queue.");
	}

	public static void last_element_display()
	{
		System.out.println("Last element is: " + a[f]);
	}

	public static void last_element_update(int n)
	{
		a[f] = n;
	}

	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int c, n;

		do
		{
			System.out.println("\n\nCircular Queue Operations -");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Search");
			System.out.println("5. Display last element");
			System.out.println("6. Update last element");
			System.out.println("7. Exit");

			System.out.println("Enter the choice: ");
			c = sc.nextInt();

			switch(c)
			{
				case 1:
					if((r + 1) % a.length == f) System.out.println("Circular Queue is full");
					else
					{
						if(f == -1) f = 0;
						System.out.println("Enter the element: ");
						n = sc.nextInt();
						insert(n);
						System.out.println(n + " is sucessfully added in circular queue.");
					}
					break;

				case 2:
					if(f == -1 && r == -1) System.out.println("Circular Queue is empty");
					else delete();
					break;

				case 3:
					if(f == -1 && r == -1) System.out.println("Circular Queue is empty");
					else display();
					break;

				case 4:
					if(f == -1 && r == -1) System.out.println("Circular Queue is empty");
					else
					{
						System.out.println("Enter the searching element: ");
						n = sc.nextInt();
						search(n);
					}
					break;

				case 5:
					if(f == -1 && r == -1) System.out.println("Circular Queue is empty");
					else last_element_display();
					break;

				case 6:
					if(f == -1 && r == -1) System.out.println("Circular Queue is empty");
					else 
					{
						System.out.println("Enter the element for update: ");
						n = sc.nextInt();
						last_element_update(n);
						System.out.println("Last element is successfully updated.");
					}
					break;

				case 7:
					System.out.println("You exited successfully");
					sc.close();
					System.exit(0);

				default:
					System.out.println("Wrong Choice!!!");
			}
		} 
		while(true);
	}
}