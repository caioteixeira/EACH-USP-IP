/*
	Escreva um método que determine o maior valor de um arranjo de floats dado como parâmetro
*/

class Ex01
{
	public static void main(String[] args)
	{
		float[] teste =  {1.0f,2.0f,3.0f,1.5f,2.2f,10.0f,12.2f,5.0f};
		System.out.println(maiorValor(teste));
	}
	static float maiorValor(float[] arranjo)
	{
		float maior = 0;
		for(float valor: arranjo)
		{
			if(valor > maior)
				maior = valor;
		}
		return maior;
	}
}