package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Account;

public class TestAccount {

	@Test
	
	public void testGetFirstName() {
		
		Account testGetFirstName = new Account("Adam","Campbell", 321425);
		
		assertEquals("Adam", testGetFirstName.getFirstName());

	}
	
	@Test 
	
	public void testSetFirstName() {
		
		Account testSetFirstName = new Account("Adam","Campbell", 321425);
		testSetFirstName.setFirstName("George");
		assertEquals("George", testSetFirstName.getFirstName());

	}
	
	@Test
	
	public void testGetLastName() {
		
		Account testGetLastName = new Account("David","Mather", 456897);
		
		assertEquals("Mather", testGetLastName.getLastName());
		
	}
	
	@Test
	
	public void testSetLastName() {
		
		Account testSetLastName = new Account("David","Mather", 456897);
		testSetLastName.setLastName("Price");
		assertEquals("Price", testSetLastName.getLastName());
	}
	
@Test
	
	public void testGetAccountNumber() {
		
		Account testGetAccountNumber = new Account("Micheal","Jordan", 548362);
		assertEquals(548362, testGetAccountNumber.getAccountNumber());


@Test
	
	public void testSetAccountNumber() {
		
		Account testSetAccountNumber = new Account("David","Mather", 456897);
		testSetAccountNumber.setAccountNumber(221548);
		assertEquals(221548, testSetAccountNumber.getAccountNumber());

}

}
