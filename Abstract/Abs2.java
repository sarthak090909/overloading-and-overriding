abstract class Bank 
{
	private int x;
	private int y;
	void fun1(){
		
	}
	
	Bank()
	{
		x=5;
		y=10;
	}
	
	abstract void roi();
}

class Saving extends Bank
{
	void roi()
	{
		System.out.println("Roi applied");
	}
	
	Saving()
	{
		
	}
}

class Abs2
{
	public static void main(String args[])
	{
		Saving s1=new Saving();
		s1.roi();
	}
}