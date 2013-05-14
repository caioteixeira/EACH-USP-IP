/*
	Escreva um programa que desenhe um quadrado de "*" de 5 x 10(5 linhas x 10 Colunas)
*/
class Ex13
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)//Desenha Linhas
		{
			for(int j=1;i<=10;j++) //Desenhas caracteres
			{
				if(i==1 || i==5 || j==1 || j==10)
					System.out.println("*");
				else
					System.out.println(" ");
			}
		}
	}
}