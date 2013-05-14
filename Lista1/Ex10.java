/*
	Escreva um método que receba um inteiro de 3 digitos como parametro, retornando seu inverso.
	Por exemplo, inv(332) = 233.
*/
import java.util.Scanner;

class Ex10
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um valor de 3 digitos que deseja que seja invertido: ");
		int valor = scanner.nextInt();
		System.out.println("O valor invertido fica: "+inv(valor));
	}
	public static int inv(int valor)
	{
		int centena = valor/100;
		int dezena = (valor%100)/10;
		int unidade = ((valor%100)%10);

		int resultado = (unidade*100)+(dezena*10)+centena;

		return resultado;
	}
}