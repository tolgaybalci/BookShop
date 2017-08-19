import java.util.ArrayList;

public class ShoppingCard {

	private ArrayList<Book> books;
	private int numEntriesInCard;
	
	public ShoppingCard(ArrayList<Book> books, int numEntriesInCard) {
		this.books = books;
		this.numEntriesInCard = numEntriesInCard;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public int getNumEntriesInCard() {
		return numEntriesInCard;
	}

	public void setNumEntriesInCard(int numEntriesInCard) {
		this.numEntriesInCard = numEntriesInCard;
	}
	
	public void addBook(Book book) {
		
		books.add(book);
	}
	
}
