package shopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ManageInventory {
	static HashMap<String, Integer> requirements = new HashMap<>();
	static HashMap<String, String> elementsAvailCost = new HashMap<>();
	static HashMap<String, String> elementsAvailQuantity = new HashMap<>();

	public static void calculateItems(HashMap<String, Integer> req) {
		Grofers grofers = new Grofers();
		BigBasket bigBasket = new BigBasket();
		PepperTap pepperTap = new PepperTap();
		ZopNow zopNow = new ZopNow();

		
		java.util.Iterator<Entry<String, Integer>> it = requirements.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
				for (Items items : grofers.itemAvail) {
					if (items.name.equals(pair.getKey())) {
						String temp = (String) pair.getKey();
						elementsAvailCost.put(items.name, String.valueOf(items.cost) );
						elementsAvailCost.put(items.name, String.valueOf(items.quantity) );

					}
				}
			
	    }
	    		
		java.util.Iterator<Entry<String, Integer>> it1 = requirements.entrySet().iterator();
	    while (it1.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
				for (Items items : bigBasket.itemAvail) {
					if (items.name.equals(pair.getKey())) {
						
					}
				}
			
	    }
	    		
		java.util.Iterator<Entry<String, Integer>> it2 = requirements.entrySet().iterator();
	    while (it2.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
				for (Items items : pepperTap.itemAvail) {
					if (items.name.equals(pair.getKey())) {
						
					}
				}
			
	    }
	    		
		java.util.Iterator<Entry<String, Integer>> it3 = requirements.entrySet().iterator();
	    while (it3.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
				for (Items items : zopNow.itemAvail) {
					if (items.name.equals(pair.getKey())) {
						
					}
				}
			
	    }
	    
	    
	    
		

	}

	public static void main(String args[]) {
		requirements.put("Toothpaste", 10);
		requirements.put("Soap", 4);
		requirements.put("Brush", 20);
		requirements.put("Powder", 5);
		requirements.put("Potato", 20);
		requirements.put("Tomato", 7);
		requirements.put("Shampoo", 1);
		requirements.put("Comb", 5);
		calculateItems(requirements);

	}
}
