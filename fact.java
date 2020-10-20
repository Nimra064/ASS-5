public class fact{
	public static void main(String[] args)
	{
		int number=Integer.parseInt(args[0]);

		int f=1;

		int c=1;

		while(c <= number)
		{
			f=f*c;
			c=c+1;
		}
		System.out.println(" Enter the Number = " + number);
		System.out.println(" Enter the Factorial of Number = " + f );


	}
}