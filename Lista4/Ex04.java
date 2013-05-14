/*
	Escrever um método que determine a posição da ultima ocorrência do valor máximo.
	Escreva outro método que determine a primeira ocorrência do valor minimo em um arranjo de inteiros.
*/
class Ex04
{
	public static void main(String[] args)
	{
		int arranjo[] = {2,12,5,2,4,3,12,5,12,8};
		System.out.println(posValorMaximo(arranjo) + "\t" + arranjo[posValorMaximo(arranjo)]);
		System.out.println(posValorMinimo(arranjo) + "\t" + arranjo[posValorMinimo(arranjo)]);
	}
	static int posValorMaximo(int[] arranjo)
	{
		int posValorMaximo = 0;
		int valorMaximo = arranjo[0];
		for(int i = 0; i < arranjo.length; i++)
		{
			if(arranjo[i] >= valorMaximo)
			{
				valorMaximo = arranjo[i];
				posValorMaximo = i;
			}
		}
		return posValorMaximo;
	}
	static int posValorMinimo(int[] arranjo)
	{
		int posValorMinimo = 0;
		int valorMinimo = arranjo[0];
		for(int i = 0; i < arranjo.length; i++)
		{
			if(arranjo[i]<valorMinimo)
			{
				valorMinimo = arranjo[i];
				posValorMinimo =  i;
			}
		}
		return posValorMinimo;
	}
}