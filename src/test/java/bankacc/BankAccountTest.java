
/* 
*  Author : Mable Jose Thekkiniyedath
*  Date	  : September 29, 2024
*  Project: Assignment 1

*  Description : Testing_Bank_Account
*/

package bankacc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class BankAccountTest 
{
	//testing getBalance with positive value
	@Test
	public void testGetBalance1()
	{
		BankAccount bankAccount= new BankAccount(50);
		assertEquals(50, bankAccount.getBalance(),0.001);
	}
	
	//testing getBalance with zero
	@Test
	public void testGetBalance2()
	{
		BankAccount bankAccount= new BankAccount(0);
		assertEquals(0, bankAccount.getBalance(),0.001);
	}
	
	//testing getBalance with negative value
	@Test(expected = IllegalArgumentException.class)
	public void testGetBalance3()
	{
		BankAccount bankAccount= new BankAccount(-100);
		assertEquals(-100, bankAccount.getBalance(),0.001);
	}
	
	//testing getBalance by passing incorrect value in the expected assert value 
	@Test
	public void testGetBalance4()
	{
		BankAccount bankAccount= new BankAccount(2000);
		assertEquals(10000, bankAccount.getBalance(),0.001);
	}
	
	//testing deposit with positive value
	@Test
	public void testDeposit1()
	{
		BankAccount bankAccount= new BankAccount(1000);
		bankAccount.deposit(1000);
		assertEquals(2000, bankAccount.getBalance(),0.001);
	}
	
	//testing deposit with negative deposit value
	@Test(expected = IllegalArgumentException.class)
	public void testDeposit2()
	{
		BankAccount bankAccount= new BankAccount(1000);
		bankAccount.deposit(-10);
		assertEquals(0, bankAccount.getBalance(),0.001);
	}
	
	//testing deposit with bankAccount value zero
	@Test(expected = IllegalArgumentException.class)
	public void testDeposit3()
	{
		BankAccount bankAccount= new BankAccount(0);
		bankAccount.deposit(-100);
		assertEquals(-100, bankAccount.getBalance(),0.001);
	}
	
	//testing deposit with value zero
	@Test(expected = IllegalArgumentException.class)
	public void testDeposit4()
	{
		BankAccount bankAccount= new BankAccount(100);
		bankAccount.deposit(0);
		assertEquals(200, bankAccount.getBalance(),0.001);
	}
	
	//testing deposit with by passing incorrect value in the expected assert value
		@Test
		public void testDeposit5()
		{
			BankAccount bankAccount= new BankAccount(5000);
			bankAccount.deposit(2000);
			assertEquals(2000, bankAccount.getBalance(),0.001);
		}
		
	//testing withdraw with positive value
	@Test
	public void testWithdraw1()
	{
		BankAccount bankAccount= new BankAccount(1000);
		bankAccount.withdraw(500);
		assertNotEquals(1000, bankAccount.getBalance(),0.001);
	}
	
	//testing withdraw with value zero
	@Test(expected = IllegalArgumentException.class)
	public void testWithdraw2()
	{
		BankAccount bankAccount= new BankAccount(1000);
		bankAccount.withdraw(0);
		assertEquals(1000, bankAccount.getBalance(),0.001);
	}
	
	// testing withdraw with more than allowed withdrawal limit
	@Test(expected = IllegalArgumentException.class)
	public void testWithdraw3()
	{
		BankAccount bankAccount= new BankAccount(1000);
		bankAccount.withdraw(1500);
		assertEquals(1000, bankAccount.getBalance(),0.001);
	}
	
	// testing withdraw with negative value
	@Test(expected = IllegalArgumentException.class)
	public void testWithdraw4()
	{
		BankAccount bankAccount= new BankAccount(1000);
		bankAccount.withdraw(-500);
		assertEquals(1000, bankAccount.getBalance(),0.001);
	}
	
	// testing withdraw with by passing incorrect value in the expected assert value
		@Test
		public void testWithdraw5()
		{
			BankAccount bankAccount= new BankAccount(1000);
			bankAccount.withdraw(500);
			assertEquals(1000, bankAccount.getBalance(),0.001);
		}
}
