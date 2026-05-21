// Q 9. Write a java program swap two number without using third variable

public class Q9_Swap_Without_Third
{
	public static void main(String X[])
	{
		int in1 = 20;
		int in2 = 90;

		System.out.println("Before Swapping");
		System.out.println("First Number: "+in1+"\t Second Number: "+in2);

		in1 = in1 + in2;
		in2 = in1 - in2;
		in1 = in1 - in2;

		System.out.println("After Swapping");
		System.out.println("First Number: "+in1+"\t Second Number: "+in2);
	}
}