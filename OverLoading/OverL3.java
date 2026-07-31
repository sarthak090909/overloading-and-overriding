class Company
{
	void calculateSalary(int salary)
	{
		int currentsal = salary;
		System.out.println("Current Salary without bonus="+currentsal);
	}
	
	void calculateSalary(int salary, int bonus)
	{
		int salary_bonus= salary + bonus;
		System.out.println(salary_bonus);
	}
}

class OverL3
{
	public static void main(String args[])
	{
	Company c1=new Company();
	
	System.out.println("Salary without bonus");
	c1.calculateSalary(75000);
	
	System.out.println("Salary with bonus");
	c1.calculateSalary(75000, 25000);
	}
}