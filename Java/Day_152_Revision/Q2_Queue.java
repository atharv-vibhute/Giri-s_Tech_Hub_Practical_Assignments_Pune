// Queue
import java.util.Scanner;

public class Q2_Queue
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
		if(r == a.length - 1) return true;
		else return false;
	}

	public static void insert(int n)
	{
		if(f == -1) f = 0;

		r++;
		a[r] = n;
		System.out.println(a[r] + " added successfully");
	}

	public static void delete()
	{
		System.out.println(a[f] + " deleted successfully");
		f++;
		if(f > r)
		{
			f = -1;
			r = -1;
		}
	}

	public static void display()
	{
		System.out.println("The queue is -");
		for(i = f; i <= r; i++) System.out.print(a[i] + " ");
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

			System.out.println("Enter choise: ");
			c = sc.nextInt();

			switch(c)
			{
				case 1:
					if(isFull()) System.out.println("Queue is full");
					else
					{
						System.out.println("Enter the number for add: ");
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
					System.out.println("Wrong Choice!!! Please try again");
			}
		}
		while(true);
	}
}