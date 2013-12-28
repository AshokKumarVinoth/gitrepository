package accountpack;

public class AccountList {
	private static Account[] accList;
	private static int arrayCount = 0;

	static{
		accList = new Account[10];
	}

	public static void addAccountToList(Account accountObject){
		if(arrayCount < 10)
		{
			accList[arrayCount] = accountObject;
			arrayCount++;
		}
	}

	public static Account getAccountDetails(int accountNumber){
		Account accountObject = null;

		for(int i = 0 ; i < 10; i++)
		{
			if(accList[i].getAccountNumber() == accountNumber)
			{
				accountObject = accList[i];
				break;
			}
			else
			{
				continue;
			}
		}

		return accountObject;
	}

}
	
