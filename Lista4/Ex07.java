/*
	Escreva um método que receba um arranjo de n caracteres e verifique se esse arranjo é palindromo.
*/
class Ex07
{
	public static void main(String[] args)
	{
		char[] arranjo = {'a','b','d','c','b','b','a'};

		System.out.println(isPalindromo(arranjo));
	}
	static boolean isPalindromo(char[] arranjo)
	{
		for(int i = 0; i<arranjo.length; i++)
		{
			if(arranjo[i] != arranjo[arranjo.length-1-i])
				return false;
		}
		return true;
	}
}