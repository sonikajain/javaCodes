package shopping;

import java.util.ArrayList;

public class BigBasket {
	
	Items glycirene = new Items("Glycirene", 5, 50);
	Items soap = new Items("Soap", 2, 12);
	Items brush = new Items("Brush", 2, 35);
	Items tomato = new Items("Tomato", 2, 7);
	Items comb = new Items("Comb", 2, 10);
	
	ArrayList<Items> itemAvail = new ArrayList<>();
	public BigBasket(){
		itemAvail.add(glycirene);
		itemAvail.add(soap);
		itemAvail.add(brush);
		itemAvail.add(tomato);
		itemAvail.add(comb);		
	}
	
}
