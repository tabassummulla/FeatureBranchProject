package app;

import java.util.HashMap;

import org.json.JSONObject;

public class Service {

	private HashMap<Integer, Account> accounts  = new HashMap<> ();

	public Service () {}
	
	public void addAccount(Account account) {
		
		accounts.put(account.getAccountNumber(), account);
		
	}
	
	public String getAccounts(int accountNumber) {

		Account a = accounts.get(accountNumber);
		
		return  "Account: " + "  " + a.getFirstName() + "   " + a.getLastName()  ;
	}
	
	
	public JSONObject convertToJSON() {

		JSONObject json= new JSONObject(accounts);
			return json;
			
	}
}
	

	
	
	
	

		
	
		
	
	
	
	
	
