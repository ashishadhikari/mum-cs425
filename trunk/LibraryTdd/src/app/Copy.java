package app;

public class Copy {

	String copiId;
	boolean available;

	public Copy(String copiId, boolean available) {
		super();
		this.copiId = copiId;
		this.available = available;
	}

	public boolean isAvailable() {
		return available;
	}

}
