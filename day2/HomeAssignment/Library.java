package week1.day2.HomeAssignment;

public class Library {
	public String addBook(String bookTitle)
	{
		System.out.println(bookTitle+" book added successfully");
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		//creating object to call methods
		Library book=new Library();
		book.addBook("Treasure Island");
		book.issueBook();

	}

}
