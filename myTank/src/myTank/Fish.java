package myTank;

public class Fish extends Animal{

	public Fish(String name, String purchaseDate, double purchasePrice, 
			String purchaseLocation, String quality, int quantity, String size) {
		
		super(name, purchaseDate, purchasePrice, purchaseLocation, quality, quantity, size);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
 

}
