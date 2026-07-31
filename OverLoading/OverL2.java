class Bank
{
	void calculateInterest(double principal)
	{
		double interest=(principal * 5* 1)/100;
		System.out.println("Interest="+interest);
	}
	
	void calculateInterest(double principal, int time)
	{
		double interest= (principal* 5 * time);
		System.out.println("Interest="+interest);
	}
	
	void calculateInterest(double principal, double rate, int time)
	{
		double intereset=(principal*rate*time);
		System.out.println("Interest="+intereset);
	}
}


class OverL2
{
	public static void main(String args[])
	{
		Bank b1=new Bank();
		
		System.out.println("First case");
		b1.calculateInterest(1000);
		
		System.out.println("2nd case");
		b1.calculateInterest(1000, 3);
		
		System.out.println("3rd case");
		b1.calculateInterest(1000, 7.5, 5);
	}
}