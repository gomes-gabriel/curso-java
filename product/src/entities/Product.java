/*
	O metodo toString eh padrao da classe Object, portanto apenas houve a sobrescrita  
*/

package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	// Construtor padrao
	public Product() {
	}

	// Construtor com os 3 parametros
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Construtor com 2 parametros (sobrecarga)
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProduct(int quantity) {
		this.quantity += quantity;
	}

	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
