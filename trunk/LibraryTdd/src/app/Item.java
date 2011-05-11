package app;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {

	private List<Copy> copies;
	private List<Reservation> reservations;

	public Item() {
		copies = new ArrayList<Copy>();
		reservations = new ArrayList<Reservation>();
	}

	public void addCopy(Copy copy1) {
		copies.add(copy1);
	}

	public List<Copy> list() {
		return copies;
	}

	public void setCopies(List<Copy> copies) {
		this.copies = copies;
	}

	public List<Reservation> listReservations() {
		return reservations;

	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void addReservation(Reservation res1) {
		reservations.add(res1);
	}

	public List<Copy> listLoans() {
		List<Copy> loanedCopies = new ArrayList<Copy>();
		for (Copy c : copies) {
			if (!c.isAvailable()) {
				loanedCopies.add(c);
			}
		}
		return loanedCopies;
	}

	public int countReservations() {
		return reservations.size();
	}

	public int countLoans() {
		int count = 0;
		for (Copy c : copies) {
			if (!c.isAvailable()) {
				count++;
			}
		}
		return count;
	}

	public void borrow(Member member) {
		
		for (Copy c : copies) {
			if (c.isAvailable()) {
				c.setAvailable(false);
				Loan loan = new Loan(member,c);				
				member.addLoan(loan);
				c.addLoan(loan);
				break;
			}
		}
		
	}

}
