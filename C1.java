class C 
{
	int i=1;
	int j=2;

	public static void main(String[] args) 
	{
		System.out.println("execution starts");
		C obj1=new C();
	    System.out.println(obj1.i);
		System.out.println(obj1.j);
		C obj2=new C();
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		System.out.println("---------");
		obj1.i=100;
		obj1.j=200;
 System.out.println(obj1.i);
		System.out.println(obj1.j);
System.out.println(obj2.i);
		System.out.println(obj2.j);
	}
}
