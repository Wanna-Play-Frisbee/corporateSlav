package tycoon;
import java.util.*;

public class Shop {
	Scanner readyBoi;
	ArrayList<Item> shopStock = new ArrayList<Item>();
	
	public Shop(String stock){
		this.readyBoi = new Scanner(stock);
		while(readyBoi.hasNextLine()){
			String temp = readyBoi.nextLine();
			Tycoon.out(temp);
			String tempArray[] = temp.split("\t", 5);
			Item i = new Item(
				Integer.parseInt(tempArray[0]),
				Integer.parseInt(tempArray[1]),
				Integer.parseInt(tempArray[2]),
				tempArray[3],
				tempArray[4]
			);
			this.shopStock.add(i);
		}
	}
	public Item getItemById(int id){
		for(Item i : shopStock){
			if(i.id==id){
				return i;
			}
		}
		return null;
	}
	
	public void buy(Player p, int id, int amt){
		try {
			Item i = getItemById(id);
				if(p.balance >= i.price * amt){
					for(int j=0; j<amt; j++){
						p.invAdd(i.clone());
					}
					p.balance -= i.price * amt;
				} else {
					Tycoon.out("You do not have enough money!");
				}
		} catch (java.lang.NullPointerException e) {
			Tycoon.out("There are no more of that item!");
		}
	}
	
}
