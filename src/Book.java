
public abstract class Book {

	private String name;
	private String author;
	private String bookId;
	private int price;
	
	public Book(String name, String author, String bookId, int price) {
		
		this.name = name;
		this.author = author;
		this.bookId = bookId;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void appliyDiscount(int rate){
		
		price = (price * rate / 100);	
	}
}
