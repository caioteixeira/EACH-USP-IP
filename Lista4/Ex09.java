/*
	Escreva um método que dado um arranjo a de inteiros, retorne um arranjo p formado pelo indices dos elementos pares do arranjo a. 
*/
class Ex09
{
	public static void main(String[] args)
	{
		int[] arranjo = {2,3,4,7,2,10,1};
		int[] teste = indicesDeElementosPares(arranjo);
		for(int e : teste)
			System.out.println(e);
	}
	static int[] indicesDeElementosPares(int[] arranjo)
	{
		int tamanhoDaSaida = 0;
		for(int e: arranjo)
		{
			if(e%2==0)
				tamanhoDaSaida++;
		}
		int[] saida = new int[tamanhoDaSaida];
		int cont = 0;
		for(int i = 0; i < arranjo.length; i++)
		{
			if(arranjo[i]%2==0)
			{
				saida[cont] = i;
				cont++;
			}
		}
		return saida;
	}
}