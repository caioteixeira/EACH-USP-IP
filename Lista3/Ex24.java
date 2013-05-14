/*
	Verifique se um valor é potência de 2
*/
class Ex24
{
	public static void main(String[] args)
	{
		System.out.println(isPotenciaDe2(512));
	}
	static int isPotenciaDe2(int valor)
	{	
		if(valor%2==1)
			return -1;
		for(int i = 2; Math.pow(2,i)<=valor;i++)
		{
			if(Math.pow(2,i) == valor)
				return i;
		}
		return -1;
	}
}