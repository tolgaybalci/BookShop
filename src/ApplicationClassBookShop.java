import java.util.ArrayList;

public class ApplicationClassBookShop {

	public static void main(String[] args) {
		
		Ebook eb = new Ebook("Prens", "Mackievelli", "12345", 250, 150, "utf8", 800);
		HardCopyBook hcb = new HardCopyBook("Araba Sevdası", "Mahmut Ekrem", "5678", 100 ,10 ,150);
		ArrayList<Book> books = new ArrayList<>();
		books.add(hcb);
		books.add(eb);
		ShoppingCard sc = new ShoppingCard(books, 100);
		Purchase p1 = new Purchase("23.12.2006", "15.11.2003",17, sc);
		ArrayList<Purchase> purchaseHistory = new ArrayList<>();
		Customer c = new Customer("Tolgay", "Balcı", purchaseHistory );
	}
}
