/*
	Desenhe:
	:++++
	+:+++
	++:++
	+++:+
	++++:	
*/
import java.util.Scanner;
class Ex21
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor n: ");
		int n = sc.nextInt();
		desenhaQuadrado(n);
	}
	static void desenhaQuadrado(int n)
	{
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(j==i)
					System.out.print(":");
				else
					System.out.print("+");
			}
			System.out.print("\n");
		}
	}
}