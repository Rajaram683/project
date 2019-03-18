import java.util.Scanner;
class pal
{
	public static void main(String[] args) 
	{	
		int rev,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			rev=n%10;
			sum=(sum*10)+rev;
			n=n/10;
		}
		if(sum==temp)
			System.out.println("palindrome");
		else System.out.println("mot palindrome");
	}
}
