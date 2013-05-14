/*
	Calcule fatorial
*/
class Ex22
{
	public static void main(String[] args)
	{
		System.out.println(fatorial(18));
	}
	static long fatorial(int n)
	{
		long fatorial = 1;
		for(int i = 1; i<=n;i++)
		{
			fatorial*=i;
			System.out.println(i+"\t"+fatorial);
		}
		return fatorial;
	}
}	