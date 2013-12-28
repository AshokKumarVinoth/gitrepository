package accountpack;

public class Account {
	
	private int bal;
	private static int counter = 1000;
	private int accno;
	private String name;

	public int getBalance(){
		return this.bal;
	}

	public int getAccountNumber(){
		return this.accno;
	}

	public String getAccountHolderName(){
		return this.name;
	}

	public Account(String customerName){
		this(0,customerName);
	}

	public Account(int openingBalance, String customerName){
		counter++;
		bal = openingBalance;
		name = customerName;
		accno = counter;
	}

	public int depositAmount(int amount){
		if(amount > 0)
		{
			bal += amount;
			System.out.println("\nRs "+amount+" is deposited into your Account");
		}
		return bal;
	}

	public int withdrawAmount(int amount){
		if(amount > 0 && (bal-amount >500))
		{
			bal -= amount;
		}
		else
			System.out.println("You Have Low Balance\n So You Cannot able Withdraw from your Account");
		return bal;
	}

}

