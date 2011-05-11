package test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import app.Copy;

public class CopyTest {

	static Copy copy;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		copy = new Copy("1", true);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void isAvailableTest() {
		Assert.assertEquals(true, copy.isAvailable());
	}

	@Test
	public void borrowTest() {
		// TODO
	}

}
