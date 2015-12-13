package shopping;

import java.util.ArrayList;

public class ZopNow {

	Items potato = new Items("Potato", 10, 20);
	Items powder = new Items("powder", 1, 2);
	Items lotion = new Items("Lotion", 5, 110);
	Items pen = new Items("Pen", 1, 50);
	Items cream = new Items("Cream", 5, 11);
	
	ArrayList<Items> itemAvail = new ArrayList<>();
	public ZopNow(){
		itemAvail.add(potato);
		itemAvail.add(powder);
		itemAvail.add(lotion);
		itemAvail.add(pen);
		itemAvail.add(cream);		
	}
}
