import java.util.Scanner;
class Rev 
{
	public static void main(String[] args) 
	{	
		int rev=00;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to reverse");
		int n=sc.nextInt();
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println("enter the number"+rev); 

	}
}
