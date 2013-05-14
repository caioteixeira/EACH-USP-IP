/*
	Escreva um método que verifique se uma matriz é simétrica.
*/
class Ex10
{
	public static void main(String[] args)
	{
		int[][] a = {{3,2,1},{1,2,3}};
		int[][] b = {{3,1},{2,2},{2,3}};

		System.out.println(areSimetricas(a,b));
	}
	static boolean areSimetricas(int[][] a, int[][] b)
	{
		if(a.length != b[0].length)
			return false;
		if(a[0].length != b.length)
			return false;
		for(int i = 0; i<a.length;i++)
		{
			for(int j = 0; j<a[0].length; j++)
			{
				if(a[i][j] != b[j][i])
					return false;
			}
		}
		return true;
	}
}