class A
{
	void fun1()
	{
		System.out.println("fun1");
	}
}

class B extends A
{
	void fun1(int x, int y)
	{
		System.out.println(x+"fun1");
	}
}

class FunOver1
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.fun1(45,18);
	}
}