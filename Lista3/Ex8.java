/*
	Escreva um programa que escreva os 15 primeiros numeros positivos, seus quadrados e cubos
*/
class Ex8
{
	public static void main(String[] args)
	{
		System.out.println("Valor\tValor²\tValor³)";
		for(int i = 1; i <= 15; i++)
		{
			System.out.println(i + "\t" + Math.pow(i,2)+ "\t" + Math.pow(i,3));
		}
	}
}