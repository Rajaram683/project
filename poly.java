class Animal 
{
	void eat(){
		System.out.println("eating..");
	}
}
class Dog extends Animal
{
	void eat()
	{
	System.out.println("eating bread..");

	}
}
	class cat extends Animal
	{
		void eat()
		{System.out.println("eating rat..");
		}
	}
	class TestAnimal
	{
	public static void main(String[] args) 
	{Animal a;
		 a=new Dog();
	a.eat();
	a=new cat();
	a.eat();
	}
}
