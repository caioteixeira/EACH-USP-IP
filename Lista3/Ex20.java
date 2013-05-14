/*
	Verifique se um numero é quadrado perfeito...
*/
import java.util.Scanner;
class Ex20
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor: ");
		int n = sc.nextInt();

		System.out.println(isQuadradoPerfeito(n)?"É quadrado perfeito":"Não é quadrado perfeito");
		
	}
	static boolean isQuadradoPerfeito(int n)
	{
		int m = (int)Math.sqrt(n);
		int soma = 0;
		int valorImpar = 1;
		int contador = 1;
		while(contador <= m)
		{	
			soma+=valorImpar;
			contador++;
			valorImpar+=2;
		}
		return soma == n;
	}
}