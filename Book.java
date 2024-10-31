
public class Book {
	private String bookID;
	private String name;
	private String genre;
	private int inventoryByGenre;
	private Boolean status;
	private float value;

	// Constructor
	Book() {
	};

	Book(String bookID, String name, String genre, int inventoryByGenre, Boolean status, float value) {
		this.bookID = bookID;
		this.name = name;
		this.genre = genre;
		this.inventoryByGenre = inventoryByGenre;
		this.status = status;
		this.value = value;
	}

	Book(Book A) {
		A.bookID = bookID;
		A.name = name;
		A.genre = genre;
		A.inventoryByGenre = inventoryByGenre;
		A.status = status;
		A.value = value;
	}

	String getBookID() {
		return bookID;
	}

	String getName() {
		return name;
	}

	String getGenre() {
		return genre;
	}

	int getInventoryByGenre() {
		return inventoryByGenre;
	}

	Boolean getStatus() {
		return status;
	}

	float getValue() {
		return value;
	}

	String tostring() {
		String sstatus = (status == true) ? "Available" : "Not Available";
		String quantity = "" + inventoryByGenre;
		String price = "" + (int) value;
		return bookID + ", " + name + ", " + genre + ", " + quantity + ", " + sstatus + ", " + price + "\n";
	}
}
