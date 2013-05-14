/*
	Calcule o valor a ser pago por um aluno de uma academia de ginástica,
	sabendo que ele terá um desconto de 7% se pagar antecipado.
	Método deverá receber como entrada qual opção pretendida (pagamento normal ou antecipado)
	,numero de horas/aula e o valor da hora/aula, retornando então o calculo;
*/
import java.util.Scanner;

class Ex4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a opção de pagamento:\n1\tPagamento antecipado\n2\tPagamento normal");
		int opcao = sc.nextInt();

		System.out.println("Digite o valor da Hora/Aula");
		double valorAula = sc.nextDouble();

		System.out.println("Digite a quantidade de aulas a ser cobradas:");
		int numAulas = sc.nextInt();

		double valor = valorPagamento(opcao,numAulas,valorAula);

		System.out.println(valor>0?"O valor total é: R$"+valor:"Erro! Você digitou algum valor invalido!");


	}
	//Método calcula o valor do pagamento
	//Opção: 1: Antecipado 2:Normal 
	//Nota: Qualquer valor invalido retornará -1 como sinal de erro!
	static double valorPagamento(int opcao, int numAulas, double valorAula)
	{
		if(numAulas <0 || valorAula <0)
			return -1.0;
		
		switch (opcao){
			case 1:
				return (numAulas * valorAula) *0.93;
			case 2:
				return (numAulas * valorAula);
			default:
				return -1.0;
		}
	}
}