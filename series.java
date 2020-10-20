public class series {
	public static void  main(String[] args)
	{
       double  x=Integer.parseInt(args[0]);
       double  y=Integer.parseInt(args[1]);
       double  z=0;
         for(int i=0; i<=y; i++)
         {
         	double den=Math.pow(x,i);
            z =z+(1/den);
         }

        System.out.println(" Enter the number = " + x);
        System.out.println(" Enter the range = " + y);
        System.out.println(" Enter the sum = " + z);

    }
}