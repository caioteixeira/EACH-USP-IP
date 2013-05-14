/*
	Escreva um programa que converta um valor em real(em uma variavel), para dolar.
	A taxa de conversão real para dolar também é um dado do programa.

*/

class Ex6
{
	public static void main(String[] args)
	{
		double valorReais = 2.5;
		double taxaConversão = 1.98;
		double valorDolar = valorReais * taxaConversão;
		System.out.println(valorDolar);
	}
}