/*
	Faça um método que receba dois arranjos(que representam conjuntos) e retorne um terceiro arranjo, contendo a união dos dois
*/
class Ex08
{
	public static void main(String[] args)
	{
		int[] a = {2,3,4,5};
		int[] b = {5,6,7,8,10,9};
		int[] c = uniaoArranjos(a,b);
		bubbleSort(c);
		for(int i: c)
			System.out.println(i);


 	}
	static int[] uniaoArranjos(int[] conjunto1, int[] conjunto2)
	{
		//bubbleSort(conjunto1);
		//bubbleSort(conjunto2);

		int tamanhoArray = conjunto1.length + conjunto2.length;

		//Determina o tamanho do array união
		//Considerando que não há elementos repetidos
		for(int elemento: conjunto1) 
		{
			for(int elemento2: conjunto2)
			{
				if(elemento==elemento2)
				{
					tamanhoArray--;
				}
			}
		}
		int[] uniao = new int[tamanhoArray];
		
		//Adiciona os elementos do conjunto 1
		for(int i = 0; i<conjunto1.length; i++)
		{
			uniao[i] = conjunto1[i];
		}

		//Adiciona os elementos do conjunto 2
		//Verifica se há valores repetidos, se sim, pula para a próxima interação	
		int cont = 0;
		int j = conjunto1.length;
		while (j < uniao.length)
		{
			boolean repetido = false;
			//Verifica se o elemento está repetido, se sim, quebra o laço.
			for(int elemento : conjunto1)
			{
				if(elemento == conjunto2[cont]) 
					{
						repetido = true;
						break;
					}
			}
			//Se não estiver repetido, adiciona o elemento ao array União
			if(!repetido)
			{
				uniao[j] = conjunto2[cont];
				j++;

			}
			cont++;
			
		}
		bubbleSort(uniao); //Opcional: Ordena o vetor de saida
		return uniao;
	}


	//Realiza ordenação do vetor, através do algoritmo BubbleSort
	static void bubbleSort(int[] arranjo)
	{
		for(int i = 0; i<arranjo.length; i++)
		{
			for(int j = 0; j < arranjo.length-1; j++)
			{
				if(arranjo[j] > arranjo[j+1])
				{
					int aux = arranjo[j+1];
					arranjo[j+1] = arranjo[j];
					arranjo[j] = aux;
				}
			}
		}
	}
}