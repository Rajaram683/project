class A
{
	static int i=1;
	public static void main(String[] args) 
	{
		System.out.println(A.i);
		System.out.println(i);
		A.i=2;
		System.out.println(A.i);
	}
}
