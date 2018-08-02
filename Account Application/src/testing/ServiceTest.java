package testing;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.json.JSONML;
import org.json.JSONObject;
import org.junit.Test;

import app.Account;
import app.Service;

public class ServiceTest {

	@Test
	
	public void testAddAccount () {
		
		Account one= new Account("Harvey", "Davidson", 786902);
		Service testAddAccount = new Service();
		testAddAccount.addAccount(one);
		assertEquals("Account: " + "  " + one.getFirstName() + "   " + one.getLastName()  ,testAddAccount.getAccounts(786902));

	}
  
	@Test
	
	public void testConvertToJSON() {
		
		Service convertToJSONTest = new Service();
		
		convertToJSONTest.convertToJSON();
				
		assertNotNull(convertToJSONTest.convertToJSON());
	}
		
	}
	
	
		
		
	

	

		
	
	

