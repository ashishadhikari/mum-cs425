package app;

import java.util.ArrayList;
import java.util.List;

public class Copy {

	String copiId;
	boolean available;
	List<Loan> loans;

	public Copy(String copiId, boolean available) {
		super();
		this.copiId = copiId;
		this.available = available;
		loans = new ArrayList<Loan>();
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean b) {
	
		this.available = b;
		
	}

	public void addLoan(Loan loan) {
		loans.add(loan);
	}

	public List<Loan> getLoans() {
		return loans;
	}

	public void returnCopy() {
	
		this.available = true;
		
	}
	
}
