/*
	Escreva um método que receba como parâmetro um arranjo de n numeros Xi e um arranjo de n pesos Pi, calculando então sua média ponderada

*/
class Ex06
{
	public static void main(String[] args)
	{
		int[] numeros = {7,6,8,7};
		int[] pesos = {1,2,3,4};

		System.out.println(mediaPonderada(numeros,pesos));
	}
	static int mediaPonderada(int[] numeros, int[] pesos)
	{
		int somaValores = 0;
		int somaPesos = 0;

		if (numeros.length == pesos.length) //Verifica se os arrays tem o mesmo tamanho
		{
			for(int i = 0; i < numeros.length; i++) 
			{
				somaValores += numeros[i] * pesos[i];
				somaPesos += pesos[i];
			}
			return somaValores/somaPesos;
		}
		else
		{
			return -1;
		}
	}
}