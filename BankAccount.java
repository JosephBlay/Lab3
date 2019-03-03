import java.util.Scanner;

class BankAccount{
	Scanner input = new Scanner (System.in);

    public String name;
    public double amount;
    public double init_bal;
    public int accNo;

    //Scanner userInput = new Scanner; 
    public void youCannotBeInDebt()
    {
       System.out.println( " Can not be in Debt ");
    }
    /*private double init_bal; 
    public BankAccount( double init_bal)
    {
    	init_bal = init_bal;
    }*/
  
    
    public void deposit()
    {   System.out.print("Enter amount n figures:");
    	amount = input.nextDouble();

        if (amount >0)
         {
         	System.out.print("You have deposited: "+amount);

           init_bal+=amount; 
           System.out.println("Your remaining balance: "+init_bal);
        }
    }

      public void withdrawal()
       {
	    	amount = input.nextDouble();
	        if (amount > init_bal)
        	{
        		System.out.print("Withdrawal amount exceeded account balance.");
        	}

	        else
	        {
		        init_bal+= init_bal- amount;
		        System.out.println("Your remaining balance: "+init_bal);
	        }
        }

    
    public void transfer()
    {
    	System.out.print("Enter account name:");
    	String name=input.nextLine();

    	System.out.print("Enter account name:");
    	double accNo= input.nextDouble();

    	if(amount > init_bal)
    	{
    		System.out.println("not allow \n insufficient funds");
    	}
    	else
    	{
	    	System.out.print(amount+ " was transfered to" +name+ "account Number:"+accNo);
	    	init_bal+= init_bal-amount;
	    	System.out.println("Your current balance is:" +init_bal+ " .00");
   		}
	}
}




 
   
        


