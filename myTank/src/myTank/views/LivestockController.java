package myTank.views;

import java.util.ArrayList;
import java.util.List;

import myTank.Animal;

public class LivestockController {

	
	
	static final List<Animal> animalLst = new ArrayList<>();
	
	public static void add(Animal a) {
		animalLst.add( a);
	}
	public static List<Animal> get () {
		return animalLst;
		
	}
	
}
