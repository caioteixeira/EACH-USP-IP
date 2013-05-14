/*
	Faça um método que retorne a soma de duas matrizes
*/
class Ex05
{
	public static void main(String[] args)
	{
		int[][] a = {{1,2,3},{2,2,2},{4,5,6}};
		int[][] b = {{3,2,1},{2,3,4},{2,1,2}};
		int[][] c = somaMatrizes(a,b);

		imprimeMatriz(a);
		System.out.println("\n");
		imprimeMatriz(b);
		System.out.println("\n");
		imprimeMatriz(c);

 	}
	static int[][] somaMatrizes(int[][] matrizA, int[][] matrizB)
	{
		int[][] matrizSoma = new int[matrizA.length][matrizB[0].length];
		for(int i = 0; i < matrizSoma.length; i++)
		{
			for(int j = 0; j < matrizSoma[0].length; j++)
			{
				matrizSoma[i][j] =  matrizA[i][j] + matrizB[i][j];
			}
		}
		return matrizSoma;
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