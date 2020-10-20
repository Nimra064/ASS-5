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
		System.out.println(""Number" = number + "Factorial" = f" );

	}
}