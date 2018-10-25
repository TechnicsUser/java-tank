package myTank;

import java.util.Date;

public class Animal {
	
	String name;
	public Animal(String name, String purchaseDate, double purchasePrice, String purchaseLocation, String quality,
			int quantity, String size) {
		super();
		this.name = name;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.purchaseLocation = purchaseLocation;
		this.quality = quality;
		this.quantity = quantity;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String purchaseDate;
	double purchasePrice;
	String purchaseLocation;
	String quality;
	int quantity;
	String size;
	

	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getPurchaseLocation() {
		return purchaseLocation;
	}
	public void setPurchaseLocation(String purchaseLocation) {
		this.purchaseLocation = purchaseLocation;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	// picture at time of purchase
	
	
	
	
	
	
 	

}
