// Stack
import java.util.Scanner;

public class Q1_Stack
{
	static int[] a = new int[5];
	static int p = -1;
	static int i;
	static int n;

	public static boolean isEmpty()
	{
		if(p == -1) return true;
		else return false;
	}

	public static boolean isFull()
	{
		if(p == a.length - 1) return true;
		else return false;
	}

	public static void display()
	{
		System.out.println("The stack is -");
		for(i = 0; i <= p; i++) System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void push(int n)
	{
		p++;
		a[p] = n;
		System.out.println(a[p] + " is added successfully.");
	}

	public static void pop()
	{
		System.out.println(a[p] + " is deleted successfully.");
		p--;
	}

	public static void peek()	
	{
		System.out.println("The last element is: " + a[p]);
	}

	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int c;

		do
		{
			System.out.println("\nStack Operations -");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");

			System.out.println("Enter the choice: ");
			c = sc.nextInt();

			switch(c)
			{
				case 1:
					if(isFull()) System.out.println("Stack is full");
					else
					{				
						System.out.println("Enter the element for add: ");
						n = sc.nextInt();
						push(n);
					}
					break;

				case 2:
					if(isEmpty()) System.out.println("Stack is empty");
					else pop();
					break;
		
				case 3: 
					if(isEmpty()) System.out.println("Stack is empty");
					else peek();
					break;
		
				case 4:
					if(isEmpty()) System.out.println("Stack is empty");
					else display();
					break;

				case 5:
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