import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int a=1;
		if(n<2)
		{
		System.out.println("not a prime");
		return;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				a=0;
			System.out.println("not a prime");break;
			}
		}
	if(a==1){ 
		System.out.println("prime");
		}
}
}
