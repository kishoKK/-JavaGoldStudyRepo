package comparepkg;

import java.util.Comparator;

public class Item implements Comparable<Item> {

	private String group;
	private String name;
	private int price;
	
	public Item(String group, String name, int price) {
		this.group = group;
		this.name = name;
		this.price = price;
	}
	
	public String getGroup() {
		return group;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {		
		return price;
	}
	
	@Override
	//ソートのキー指定
	public int compareTo(Item sortKey) {
		
		return name.compareTo(sortKey.name);
		
	}
	
	public static class PriceComparator implements Comparator<Item>{
	
		@Override
		public int compare(Item a, Item b) {
			
			if(a.price < b.price) {
				return -1;
			}
			
			if(b.price < a.price) {
				return 1;
			}
			
			return 0;
					
		}
	}		
}
