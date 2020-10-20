public class second {



	public static int  shape(int n , int m)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++)
			{
				if(i==1 || i==n ||
				 j==1 || j==m) 

				    System.out.print("*");
				else 
				
			        System.out.print(" ");
			   
            }
		 System.out.println(); 
 
        }
        return 0;
    }
	 
    
    public static void main(String[]  args)
    {
	  
	  int  rows=Integer.parseInt(args[0]);
      int  colums=Integer.parseInt(args[1]);

      shape(rows , colums);
    }

}