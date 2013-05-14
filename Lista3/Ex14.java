/*
	Escreva um programa que desenhe um quadrado de n linhas e m colunas;
*/
import java.util.Scanner;
class Ex14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de linhas: ");
		int numLinhas = sc.nextInt();

		System.out.print("Digite o numero de colunas: ");
		int numColunas = sc.nextInt();

		desenhaQuadrado(numLinhas, numColunas);
	}
	static void desenhaQuadrado(int linhas, int colunas)
	{
		for(int i = 1; i<= linhas; i++)
		{
			for(int j=1; j<=colunas; j++)
			{
				if(i==1 || i==linhas || j==1 || j==colunas)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}