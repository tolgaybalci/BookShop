
public class Purchase {

	private String purchaseDate;
	private String shippingDate;
	private int deliveryLength;
	private ShoppingCard shoppingCard;
	
	public Purchase(String purchaseDate, String shippingDate, int deliveryLength, ShoppingCard shoppingCard) {
		
		this.purchaseDate = purchaseDate;
		this.shippingDate = shippingDate;
		this.deliveryLength = deliveryLength;
		this.shoppingCard = shoppingCard;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	public int getDeliveryLength() {
		return deliveryLength;
	}

	public void setDeliveryLength(int deliveryLength) {
		this.deliveryLength = deliveryLength;
	}

	public ShoppingCard getShoppingCard() {
		return shoppingCard;
	}

	public void setShoppingCard(ShoppingCard shoppingCard) {
		this.shoppingCard = shoppingCard;
	}
	
	
	
	
}
