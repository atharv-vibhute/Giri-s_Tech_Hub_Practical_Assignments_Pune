// Q 8. Write a java program swap two number using third variable. 

public class Q8_Swap_Third
{
	public static void main(String X[])
	{
		int in1 = 67;
		int in2 = 45;

		System.out.println("Before Swapping");
		System.out.println("First Number: "+in1+"\t Second Number: "+in2);
		
		int in3 = in1;
		in1 = in2;
		in2 = in3;

		System.out.println("After Swapping");
		System.out.println("First Number: "+in1+"\t Second Number: "+in2);
	}
}