/*
	Numa loja de eletrodomésticos, as compras têm um preço a vista, ou acréscimo de 10%
	para pagamentos em 2 vezes, ou então de 20% para pagamentos em 3 vezes.
	Escreva um método que receba como parametros o valor da compra à vista e a opção de compra,
	retornando então o valor a ser pago.
*/
import java.util.Scanner;
class Ex5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor total da compra: R$");
		double pagamento =  sc.nextDouble();

		System.out.println("Digite a forma de pagamento:\n1\tA vista\n2\t2 vezes\n3\t3 vezes");
		int formaPagamento = sc.nextInt();

		pagamento = pagamento(formaPagamento,pagamento);

		System.out.println(pagamento==-1?"Erro!\nVocê digitou algum valor invalido!":"O valor final da compra é: R$"+pagamento);

	}
	

	
	//Retorna o valor final do pagamento:
	//Deve ser passado como parametro OpçãoPagamento:
	//1 - A vista
	//2 - Duas vezes
	//3 - Três vezes
	//Retorna -1 em caso de erro na passagem dos parametros.
	static double pagamento(int opcaoPagamento, double valorCompra)
	{
		if(valorCompra<=0)
			return -1;

		switch(opcaoPagamento)
		{
			case 1:
				return valorCompra;
			case 2:
				return valorCompra * 1.1;
			case 3:
				return valorCompra * 1.2;
			default:
				return -1;
		}
	}
}