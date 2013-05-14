/*
	Escreva um método que retorne a soma dos valores da diagonal secundaria de uma matriz quadrada (inteiros)
*/
class Ex02
{
	public static void main(String[] args)
	{
		int[][] teste = {{2,-3,4,3},{5,8,0,-4},{10,1,7,1},{4,5,11,2}};
		System.out.println(somaDiagonalSecundaria(teste));
		int[][] teste2 = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(somaDiagonalSecundaria(teste2));
	}
	static int somaDiagonalSecundaria(int[][] matriz)
	{
		int soma = 0;
		for(int i = 0; i<matriz.length;i++)
		{
			soma += matriz[matriz.length-1-i][i];
		}
		return soma;
	}
}