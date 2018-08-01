package app;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class Service {

	public Service () {}
	
	private HashMap<Integer, Account> accounts  = new HashMap<> ();

	
	public void addAccount(Account account) {
		

		accounts.put(account.accountNumber, account);
		}
	
	

	public String getAccounts(int accountNumber) {

		Account a = accounts.get(accountNumber);
		
		return  "Account: " + "  " + a.getFirstName() + "   " + a.getLastName()  ;
	}
	}

		
	
		
	
	
	
	
	
