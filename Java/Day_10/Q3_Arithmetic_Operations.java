/*
Q3. Write a Java program to enter two numbers and perform addition, subtraction, multiplication, division, and modulus. 
Input: 
Number1 = 20 
Number2 = 5 
Output: 
Addition = 25 
Subtraction = 15 
Multiplication = 100 
Division = 4 
Modulus = 0 
Explanation : All arithmetic operations are performed using the two input numbers. 
*/

public class Q3_Arithmetic_Operations
{
	public static void main(String X[])
	{
		int Number1 = Integer.parseInt(X[0]);
		int Number2 = Integer.parseInt(X[1]);

		int Addition = Number1 + Number2;
		int Subtraction = Number1 - Number2;
		int Multiplication = Number1 * Number2;
		float Division = (float)Number1 / Number2;
		int Modulus = Number1 % Number2;

		System.out.println("Addition = " + Addition);
		System.out.println("Subtraction = " + Subtraction);
		System.out.println("Multiplication = " + Multiplication);
		System.out.println("Modulus = " + Modulus);
	}
}