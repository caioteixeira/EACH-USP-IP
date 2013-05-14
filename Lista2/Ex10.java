/*
	De acordo com a velocidade do vento de um furacão, faça um método que retorne a classificação do furacão.

	Tempestade tropical 	62 a 118
	Categoria 1 			119 a 153
	Categoria 2				154 a 177;
	Categoria 3				178 a 209
	Categoria 4				210 a 249
	Categoria 5				maior que 249
*/
import java.util.Scanner;
class Ex10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a velocidade do vento: ");
		int velocidadeVento = sc.nextInt();
		switch(classificaFuracao(velocidadeVento))
		{
			case 1:
				System.out.println("Tempestade tropical");
				break;
			case 2:
				System.out.println("Furacão de categoria 1");
				break;
			case 3:
				System.out.println("Furacão de categoria 2");
				break;
			case 4:
				System.out.println("Furacão de categoria 3");
				break;
			case 5:
				System.out.println("Furacão de categoria 4");
				break;
			case 6:
				System.out.println("Furacão de categoria 5");
				break;
			case 0:
				System.out.println("Não é um furacão/tempestade");
				break;
			default:
				System.out.println("Erro! Valor invalido!");
		}
	}

	/*
		Retorna a categoria do furacão (em int, de acordo com a tabela abaixo)
		-1 	Erro!					Valor invalido!
		1	Tempestade tropical 	62 a 118
		2	Categoria 1 			119 a 153
		3	Categoria 2				154 a 177;
		4	Categoria 3				178 a 209
		5	Categoria 4				210 a 249
		6	Categoria 5				maior que 249
		0	Não se classifica como tempestade/furacão
	*/
	public static int classificaFuracao(int velocidadeVento)
	{
		if(velocidadeVento>=62 && velocidadeVento<=118)
		{
			return 1;
		}
		if(velocidadeVento>=119 && velocidadeVento<=153)
		{
			return 2;
		}
		if(velocidadeVento>=154 && velocidadeVento<=177)
		{
			return 3;
		}
		if(velocidadeVento>=178 && velocidadeVento<=209)
		{
			return 4;
		}
		if(velocidadeVento>=210 && velocidadeVento<=249)
		{
			return 5;
		}
		if(velocidadeVento>249)
		{
			return 6;
		}
		if(velocidadeVento<0)
			return -1;
		return 0;

	}
}