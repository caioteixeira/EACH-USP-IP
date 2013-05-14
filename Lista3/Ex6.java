/*
	Escreva um programa que dê os 10 primeiros cubos
*/
class Ex6
{
	public static void main(String[] args)
	{
		System.out.println("Valor\tValor ao cubo");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i + "\t"+ Math.pow(i,3));
		}
	}
}