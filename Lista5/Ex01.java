/*	
	Escrever métodos que recebam uma matriz n x m inteiro como parâmetro e:
		a) Determine o maior valor nela contido;
		b) Retorne a posição da matriz em que se encontra o valor máximo(em um arranjo: posição 0(linha), posição 1(coluna))
*/
class Ex01
{
	public static void main(String[] args)
	{
		int[][] teste = {{1,2,3,4},{4,3,2},{3,5,2,1}};
		int[] pos = posMaiorValor(teste);

		System.out.println(maiorValor(teste));
		System.out.println(pos[0]+"\t"+pos[1]);
	}
	static int maiorValor(int[][] matriz)
	{
		int maiorValor = matriz[0][0];

		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[i].length; j++)
			{
				if(matriz[i][j] > maiorValor)
				{
					maiorValor = matriz[i][j];
				}
			}
		}
		return maiorValor;

	}
	static int[] posMaiorValor(int[][] matriz)
	{
		int maiorValor = matriz[0][0];
		int[] posMaiorValor = {0,0};

		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j<matriz[i].length; j++)
			{
				if(matriz[i][j] > maiorValor)
				{
					maiorValor = matriz[i][j];
					posMaiorValor[0] = i;
					posMaiorValor[1] = j;
				}
			}
		}
		return posMaiorValor;
	}
}