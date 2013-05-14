/*
	Escreva um método que dados dois numeros, verifica se o segundo é divisor do primeiro, retornando true se for e false se não;

*/
import java.util.Scanner;
class Ex11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int num = sc.nextInt();

		System.out.println("Digite o segundo valor: ");
		int divisor = sc.nextInt();

		System.out.println(isDivisor(num,divisor)?"É divisor":"Não é divisor");
	}
	public static boolean isDivisor(int num, int divisor)
	{
		return num%divisor==0;
	}
}
