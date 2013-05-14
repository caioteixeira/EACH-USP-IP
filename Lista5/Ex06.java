/*
	Faça um método que multiplique duas matrizes
*/
class Ex06
{
	public static void main(String[] args)
	{
		int[][] a = {{2,3,1},{-1,4,2}};
		int[][] b = {{3,4},{1,5},{2,-6}};
		int[][] c = multiplicaMatrizes(a,b);
		imprimeMatriz(c);
  	}
	static int[][] multiplicaMatrizes(int[][] a, int[][] b)
	{
		/*
			//
  			//calcula o produto mat1*mat2 e armazena em mat3
  			//
  			for(int linha=0; linha<mat1.length; linha++)
    			for(int coluna=0; coluna<mat2[0].length; coluna++){
      				int acumula_somaprod=0;
      				for(int i=0; i<____________; i++)
        				acumula_somaprod=acumula_somaprod+mat1[linha][i]*mat2[i][coluna];
      				mat3[linha][coluna]=acumula_somaprod;
  			  	} 
		*/

		int[][] c = new int[a.length][b[0].length];

		for(int linha = 0; linha<a.length; linha++)
		{
			for(int coluna = 0; coluna < b[0].length; coluna++)
			{
				int acumula_somaprod = 0;
				for(int i = 0; i<c.length; i++)
					acumula_somaprod = acumula_somaprod + a[linha][i]*b[i][coluna];
				c[linha][coluna] = acumula_somaprod;
			}
		}
		return c;

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