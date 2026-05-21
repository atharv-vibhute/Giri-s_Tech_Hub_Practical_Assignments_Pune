/*
Q33. There are a total n number of monkeys sitting on the branches of a huge tree. As travelers offer bananas and peanuts, the monkeys jump down the tree. If every Monkey can eat k Bananas and j Peanuts. If the total m number of Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat.
At a time one Monkey gets down and finishes eating and goes to the other side of the road. The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating.
Monkeys can either eat k Bananas or j Peanuts. If for the last monkey there are less than k Bananas left on the ground or less than j Peanuts left on the ground, only that Monkey can eat Bananas(<j).
Write code to take inputs as n, m, p, k, j and return the number of Monkeys left on the Tree.
Where,
n= Total no of Monkeys
k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
m = Total number of Bananas
p = Total number of Peanuts
Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero.
Example : Input Values 20  2  3  12  12
    Output Values Number of Monkeys left on the tree : 10 
*/

public class Q33_Monkeys
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int k = Integer.parseInt(X[1]);
		int j = Integer.parseInt(X[2]);
		int m = Integer.parseInt(X[3]);
		int p = Integer.parseInt(X[4]);
		int i = 0;
		
		if(m % k != 0)
		{
			m = m / k;
			m++;
		} 
		else
		{
			m = m / k;
		}

		if(p % j != 0)
		{
			p = p / j;
			p++;
		}
		else
		{
			p = p / j;
		}

		System.out.println("Values Number of Monkeys left on the tree : " + (n - m - p));
	}
}