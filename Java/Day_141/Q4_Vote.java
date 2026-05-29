/*
Q4. Create a class Person with attributes name and age.
Check whether the person is eligible for voting.
Condition: Age >= 18 => Eligible, Otherwise => Not Eligible.
Input:
Enter Name : Rohan
Enter Age : 16

Output:
Name : Rohan
Age : 16
Result : Not Eligible for Voting

Explanation:
A class Person is created with instance variables name and age.
An object is created and user inputs name and age using Scanner.
Condition: if (age >= 18) => Eligible for Voting, else => Not Eligible for Voting.
Since age = 16, which is less than 18, the result is Not Eligible for Voting.
If age were 18 or above (e.g., 20), the result would be Eligible for Voting.
This program demonstrates how class attributes are used with real-world conditional logic.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q4_Vote_Eligible
{
	String s;
	int a;
	Scanner sc = new Scanner(System.in);

	void set()
	{
		System.out.println("Enter Name : ");
		s = sc.next();
		System.out.println("Enter Age : ");
		a = sc.nextInt();
		sc.close();
	}

	void get()
	{
		System.out.println("Name : " + s);
		System.out.println("Age : " + a);
		System.out.print("Results : ");
		System.out.println((a < 18)? "Not eligible for Voting" : "Eligible for Voting");
	}
}

public class Q4_Vote
{
	public static void main(String X[])
	{
		Q4_Vote_Eligible b = new Q4_Vote_Eligible();
		b.set();
		b.get();
	}
}