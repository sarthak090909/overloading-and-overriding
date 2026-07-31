interface A
{
	int x=5;  // inbuiltly variable inside interface is static, final, public
	void fun1();
	default void f2()
	{
		System.out.println("Default method of A");
	}
	
	static void f3()
	{
		System.out.println("static method of A");
	}
}

interface B
{
	void fun1();
	default void f2()
	{
		System.out.println("static method of A");
	}
	static void f3()
	{
		System.out.println("static method of A");
	}
}

class C implements A,B
{
	public void f2()
	{
		System.out.println("class c method f2()");
	}
	public void fun1()
	{
		
	}
}

class InterF
{
	public static void main(String args[])
	{
		C c1=new C();
		c1.f2();
	}
}