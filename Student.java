public class Student {
	public static void main(String[] args)
	{
		int marks =Integer.parseInt(args[0]);

     


		if(marks>70)
		{
        System.out.println("Your Grade is A");  
		}

		else if (marks >50 && marks < 70) {
        System.out.println("Your Grade is B");  
        }
		else if ( marks >30 && marks <50) {
        System.out.println("Your Grade is C");  
        }
		else if (marks>25 && marks <30) {
		System.out.println("Your Grade is  D");
        }
        else{
        System.out.println("Your Grade is F and you are not selected for next exam");
        }
		
		 


			
		}

	}
