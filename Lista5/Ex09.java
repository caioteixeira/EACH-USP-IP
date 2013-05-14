/*
	Escreva um método que calcule a transposta de uma matriz
*/
class Ex09
{
	public static void main(String[] main)
	{
		int[][] teste = {{1,3,7},{-4,5,6}};
		imprimeMatriz(teste);
		System.out.println("\nTransposta!\n");
		int[][] transposta = calculaTransposta(teste);
		imprimeMatriz(transposta);
	}
	static int[][] calculaTransposta(int[][] matriz)
	{
		int[][] transposta = new int[matriz[0].length][matriz.length];
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[0].length;j++)
			{
				transposta[j][i] = matriz[i][j];
			}
		}
		return transposta;
	}
	static void imprimeMatriz(int[][] matriz)
	{
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[i].length; j++)
			{
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}