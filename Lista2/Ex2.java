import java.util.Scanner;
class Ex2{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a>10&&a<b)
		{
			c = 0;
		}
		System.out.println("a\t"+a);
		System.out.println("b\t"+b);
		System.out.println("c\t"+c);
	}
}