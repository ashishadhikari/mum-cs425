package app;

import java.util.Date;
import java.util.GregorianCalendar;

public class Loan {

	Member member;
	Copy c;
	Date checkoutDate;
	Date returnDate;
	boolean isReturned;
	
	public Date getCheckoutDate() {
		return (Date) checkoutDate.clone();
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Date getReturnDate() {
		return (Date) returnDate.clone();
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public boolean isReturned() {
		return isReturned;
	}
	
	public Loan(Member member, Copy c) {
		super();
		this.member = member;
		this.c = c;
		checkoutDate =  new GregorianCalendar().getTime();
	}

	public void returnLoan() {
		returnDate =  new GregorianCalendar().getTime();
		isReturned = true;
		c.returnCopy();
	}
	
	
	

}
