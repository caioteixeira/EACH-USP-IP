/*
	Escreva um programa que determina quanto leva para um corpo cair de determinada altura a partir do repouso.
*/
class Ex7
{
	public static void main(String[] args)
	{
		double altura = 50.0;
		double gravidade = 9.8;
		double tempo = Math.sqrt((altura*2)/gravidade);

		System.out.println(tempo);
	}
}