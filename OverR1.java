class Car
{
	void shiftGear()
	{
		System.out.println("Gear Shifted Old Method");
	}
}

class B extends A
{
	void shiftGear()
	{
		System.out.println("Gear shifted New Method");
	}
}

class FunOver1
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.shiftGear();
	}
}