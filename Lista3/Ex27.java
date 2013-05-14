/*

*/
class Ex27
{
	public static void main(String[] args)
	{
		System.out.println(produto(2,3));
		System.out.println(quociente(15,2));
		System.out.println(resto(24,2));
	}
	static int produto(int a, int b)
	{
		int produto = 0;
		for(int i = 1; i <= b; i++)
		{
			produto +=a;
		}
		return produto;
	}
	static int quociente(int a, int b)
	{
		int cont = 0;
		while(produto(b,cont)<=a)
		{
			cont++;
		}
		return cont-1;
	}
	static int resto(int a, int b)
	{
		return  a - quociente(a,b)*b;
	}
}