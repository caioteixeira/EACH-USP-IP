/*
	Escreva um método que receba por parâmetro um inteiro positivo (n),
	calcule seu cubo, somando os n numeros impares consecutivos a partir de M x (M-1) + 1. 
*/
import java.util.Scanner;
class Ex28
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor: ");
		System.out.println(calculaCubo(sc.nextInt()));
	}
	static int calculaCubo(int m)
	{
		// Primeiro impar = M * (M-1) + 1
		int primeiroImpar = m*(m-1)+1;
		int soma = primeiroImpar;
		for(int i = 1; i<m; i++)
		{
			soma +=  primeiroImpar + 2 * i;
		}
		return soma;
	}
}