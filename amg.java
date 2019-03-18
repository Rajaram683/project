class Amg 
{
	public static void main(String[] args) 
	{int n=199,rem,temp; double sum=0.0;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+Math.pow(rem,3);
			n=n/10;
		}
		if(sum==temp)
			System.out.println(temp+" is amstrong");
		else 
			System.out.println(temp+ "no. is not amstrong");
	}
}
