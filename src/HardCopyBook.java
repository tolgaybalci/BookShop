
public class HardCopyBook extends Book {

	private int weight;
	private int ShippingCost;
	
	public HardCopyBook(String name, String author, String bookId, int price, int weight, int ShippingCost) {
		super(name, author, bookId, price);
		this.weight = weight;
		this.ShippingCost = ShippingCost;
		
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getShippingCost() {
		return ShippingCost;
	}

	public void setShippingCost(int shippingCost) {
		ShippingCost = shippingCost;
	}


	public int getTotalCost() {
		
		return ShippingCost + getPrice();
	}
}
