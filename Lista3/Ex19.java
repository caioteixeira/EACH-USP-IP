/*
	Imprima uma tabuada com n linhas e m colunas
*/

import java.util.Scanner;
class Ex19
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o numero de linhas: ");
		int linhas = sc.nextInt();

		System.out.print("Insira o numero de colunas: ");
		int colunas = sc.nextInt();

		tabuada(linhas,colunas);
	}
	static void tabuada(int m, int n)
	{
		for(int i = 1; i<=m; i++)
		{
			for(int j = 1; j<=n; j++)
			{
				System.out.print(j*i + "\t");
			}
			System.out.print("\n");
		}
	}
}