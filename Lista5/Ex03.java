/*
	Crie um método que determine se uma matriz quadrada é uma matriz permutação
*/
class Ex03
{
	public static void main(String[] args)
	{
		int[][] teste = {{0,0,1},{1,0,0},{0,1,0}};

		System.out.println(isMatrizPermutacao(teste));	
	}
	static boolean isMatrizPermutacao(int[][] matriz)
	{
		for(int i = 0; i<matriz.length; i++)
		{
			boolean encontrou1linha = false;
			for(int j = 0; j<matriz.length; j++) //Checa a linha
			{
				if(matriz[i][j] == 1)
				{
					if(!encontrou1linha)
						encontrou1linha = true;
					else
						return false;
				}
				else if(matriz[i][j] != 0)
				{
					return false;
				}

			}
			boolean encontrou1coluna = false;
			for(int j = 0; j<matriz.length; j++) //Checa a coluna
			{
				
				if(matriz[j][i] == 1)
				{
					if(!encontrou1coluna)
						encontrou1coluna = true;
					else 
						return false;
				}
			}
			if(!encontrou1coluna || !encontrou1linha) // Se não tiver encontrado na linha ou coluna, retorna false
				return false;
		}
		return true;
	}
}