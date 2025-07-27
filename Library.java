package week2.day1;

public class Library {
	// create method name addBook
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;

	}

	// create method name issueBook
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	// main method for execution
	public static void main(String[] args) {
		// create object
		Library book = new Library();
		// call the methods by creating object
		String bookTitle = book.addBook("Head First Java");
		System.out.println("Bookname:" + bookTitle);
		book.issueBook();

	}

}
