import java.util.Scanner;
class Ex3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();

		if(var<4 || var>10)
		{
			System.out.println("Fora!");
		}
	}
}