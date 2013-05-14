/*
	Escreva um método que calcule a média de 6 valores, descartando os valores máximos e minimos.
*/
class Ex05
{
	public static void main(String[] args)
	{
		int[] arranjo = {5,8,7,6,10,2};
		System.out.println(calculaMedia(arranjo));
	}
	static int calculaMedia(int[] arranjo)
	{
		int posValorMaximo = posValorMaximo(arranjo);
		int posValorMinimo = posValorMinimo(arranjo);

		int media = 0;
		for(int i = 0; i<6; i++)
		{
			if(i!=posValorMinimo && i!=posValorMaximo)
			{
				media+=arranjo[i];
			}
		}
		media /= 4;
		return media;
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