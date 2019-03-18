import java.util.Scanner;
class  SUB
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
			int b=sc.nextInt();
		int sub=a-b;
		System.out.println(a+"-"+b+"="+sub);
	}
}
