class Animal 
{
	void eat(){
		System.out.println("eating..");
	}
}
class Dog extends Animal
{ void brak()
	{
	System.out.println("braking..");

	}
}
	class Babydog extends Dog
	{ void weep()
		{System.out.println("weeping..");
		}
	}
	class TestAnimal
	{
	public static void main(String[] args) 
	{
		Babydog d=new Babydog();
	d.weep();
	d.brak();
	d.eat();
	}
}
