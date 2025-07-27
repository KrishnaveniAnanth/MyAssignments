package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// create object
		Library book = new Library();
		// call the methods in the class named Library
		String bookTitle = book.addBook("Effective Java");
		System.out.println("Bookname:" + bookTitle);
		book.issueBook();

	}

}
