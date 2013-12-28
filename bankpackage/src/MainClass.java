import accountpack.*;

import accountpack.ATMOperation;
import accountpack.AccountList;
public class MainClass {
	public static void main(String[] args) 
	{
		Account obj1 = new Account("Kumar");
		AccountList.addAccountToList(obj1);

		Account obj2 = new Account(1500, "vijay");
		AccountList.addAccountToList(obj2);
		
		Account obj3 =new Account("Ashok");
		AccountList.addAccountToList(obj3);
		
		
		
		NetBankingOperation nb1=new NetBankingOperation(1003);
		System.out.println(String.format("%d has balance: %d",1003, nb1.getCustomerAccountbalance()));
		System.out.println(String.format("%d has balance: %d",1003, nb1.depositAmount(500)));
		System.out.println(String.format("%d has balance: %d",1003, nb1.withdrawAmount(500)));
		
		NetBankingOperation nb2=new NetBankingOperation(1002);
		
		System.out.println(String.format("\n\n%d has balance: %d",1002, nb2.depositAmount(500)));
		

		
		ATMOperation atmSession1 =  new ATMOperation(1002);
		System.out.println(String.format("%d has balance: %d", 1002, atmSession1.getCustomerAccountbalance()));

		
		int updatedBalance = atmSession1.withdrawAmount(1600);
		System.out.println(String.format("%d has balance: %d", 1002, atmSession1.getCustomerAccountbalance()));

		NetBankingOperation nb3=new NetBankingOperation(1001);
		System.out.println(String.format("%d has balance: %d",1001, nb3.getCustomerAccountbalance()));
		System.out.println(String.format("%d has balance: %d",1001, nb3.depositAmount(500)));
		
	}

}
