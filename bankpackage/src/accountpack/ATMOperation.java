package accountpack;

public class ATMOperation {
	private int accno;
	private Account customerAccount;
	
	public ATMOperation(int accno){
		this.accno = accno;
		customerAccount = AccountList.getAccountDetails(this.accno);
	}
	
	public int getCustomerAccountbalance(){
		return customerAccount.getBalance();
	}
	
	public int withdrawAmount(int amount){
		return customerAccount.withdrawAmount(amount);
	}

	

}
