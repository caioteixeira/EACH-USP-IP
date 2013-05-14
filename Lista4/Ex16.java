/*
	Escreva um método que dado três valores inteiros, retorne a posição do maior e a posição do menor(em um arranjo)
	Exercicio 16
*/
class Ex16
{
	public static void main(String[] args)
	{
		int[] teste = posicaoMaiorMenor(1,7,5);

		System.out.println("Maior: "+teste[0] + " Menor: "+teste[1]);
	}
	static int[] posicaoMaiorMenor(int a,int b,int c)
	{
		int[] valores =  {a,b,c};
		int maiorValor = 0;
		int menorValor = a;

		int[] saida = {0,0};

		for(int i = 0; i < valores.length; i++)
		{
			if(valores[i] > maiorValor)
			{
				saida[0] = i;
				maiorValor = valores[i];
			}
			else if(valores[i] < menorValor)
			{
				saida[1] = i;
				menorValor = valores[i];
			}
		}
		return saida;
	}
}