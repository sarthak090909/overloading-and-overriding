class Example
{
	int x=12;
	int y=20;
	static int z;
}

class ClsObj
{
	public static void main(String args[])
	{
		Example n=new Example();
		Example m=new Example();
		Example s=new Example();
		
		Example.z=10; n.x=20; n.y=30;
		System.out.println(Example.z);
		System.out.println(n.x);
		System.out.println(n.y);

	}
}