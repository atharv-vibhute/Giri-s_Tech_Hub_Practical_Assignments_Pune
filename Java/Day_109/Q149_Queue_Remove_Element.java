/*
Question 149: Design a queue using an array. Remove a specific element from the queue.
Input:
Queue: 10, 20, 30
Remove: 20

Output:
Queue: 10 30

Explanation:
To remove specific element, search through array from front to rear, find matching element, shift all elements after it one position left to maintain contiguity and restore queue properties. Queue order preserved throughout operation. Element 20 removed successfully, queue contains remaining elements 10,30. This operation maintains FIFO structure.

Asked In Companies:
Practice Question
*/
import java.util.Scanner;

public class Q149_Queue_Remove_Element
{
	static int[] a = new int[3];
	static int f = -1;
	static int r = -1;
	static int i;

	public static void insert(int n)
	{
		if(f == -1) f = 0;
		r++;
		a[r] = n;
		System.out.println(n + " element is added successfully.");
	}

	public static void delete(int n)
	{
		boolean b = false;
	
		for(i = f; i <= r; i++)
		{
			if(n == a[i])
			{
				while(i < r)
				{
					a[i] = a[i + 1];
					i++;
				}
				r--;
				b = true;
				break;
			}
		}

		if(r == -1) f = -1;
		if(b) System.out.println(n + " element deleted successfully");
		else System.out.println(n + " element is not found");
	}

	public static void display()
	{
		System.out.println("The queue is -");
		for(i = f; i <= r; i++) System.out.print(a[i] + " ");
	}

	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int c, n;

		do
		{
			System.out.println("\nQueue Operations -");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");

			System.out.println("Enter the choice: ");
			c = sc.nextInt();

			switch(c)
			{
				case 1:
					if(r == a.length - 1) System.out.println("Queue is full");
					else
					{
						System.out.println("Enter the number for insert: ");
						n = sc.nextInt();
						insert(n);
					}
					break;

				case 2:
					if(f == -1 && r == -1) System.out.println("Queue is empty");
					else
					{
						System.out.println("Enter the number for delete: ");
						n = sc.nextInt();
						delete(n);
					}
					break;

				case 3:
					if(f == -1 && r == -1) System.out.println("Queue is empty");
					else display();
					break;

				case 4:
					System.out.println("You exited successfully");
					sc.close();
					System.exit(0);

				default:
					System.out.println("Wrong choice!");
			}
		}
		while(true);
	}
}