package shopping;

import java.util.ArrayList;

public class Grofers {
    Items toothpaste = new Items("Toothpaste", 2, 20);
	Items soap = new Items("Soap", 4, 12);
	Items brush = new Items("Brush", 5, 36);
	Items shampoo = new Items("shampoo", 1, 5);
	Items cream = new Items("Cream", 5, 10);
	
	ArrayList<Items> itemAvail = new ArrayList<>();
	public Grofers(){
		itemAvail.add(toothpaste);
		itemAvail.add(soap);
		itemAvail.add(brush);
		itemAvail.add(shampoo);
		itemAvail.add(cream);		
	}
}
