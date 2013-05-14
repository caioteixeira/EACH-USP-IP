/*
	Desenvolva um programa que calcule a soma dos 10 primeiros numeros inteiros pares positivos.
*/
class Ex5
{
	public static void main(String[] args)
	{
		int soma = 0;
		int i=1;
		while(i<=10)
		{
			soma += i;
			i++;
		}
		System.out.println(soma);
	}
}