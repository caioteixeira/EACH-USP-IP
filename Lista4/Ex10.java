/*
	Escrever um método que determine se os elementos de um arranjo encontram-se em ordem decrescente ou não.
*/
class Ex10
{
	public static void main(String[] args)
	{
		int[] arranjo = {5,3,1,1,0};
		System.out.println(isDecrescente(arranjo));
	}
	static boolean isDecrescente(int[] arranjo)
	{
		for(int i = 0; i < arranjo.length-1; i++)
		{
			if(arranjo[i]<arranjo[i+1])
				return false;
		}
		return true;
	}
}