

class Ex26
{
	public static void main(String[] args)
	{	
		trianguloFloyd(21);
	}
	static void trianguloFloyd(int n)
	{
		int cont = 1;
		int cont2 = 1;
		while(cont<=n)
		{
			int cont3 = 1;
			while(cont3<=cont2)
			{
				System.out.print(cont + "\t");
				cont++;
				cont3++;
			}
			System.out.print("\n");
			cont2++;
		}
	}
}