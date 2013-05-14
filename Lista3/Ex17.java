/*
	Crie um método que verifique seu um numero passado como parametro é primo.
*/
import java.util.Scanner;
class Ex17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor a ser testado: ");
		long valor = sc.nextLong();

		System.out.println(primo(valor)?"É primo!":"Não é primo!");
	} 
	static boolean primo(long valor)
	{
		if(valor == 1)
			return false;
		if(valor == 2)
			return true;

		for(int i = 2; i<valor/2; i++)
		{
			if(valor%i==0)
				return false;
		}
		return true;
	}
}