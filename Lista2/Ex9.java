/*
	No sistema imperial são utilizadas as seguintes medidas lineares:
		1 pé = 12 polegadas
		1 jarda = 3 pés
		1 milha = 1760 jardas
	Baseado no fato de que 1 polegada equivale a 25.3995 milimetros no sistema métrico, escreva um método que converta
	comprimentos expressos em milhas, jardas, pés e polegadas em quilômetros.
*/

import java.util.Scanner;
class Ex9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double milhas, jardas, pes, polegadas, quilometros;

		System.out.println("Insira o numero de milhas: ");
		milhas = sc.nextDouble();

		System.out.println("Insira o numero de jardas: ");
		jardas = sc.nextDouble();

		System.out.println("Insira o numero de pes: ");
		pes = sc.nextDouble();

		System.out.println("Insira o numero de polegadas: ");
		polegadas = sc.nextDouble();

		quilometros = converteQuilometro(milhas, jardas, pes, polegadas);

		System.out.println("O valor convertido é igual a: "+quilometros+"km");



	}
	public static double converteQuilometro(double milhas, double jardas, double pes, double polegadas)
	{
		if(milhas!=0)
		{
			jardas += milhas * 1760;
		}
		if(jardas!=0)
		{
			pes += jardas*3;
		}
		if(pes != 0)
		{
			polegadas += pes * 12;
		}

		return (polegadas * 25.3995)/Math.pow(10,6);
	}
}