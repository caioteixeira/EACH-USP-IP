/*
...*......*...
..***....***..
.*****..*****.
**************
*/
class Ex9
{
	public static void main(String[] args)
	{
		for(int i = 0; i <=3; i++) //Desenha as linhas
		{
			for(int j=0; j < 14; j++)
			{
				if(j==3 || j== 10)
					System.out.print("*");
				else if((3-i<=j && j<=3)|| (10-i<=j && j<10))
					System.out.print("*");
				else if((3+i>=j) && j>=3 || (10+i>=j) && j>=10 )
					System.out.print("*");
				
				else
				{
					System.out.print(".");
				}
				
			}
			System.out.print("\n");
		}
	}
}
