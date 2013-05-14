/*
	Escreva um método que determina a data cronologicamente maior de duas fornecidas como parâmetro.
	Cada data deve ser expressa por três valores inteiros.
*/
import java.util.Scanner;
class Ex8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int data1Dia,data1Mes,data1Ano;
		int data2Dia,data2Mes,data2Ano;

		System.out.println("Digite o dia, mês e ano da Data 1");
		data1Dia = sc.nextInt();
		data1Mes = sc.nextInt();
		data1Ano = sc.nextInt();

		System.out.println("Digite o dia, mês e ano da Data 2");
		data2Dia = sc.nextInt();
		data2Mes = sc.nextInt();
		data2Ano = sc.nextInt();

		int data = maiorData(data1Dia,data1Mes,data1Ano,data2Dia,data2Mes,data2Ano);

		switch(data){
			case 1:
				System.out.println("A maior data é a primeira");
				break;
			case 2:
				System.out.println("A maior data é a segunda");
				break;
			case 3:
				System.out.println("As datas são iguais!");

		}
	}
	static int maiorData(int data1Dia,int data1Mes,int data1Ano, int data2Dia, int data2Mes, int data2Ano)
	{
		if(data1Ano==data2Ano){
			if(data1Mes == data2Mes)
			{
				if(data1Dia == data2Dia)
					return 3;
					else if(data1Dia>data2Dia)
						return 1;
						else
							return 2;
			}
			else if(data1Mes > data2Mes)
				return 1;
				else
					return 2;
			
		}
		else if(data1Ano>data2Ano)
			return 1;
			else
				return 2;
	}
}