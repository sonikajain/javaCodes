package shopping;

import java.util.ArrayList;

public class PepperTap {

	Items toothpaste = new Items("Toothpaste", 10, 21);
	Items powder = new Items("Powder", 5, 10);
	Items lotion = new Items("Lotion", 1, 100);
	Items tomato = new Items("Tomato", 10, 5);
	Items cream = new Items("Cream", 5, 10);
	
	ArrayList<Items> itemAvail = new ArrayList<>();
	public PepperTap(){
		itemAvail.add(toothpaste);
		itemAvail.add(powder);
		itemAvail.add(lotion);
		itemAvail.add(tomato);
		itemAvail.add(cream);		
	}
}
