/*
	Crie um método que verifique se uma matriz de n linhas e colunas é um quadrado mágico;
*/
class Ex11
{
	public static void main(String[] args)
	{
		int[][] teste = {{8,0,7},{4,5,6},{3,10,2}};

		System.out.println(isQuadradoMagico(teste));
	}
	static boolean isQuadradoMagico(int[][] matriz)
	{
		int soma = 0;
		for(int i = 0; i <matriz.length; i++) //Calcula a primeira soma
			soma += matriz[0][i];

		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;

		for(int i = 0; i<matriz.length; i++)
		{
			int somaLinha = 0;
			int somaColuna = 0;
			for(int j = 0; j<matriz[0].length; j++)
			{
				somaLinha += matriz[i][j];
				somaColuna += matriz[j][i];
			}
			somaDiagonalPrincipal += matriz[i][i];
			somaDiagonalSecundaria += matriz[matriz.length-i-1][matriz.length-i-1];
			if(somaLinha != soma || somaColuna != soma)
				return false;
		}
		if(somaDiagonalSecundaria != soma || somaDiagonalPrincipal != soma)
			return false;

		return true;
	}
}