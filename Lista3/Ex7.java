/*Escreva métodos que dêem as seguintes series:
(a) 3, 8, 13, 18, 23, ..., 48
(b) -2, 3, 8, 13, 18, ..., 43
(c) 48, 43, 38, 33, 28, ..., 3
*/
class Ex7
{
	public static void main(String[] args)
	{
		a();
		System.out.println("");
		b();
		System.out.println("");
		c();
		System.out.println("");

	}
	static void a()
	{
		System.out.println("Exercicio A: ");
		for(int i = 3; i<=48; i+=5)
		{
			if(i>3) 
				System.out.print(", ");
			System.out.print(i);
		}
	}
	static void b()
	{
		System.out.println("Exercicio B: ");
		for(int i = -2; i<=43; i+=5)
		{
			if(i>-2) 
				System.out.print(", ");
			System.out.print(i);
		}
	}
	static void c()
	{
		System.out.println("Exercicio C: ");
		for(int i = 48; i>=c3; i-=5)
		{
			if(i<48) 
				System.out.print(", ");
			System.out.print(i);
		}
	}

}