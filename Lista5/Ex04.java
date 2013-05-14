/*
	Escreva um método que altere os valores dos elementos da matriz de valores reais de tal forma que:
	o valor alterado corresponda ao valor original dividido pelo maior valor original encontrado na coluna.
*/
class Ex04
{
	public static void main(String[] args)
	{
		int[][] teste = {{3,2,2},{3,3,3},{3,4,2}};

		imprimeMatriz(teste);
		alteraValores(teste);
		System.out.println("\nAlterou valores!\n");
		imprimeMatriz(teste);
	}
	static void alteraValores(int[][] matriz)
	{
		for(int i = 0; i < matriz.length; i++) //Percorre as colunas
		{
			int maiorValor = matriz[0][i];
			for(int j = 0; j<matriz[0].length; j++) //Verifica qual o maior valor da coluna
			{
				if(matriz[j][i] > maiorValor)
				{
					maiorValor = matriz[j][i];
				}
			}
			for(int j = 0; j<matriz[0].length; j++)
			{
				matriz[j][i] /= maiorValor;
			}
		}
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