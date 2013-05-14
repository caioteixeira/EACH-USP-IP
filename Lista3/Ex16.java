/*
	Exercicio 16, enunciado no PDF
*/
import java.util.Scanner;
class Ex16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor do investimento: ");
		int valor = sc.nextInt();
		System.out.print("Insira o numero de meses: ");
		int meses = sc.nextInt();
		System.out.print("Insira a taxa de juros ao mês: ");
		double juros = sc.nextDouble();

		imprimeTabela(valor,meses,juros);
	}
	static void imprimeTabela(int a, int n, double r)
	{
		System.out.println("Numero de meses\tInvestimento Acumulado");
		for(int i=1; i<=n; i++)
		{
			if(i==1)
				System.out.println(i+"\t\t"+a+" + ("+r+" x "+a+") = "+ (a*(1+r)));
			else
				System.out.println(i+"\t\t"+a+" + (1 x "+r+")^"+ (i-1) +" x " + "(1 x "+r+") = "+ (a*Math.pow((1+r),i)));	
		}
	}
}