package comparepkg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import comparepkg.Item.PriceComparator;


public class Main {

	public static void main(String[] args) {
		
		List<Item> items = Arrays.asList(
			new Item[] {
				new Item("C","Orange",100),
				new Item("B","Banana",80),
				new Item("B","Lemon",90),
				new Item("A","Peach",60),
				new Item("D","Apple",140)		
			}
		);
		
		//五十音順にソート
		System.out.println("↓五十音順にソート");
		Collections.sort(items);
		for(Item item : items) {
			System.out.println(item.getName());
		}
		
		System.out.println();
		
		//五十音順(降順)のソート
		System.out.println("↓五十音順(降順)にソート");
		Collections.sort(items,Collections.reverseOrder());
		for(Item item : items) {
			System.out.println(item.getName());
		}
		
		System.out.println();
		
		//値段の安い順にソート
		System.out.println("↓値段の安い順にソート");
		Collections.sort(items, new PriceComparator());
		for(Item item : items) {
			System.out.println("果物："+item.getName()+" 値段："+item.getPrice()+"円");
		}
				
	}

}
