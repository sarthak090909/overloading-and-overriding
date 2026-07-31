class Additionofno
{
	public static void main(String args[])
	{
	int i, s=0;
	for(i=0;i<args.length;i++)
	{
		// by default values in the array becomes string , we need to convert them into int
		s=s+Integer.parseInt(args[i]);
	}
	System.out.println("Sum is"+ s);
	}
}