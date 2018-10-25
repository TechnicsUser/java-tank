package myTank;

import java.util.Date;

public class Coral extends Animal {

 
	public Coral(String name, String purchaseDate, double purchasePrice, String purchaseLocation, String quality,
			int quantity, String size) {
		super(name, purchaseDate, purchasePrice, purchaseLocation, quality, quantity, size);
		// TODO Auto-generated constructor stub
	}
	public Coral(String name, String purchaseDate, double purchasePrice, String purchaseLocation, String quality,
			int quantity, String size, String lightingLocation, String type) {
		super(name, purchaseDate, purchasePrice, purchaseLocation, quality, quantity, size);
		this.lightingLocation = lightingLocation;
		this.type = type;
	}
	String lightingLocation;
	String type;
	public String getLightingLocation() {
		return lightingLocation;
	}
	public void setLightingLocation(String lightingLocation) {
		this.lightingLocation = lightingLocation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
