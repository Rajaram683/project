class E 
{
	static int i;
	static void display(){
		System.out.println("Hello World!");
		System.out.println(i);
		System.out.println("Hello World!");
	}
}
class Test
{
	public static void main(String[] args){
		E.display();
		E.i=100;
		E.display();
}
}