package test;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import app.Book;
import app.Copy;
import app.Item;
import app.Magazine;
import app.Member;

public class MemberTest {
	
	static private Member member;
	static private Item item1;
	static private Item item2;
	static private Copy copy;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		member = new Member();
		String memberId = "1";
		String name = "Rahul";
		String address = "1000 N foutrh st.";
		String phone = "12332434";
		member = new Member(memberId, name, address, phone);
		String isbn = "123234";
		String author = "David";
		item1 = new Book(isbn, author);
		String issueNo = "234";
		item2 = new Magazine(issueNo);
		String copyId = "1243";
		boolean available = true;
		copy = new Copy(copyId, available);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	public void memberInstantiationTest() {
		Assert.assertNotNull(member);
	}
	
	@Test
	public void bookInstantiationTest() {
		Assert.assertNotNull(item1);
	}
	
	@Test
	public void magazineInstantiationTest() {
		Assert.assertNotNull(item2);
	}
	
	@Test
	public void copyInstantiationTest() {
		Assert.assertNotNull(copy);
	}

	@Test
	public void reserveTest(Item item) {
		
	}

}
