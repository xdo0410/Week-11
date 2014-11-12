public class Random extends setup {
	private int generators = generator();
	
	public Random(int user)
	{
		super(user);
	}
	
	public int generator ()
	{
		int num = 1 + (int)(Math.random() * 3);
		return num; 
	}
	
	public void OutCome()
	{
		if (super.getPlay() == generators) {
		      System.out.println("It's a tie!");
		   }
		   else if (super.getPlay() == (1)) {
		      if (generators  == (3)) 
		         System.out.println("Rock crushes scissors. You win!!");
		      else if (generators == (2)) 
		           System.out.println("Paper eats rock. You lose!!");
		   }
		   else if (super.getPlay() == (2)) {
		       if (generators == (3)) 
		       System.out.println("Scissor cuts paper. You lose!!"); 
		    else if (generators == (1)) 
		            System.out.println("Paper eats rock. You win!!"); 
		   } 
		   else if (super.getPlay() == (3)) {
		        if (generators == (2)) 
		            System.out.println("Scissor cuts paper. You win!!"); 
		        else if (generators == (1)) 
		           System.out.println("Rock breaks scissors. You lose!!");
		        }
		}
	}	
