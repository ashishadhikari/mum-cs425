package test;




import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import app.Copy;
import app.Loan;
import app.Member;

public class LoanTest {

	private static Loan loan;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		loan = new Loan(new Member("123","Ashish","1000 n 4th st","6528211"), new Copy("123", true));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		loan = null;
	}

	@Test
	public void loanInstantiationTest(){
		Assert.assertNotNull(loan);
	}
	
	@Test
	public void returnLoanTest(){
		Assert.assertFalse(loan.isReturned());
		loan.returnLoan();
		Assert.assertTrue(loan.isReturned());
		
	}
	
	
}
