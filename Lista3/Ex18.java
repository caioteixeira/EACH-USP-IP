/*
	Verifique se um numero é palindromo...
*/
import java.util.Scanner;
class Ex18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor: ");
		int valor = sc.nextInt();

		System.out.println(isPalindromo(valor)?"É Palindromo!":"Não é palindromo");				
	}
	//Testa se é palindromo
	static boolean isPalindromo(int valor)  
	{
		if(inv(valor)==valor)
			return true;
		return false;
	}
	static int inv(int valor)
	{
		int i = 0;
		while(valor>0) //Inverte o valor;
		{
			i*=10;
			i+=valor%10;
			valor/=10;
		}
		return i;
	}
}