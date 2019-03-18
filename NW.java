import java.util.Scanner;
class NW 
{
	public static void main(String[] args) 
	
	{
		int rem, sum=0;
		Scanner sn= new Scanner(System.in);
		System.out.println("enter a number");
		int a=sn.nextInt();
		  while(a!=0)
		{
			  rem=a%10;
			  a=a/10;
			  sum=sum*10+rem;
		}

do
{
	switch(sum%10)
	{
		case 1: System.out.print("ONE ");
		break;
		case 2: System.out.print("TWO ");
		break;
		case 3: System.out.print("THREE ");
		break;
		case 4: System.out.print("FOUR ");
		break;
		case 5: System.out.print("FIVE ");
		break;
		case 6: System.out.print("SIX ");
		break;
		case 7: System.out.print("SEVEN ");
		break;
		case 8: System.out.print("EIGHT ");
		break;
		case 9: System.out.print("NINE ");
		break;
		case 0: System.out.print("ZERO ");
		break;

}
sum=sum/10;
}
while (sum!=0);
	
}
}