package test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import app.Copy;
import app.Loan;
import app.Member;

public class CopyTest {

	static Copy copy;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		copy = new Copy("1", false);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		copy = null;
	}

	@Test
	public void isAvailableTest() {
		Assert.assertEquals(false, copy.isAvailable());
	}

	@Test
	public void borrowTest() {
		// TODO
	}

	@Test
	public void addLoanTest() {
		
		int loanCopies = copy.getLoans().size();
		
		copy.addLoan(new Loan(new Member("123","Ashish","1000 n 4th st","6528211"),new Copy("123",true)));
	
		Assert.assertEquals(1, (copy.getLoans().size()) - loanCopies);
	}
	
	@Test
	public void returnCopyTest() {
		
		copy.returnCopy();
		Assert.assertTrue(copy.isAvailable());
	}
	
}
