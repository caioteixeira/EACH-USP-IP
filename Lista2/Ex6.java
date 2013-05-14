/*
	Escreva um método que dado 3 valores inteiros retorne o maior deles.
*/
import java.util.Scanner;
class Ex6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite três valores: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println("O maior valor é: "+maior(a,b,c));
	}
	static int maior(int a, int b, int c)
	{
		int maior = c;
		if(a>c)
			maior = a;
		if(b>c)
			maior = b;
		return maior;
	}
}