/*
	Escreva um método que converta uma temperatura em graus Celsius para Fahrenheit ou vice-versa(escolha por parametro)
	C=5/9*(F-32)
	F=(C/5)*9+32
*/
import java.util.Scanner;
class Ex7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da temperatura inicial: ");
		double temperatura = sc.nextDouble();
		System.out.println("Escolha o tipo de conversão:\n1\tCelsius -> Fahrenheit \n2\tFahrenheit -> Celsius");
		int tipoConv = sc.nextInt();

		System.out.println("A temperatura convertida é igual a: "+ converteTemperatura(tipoConv,temperatura));
	}
	//Converte entre Celsius e Fahrenheit
	//1 -  Celsius -> Fahrenheit
	//2 - Fahrenheit -> Celsius
	//Retorna -1 em caso de valores inadequados!
	static double converteTemperatura(int opcaoConv, double temperatura)
	{
		switch(opcaoConv)
		{
			case 1:
				return ((9*temperatura)/5)+32;

			case 2:
				return ((temperatura-32)/9)*5;

			default:
				return -1;
		}
	}
}