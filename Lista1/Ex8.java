/*
	Escreva um programa que calcule as raizes de uma equação de segundo grau através de seus coeficientes;
*/
class Ex8
{
	public static void main(String[] args)
	{
		double a = 1;
		double b = 8;
		double c = 16;

		double delta = Math.pow(b,2)-4*(a*c);
		System.out.println("Delta é igual a: "+delta);

		double raiz1 = 0.0;
		double raiz2 = 0.0;

		if(delta > 0)
		{
			raiz1 = (-b + Math.sqrt(delta))/2*a;
			raiz2 = (-b - Math.sqrt(delta))/2*a;
			System.out.println("A primeira raiz é:" + raiz1);
			System.out.println("A segunda raiz é:" + raiz2);
		}
		else if(delta == 0)
		{
			raiz1 = (-b + Math.sqrt(delta))/2*a;
			raiz2 = raiz1;
			System.out.println("A unica raiz é:" + raiz1);
		}
		else
		{
			System.out.println("Não há raizes reais");		
		}
	}
}