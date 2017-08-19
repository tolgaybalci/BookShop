import java.util.ArrayList;

public class Customer {

	private String customerName;
	private String customerSurname;
	private int purchaseCount;
	public ArrayList<Purchase> purchaseHistory;
	
	
	public Customer(String customerName, String customerSurname, ArrayList<Purchase> purchaseHistory) {
		
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.purchaseHistory = purchaseHistory;
	}
	
	public void placePurchase(Purchase purchase){
		
		purchaseHistory.add(purchase);
		purchaseCount++;
	}
	
}
