import java.util.Scanner;
class  Big
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("biggest is "+a);
		}
		else if(a<b)
		{
			System.out.println(" biggest is"+b);
		}
		else
			System.out.println("equal");

	}
}
