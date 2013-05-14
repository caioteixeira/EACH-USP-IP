/*
	Escreva três versões de um método que escreva n>=0 asteriscos, sendo n passado como parâmetro:
	1: For
	2: While
	3: Do-While
*/
import java.util.Scanner;
class Ex15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira N:");
		int n = sc.nextInt();

		escreveFor(n);
		escreveWhile(n);
		escreveDoWhile(n);

	}
	static void escreveFor(int n)	
	{
		for(int i=0; i<n; i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
	static void escreveWhile(int n)
	{
		int i = 0;
		while(i<n)
		{
			System.out.print("*");
			i++;
		}
		System.out.print("\n");
	}
	static void escreveDoWhile(int n)
	{
		if(n>0)
		{
			int i = 0;
			do
			{
				System.out.print("*");
				i++;
			}while(i<n);
		}
		System.out.print("\n");

	}
}