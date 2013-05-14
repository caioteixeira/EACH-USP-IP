/*
	Exercicio 12
*/
class Ex12
{
	public static void main(String[] args)
	{
		double[][] valores = {
			{20000.00,35000.00,2000.20,20832.00,10500.00,12000.00},
			{15453.00,5300.00,42000.00,135832.00,18580.36,85200.00},
			{14320.00,55800.00,12356.00,2563.00,100000.00,62325.00},
			{12345.00,44823.00,15863.00,56483.55,93000.00,4852,33}
		};
		System.out.println(exA(valores));
	}
	static int exA(double[][] tabela)
	{
		double maiorValor = 0.0;
		int indiceMaiorValor = 0;
		for(int i = 0; i<tabela.length; i++)
		{
			double somaLinha = 0.0;
			for(int j = 0; j<tabela[i].length;j++)
			{
				somaLinha += tabela[i][j];
			}
			if(somaLinha>maiorValor)
			{
				maiorValor = somaLinha;
				indiceMaiorValor = i;
			}
		}
		return indiceMaiorValor;
	}
	static int exC(double[][] tabela)
	{
		
	}
}