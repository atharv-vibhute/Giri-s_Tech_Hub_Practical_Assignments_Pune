// 4. Write a program to perfrom the additon, subbtraction, multiplication and division of two numbers 

public class Q4_Arithmetic_Operation
{
	public static void main(String X[])
	{
		int in1 = 12;
		int in2 = 4;

		int ia = in1 + in2;
		int is = in1 - in2;
		int im = in1 * in2;
		double id = (double)in1 / in2;

		System.out.println("Addition="+ia);
		System.out.println("Substraction="+is);
		System.out.println("Multiplication="+im);
		System.out.println("Division="+id);
	}
}