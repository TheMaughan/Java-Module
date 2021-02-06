public class Product {

	// Member data:
	String id;
	String name;
	double price;
	float quantity;

	/* Constructor */
	public Product(String i, String n, double p, float q) {
		this.id = i;
		this.name = n;
		this.price = p;
		this.quantity = q;
	}

	public double getTotalPrice() {
		return this.price * this.quantity;
	}

	public void display() {
		System.out.printf("\n%s (%.0f) - $%.2f",this.name, this.quantity, getTotalPrice());
	}



    public static void main(String[] args) {
		System.out.println("### Testing Products ###");

		Product p1 = new Product("1238223", "Sword", 1899.99, 10);
		System.out.printf("Id: %s",p1.id);
		System.out.printf("\nName: %s",p1.name);
		System.out.printf("\nPrice: %.2f",p1.price);
		System.out.printf("\nQuantity: %f\n",p1.quantity);

		p1.getTotalPrice();
		p1.display();
    }
}
