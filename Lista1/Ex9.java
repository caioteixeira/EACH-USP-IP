/*
	EX9, calcula o valor da multa com base no numero de cartões vermelhos e amarelos
	Valores da multa:
	Cartão amarelo: R$1000,20
	Cartão vermelho: R$4523,75
*/

import java.util.Scanner;
class Ex9
{
	public static void main(String[] args)
	{
		
		//"Dados 4 inteiros"
		int time;
		int numJogador;
		int numCartõesAmarelos;
		int numCartõesVermelhos;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numero do time:");
		time = scanner.nextInt();
		System.out.println("Digite o numero do jogador");
		numJogador = scanner.nextInt();
		System.out.println("Digite o numero de cartões amarelos");
		numCartõesAmarelos = scanner.nextInt();
		System.out.println("Digite o numero de cartões vermelhos");
		numCartõesVermelhos = scanner.nextInt();


		double valorMultaCartãoAmarelo = 1000.20;
		double valorMultaCartãoVermelho = 4523.75;

		double valorMulta = (numCartõesAmarelos * valorMultaCartãoAmarelo) + (numCartõesVermelhos * valorMultaCartãoVermelho);

		System.out.println("O jogador de camisa "+numJogador+ " do time "+time+" recebeu uma multa total no valor de: R$"+valorMulta);
	}
}