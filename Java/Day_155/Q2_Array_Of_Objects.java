// Array of Objects
import java.util.Scanner;

class Q2_Employee
{
	int id;
	String name;
	int salary;
}

public class Q2_Array_Of_Objects
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int n, i;

		System.out.println("Enter the number of employees: ");
		n = sc.nextInt();

		Q2_Employee e[] = new Q2_Employee[n]; // Array of reference

		for(i = 0; i < n; i++)
		{
			e[i] = new Q2_Employee(); // Array of object
	
			System.out.println("Enter the id, name & salary of employees: ");
			e[i].id = sc.nextInt();
			e[i].name = sc.next();
			e[i].salary = sc.nextInt();
			sc.nextLine();
		}

		sc.close();
		System.out.println("Employee's Details -");
		System.out.println("Id Name Salary");

		for(i = 0; i < n; i++) System.out.println(e[i].id + " " + e[i].name + " " + e[i].salary);
	}
}