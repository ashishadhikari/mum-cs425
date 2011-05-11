package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import app.Book;
import app.Copy;
import app.Item;
import app.Magazine;
import app.Member;
import app.Reservation;

public class ItemTest {

	static Item item;
	static Copy copy;
	static List<Copy> copies;
	static List<Reservation> reservations;
	static Reservation res1;
	static Reservation res2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		copies = new ArrayList<Copy>();
		reservations = new ArrayList<Reservation>();
		item = new Book("123", "Rahul");
//		item = new Magazine("123");
		Copy copy1 = new Copy("1", true);
		Copy copy2 = new Copy("2", true);
		Copy copy3 = new Copy("3", false);
//		Copy copy4 = new Copy("4", false);
		copies.add(copy1);
		copies.add(copy2);
		copies.add(copy3);
		item.addCopy(copy1);
		item.addCopy(copy2);
		item.addCopy(copy3);
		Date reservationDate = new GregorianCalendar().getTime();
		boolean status = true;
		res1 = new Reservation(reservationDate, status);
		res2 = new Reservation(reservationDate, status);
		reservations.add(res1);
		reservations.add(res2);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		copies = null;
		item = null;
	}

	@Test
	public void listTest() {
		Assert.assertEquals(copies, item.list());
	}

	@Test
	public void listReservationsTest() {
		item.addReservation(res1);
		item.addReservation(res2);
		Assert.assertEquals(reservations, item.listReservations());
	}

	@Test
	public void listLoans() {
		List<Copy> loans = item.listLoans();
		Iterator<Copy> it = loans.iterator();
		for (Copy c : copies) {
			if (!c.isAvailable()) {
				Assert.assertEquals(c, it.next());
			}
		}

	}

	@Test
	public void countReservationsTest() {
		Assert.assertEquals(reservations.size(), item.countReservations());
	}
	
	@Test
	public void countLoansTest() {
		int copyCount = 0;
		for (Copy c : copies) {
			if (!c.isAvailable()) {
				copyCount++;
			}
		}
		Assert.assertEquals(copyCount, item.countLoans());
	}
	
	@Test
	public void borrowTest() {
		
		int loanCount =  item.countLoans();
		
		Member member =  new Member("123","Ashish","1000 n 4th st","6528211");
		item.borrow(member );
		
	}

}
