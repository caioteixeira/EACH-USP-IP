/*
	Crie um programa que calcule o cosseno de um ângulo x(em radianos)
*/
class Ex23
{
	public static void main(String[] args)
	{
		System.out.println(calculaCosseno(Math.PI * 2));
	}
	static double calculaCosseno(double angulo)
	{
		double cosseno = 1.0;
		double soma = 0.0;
		for(int i = 2; i<=11; i++)
		{
			soma+= Math.pow(angulo,i)/fatorial(i);
		}
		return cosseno - soma;
	}

	static int fatorial(int n)
	{
		int fatorial = 1;
		for(int i = 1; i<=n;i++)
		{
			fatorial*=i;
		}
		return fatorial;
	}
}