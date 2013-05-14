/*
	Crie um método que inverta um arranjo sem utilizar um arranjo auxiliar (inverta o próprio arranjo)
*/
class Ex17
{
	public static void main(String[] args)
	{
		int[] teste = {1,2,3,4,5,6,7};
		inverteArranjo(teste);

		for(int e : teste)
			System.out.println(e);
	}
	static void inverteArranjo(int[] arranjo)
	{
		for(int i = 0; i < arranjo.length/2; i++)
		{
			int aux = arranjo[i];
			arranjo[i] = arranjo[arranjo.length-i-1];
			arranjo[arranjo.length-i-1] = aux;
		}
	}
}