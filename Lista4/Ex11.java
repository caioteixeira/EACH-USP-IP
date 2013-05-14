
/*
	Exercicio 11 (ver pdf)
	Dado um arranjo com as ocorrencias de um lançamento de um dado, retornar um arranjo com o numero de ocorrencias de cada face;
*/
class Ex11
{
	public static void main(String[] args)
	{
		int[] teste = {1,2,4,2,4,5,4,6,5,3,1};
		int[] resultado = dadoNumOcorrencias(teste);
		for(int i = 0; i< resultado.length; i++)
		{
			System.out.println((i+1)+"\t"+resultado[i]);
		}
	}
	static int[] dadoNumOcorrencias(int[] arranjo)
	{
		int[] saida = new int[6];
		for(int elemento : arranjo)
			if(elemento <= 6)
				saida[elemento-1]++;

		return saida;
	}
}