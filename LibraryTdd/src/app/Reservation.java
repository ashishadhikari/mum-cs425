package app;

import java.util.Date;

public class Reservation {

	private Date reservationDate;
	private boolean status;

	public Reservation(Date reservationDate, boolean status) {
		super();
		this.reservationDate = reservationDate;
		this.status = status;
	}

}
