/*
Question 150: Design two queues using arrays. Check whether both queues are equal.
Input:
Queue1: 10, 20
Queue2: 10, 20

Output:
Queues are equal

Explanation:
Two queues are equal if they have same size and contain identical elements in same order. Compare front to rear of both queues element by element. If all match, queues are equal. Queue1 and Queue2 both contain 10,20 in order, so equal.

Asked In Companies:
Practice Question
*/

public class Q150_Queue_Two_Equal
{
	public static void main(String X[])
	{
		int[] a = {10, 20};
		int[] b = {10, 20};
		boolean f = true;
		int i;

		if(a.length == b.length)
		{
			for(i = 0; i < a.length; i++) 
			{
				if(a[i] != b[i]) 
				{
					f = false;
					break;
				}
			}
		}
		
		if(f) System.out.println("Queues are equal");
		else System.out.println("Queues are not equal");
	} 
}