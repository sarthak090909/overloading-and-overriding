class Test
{
	int x,y;
	void f1(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void f2()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

class Tests5 extends Test
{
	int x,y;
	void f3(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void f4()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

class ThisK
{
	public static void main(String args[])
	{
		Test5 t1=new Test5();
		t1.f3(45,18);
		t1.f4();
	}
}