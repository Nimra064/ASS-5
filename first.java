public class first {
	public static int num(int p ,int c)
	{   
		//Assignment and Expression
		int a = p + 3; 
		
		int  dis = p*p - 4*c; 
		return dis;
	}
	//main method
	public static void main(String[] args)
	{  
	 // Declaration 
		int p=8;
		int c=19;
		int x=num(p,c);

		System.out.println("number = " + x);  

    }
}