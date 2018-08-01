package testing;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import app.Account;
import app.Service;

public class ServiceTest {


	
	HashMap<Integer, Account> accounts  = new HashMap<> ();
	
	@Test
	
	public void testAddAccount () {
		
		Account one= new Account("Harvey", "Davidson", 786902);
		
		Service testAddAccount = new Service();
		
		testAddAccount.addAccount(one);
		
		assertEquals("Account: " + "  " + one.getFirstName() + "   " + one.getLastName()  ,testAddAccount.getAccounts(786902));
		
	
		
	}
	
	
		
		
	}
	
	

		
	
	

