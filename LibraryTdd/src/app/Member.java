package app;

import java.util.ArrayList;
import java.util.List;

public class Member {

	List<Loan> loans;
	String memberId;
	String name;
	String address;
	String phone;
	


	public Member(String memberId, String name, String address, String phone) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		
		loans = new ArrayList<Loan>();
		
	}

	public void addLoan(Loan loan) {
		loans.add(loan);
	}

	public List<Loan> listLoans() {
		return loans;
	}

}
