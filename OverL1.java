class Stud1 
{
	void display(String name)
	{
		System.out.println("Student Name: "+ name);
	}
	
	void display(String name, int rollno)
	{
		System.out.println("Student name:"+name);
		System.out.println("rollno: "+ rollno);
	}
	
	void display(String name, int rollno, double percentage)
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(percentage);
	}
}

class Overload1
{
	public static void main(String args[])
	{
		Stud1 s1=new Stud1();;
		s1.display("Rahul");
		s1.display("Rahul", 1);
		s1.display("Rahul", 1, 199);
	}
}
