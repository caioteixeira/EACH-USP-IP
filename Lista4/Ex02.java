/*
	Dado um determinado arranjo de inteiros, escrever um método que escreva na tela todos os multiplos de 7 presentes no arranjo.
*/
class Ex02
{
	public static void main(String[] args)
	{
		int[] arranjo = {1,2,4,13,14,7,21,42,49,212,210,140,241,512};
		exibeMultiplosDe7(arranjo)
	}
	static void exibeMultiplosDe7(int[] arranjo)
	{
		for(int valor: arranjo)
		{
			if(valor%7 == 0)
				System.out.println(valor);
		}
	}
}