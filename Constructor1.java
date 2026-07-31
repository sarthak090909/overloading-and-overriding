class Test
{
	private int x;
	private int y;
	
	Test()
	{
		x=5;
		y=2;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
	class Construct1
	{
		public static void main(String args[])
		{
			Test t1=new Test();
			
			t1.display();
		}
	}
	
	



