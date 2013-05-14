/*
	Escreva um método que determine o indice de uma matriz n x m de inteiros com o maior valor de soma de elementos por colunas.
*/
class Ex08
{
	public static void main(String[] args)
	{
		int[][] a = {{2,5,4,10},{-3,8,5,1},{4,0,11,7}};
		System.out.println(indiceMaiorSomaColuna(a));
	}
	static int indiceMaiorSomaColuna(int[][] matriz)
	{
		int maiorSoma = 0;
		int indiceMaiorSoma = 0;
		for(int i = 0; i<matriz[0].length; i++) //Percorre as colunas
		{
			int somaColuna = 0;
			for(int j = 0; j<matriz.length; j++) // Soma os elementos da coluna;
			{
				somaColuna += matriz[j][i];
			}
			if(somaColuna > maiorSoma)
			{
				maiorSoma = somaColuna;
				indiceMaiorSoma = i;
			}
		}
		return indiceMaiorSoma;
	}
}