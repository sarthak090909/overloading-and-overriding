class Example
{
	int x;
	int y;
	void fun1()
	{
		System.out.println("Fun1 is executed");
	}
}

class ClassesObject
{
	public static void main(String []args)
	{
		Example el=new Example();
		Example e2=new Example();
		//new Example();  unreserved object , we cannot access it , cannot keep data inside it , also we cannot delete it , a garbage collector come and  a finalised function a built in function inside java cleans it
		el.x=5;e1.y=10;e1.fun1();
		System.out.println(e1.x);
}
}