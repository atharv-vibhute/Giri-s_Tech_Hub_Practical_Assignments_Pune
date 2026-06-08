// Circular Queue
// https://youtu.be/va_6RmSrKCg
// ChatGPT
import java.util.Scanner;

public class Q3_Circular_Queue
{
	static int[] a = new int[5];
	static int i;
	static int f = -1;
	static int r = -1;

	public static boolean isEmpty()
	{
		if(f == -1 && r == -1) return true;
		else return false;
	}

	public static boolean isFull()
	{
		if((r + 1) % a.length == f) return true;
		else return false;
	}

	public static void insert(int n)
	{
		if(f == -1) f = 0;

		r = (r + 1) % a.length;
		a[r] = n;
		System.out.println(a[r] + " successfully added");
	}

	public static void delete()
	{
		System.out.println(a[f] + " successfully deleted");

		if(f == r) 
		{
			f = -1;
			r = -1;
		}	
		else f = (f + 1) % a.length;	
	}

	public static void display()
	{
		System.out.println("Circular Queue -");
		for(i = f; ; i = (i + 1) % a.length) 
		{
			System.out.print(a[i] + " ");
			if(i == r) break;
		}
		System.out.println();
	}

	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int n, c;

		do
		{
			System.out.println("\nQueue Operations -");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");

			System.out.println("Enter the choise: ");
			c = sc.nextInt();

			switch(c)
			{
				case 1:
					if(isFull()) System.out.println("Queue is full");
					else
					{
						System.out.println("Enter the number: ");
						n = sc.nextInt();
						insert(n);
					}
					break;

				case 2:
					if(isEmpty()) System.out.println("Queue is empty");
					else delete();
					break;

				case 3: 
					if(isEmpty()) System.out.println("Queue is empty");
					else display();
					break;

				case 4:
					sc.close();
					System.out.println("You exited successfully");
					System.exit(0);
		
				default:
					System.out.println("Wrong Choise!!! Please try again");
			}
		}
		while(true);
	}
}