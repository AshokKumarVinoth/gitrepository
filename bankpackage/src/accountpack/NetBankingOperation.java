package accountpack;

public class NetBankingOperation {
	private int accno;
	private Account customerAccount;
	
	public NetBankingOperation(int accno){
		this.accno = accno;
		customerAccount = AccountList.getAccountDetails(this.accno);
	}
	
	public int getCustomerAccountbalance(){
		return customerAccount.getBalance();
	}
	
	public int withdrawAmount(int amount){
		return customerAccount.withdrawAmount(amount);
	}
	
	public int depositAmount(int amount){
		return customerAccount.depositAmount(amount);
	}

}
