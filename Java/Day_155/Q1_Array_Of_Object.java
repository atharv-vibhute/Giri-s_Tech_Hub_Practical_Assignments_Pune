// Array of objects
import java.util.Scanner;

class Q1_Student
{
	int id;
	String name;
	int marks;
}

public class Q1_Array_Of_Object
{
	public static void main(String X[])
	{
		int i;
		Scanner sc = new Scanner(System.in);
		Q1_Student[] s = new Q1_Student[5];	// Array of reference
		
		for(i = 0; i < s.length; i++)
		{
			s[i] = new Q1_Student(); // Array of object

			System.out.println("Enter the students id, name & markds in given below: ");
			s[i].id = sc.nextInt();
			s[i].name = sc.next();
			s[i].marks = sc.nextInt();
			sc.nextLine();
		}

		sc.close();
		System.out.println("Id - Name - Marks");
		for(i = 0; i < s.length; i++) System.out.println(s[i].id + " " + s[i].name + " " + s[i].marks);
	}
}