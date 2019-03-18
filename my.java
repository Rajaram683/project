import java.util.Scanner;
class C4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter rollno");
		int rollno=sc.nextInt();
		System.out.println("enter fee");
		double fee=sc.nextDouble();
		System.out.println("name:"+name+"rollno:"+rollno+"fee"+fee);
	}
}
