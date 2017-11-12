import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Shop {

	String filename;
	ArrayList<Item> shopStock = new ArrayList<Item>();
	Scanner reader;
	File filereader;

	public Shop(String stock) {
		this.filename = stock;
		filereader = new File("./shop.csv");
		try {
			reader = new Scanner(filereader, "UTF-8");
			while (reader.hasNextLine()) {
				String temp = reader.nextLine();
				Tycoon.out(temp);
				String tempArray[] = temp.split("\t");
				Item i = new Item(
				 tempArray[0],
				 tempArray[1],
				 tempArray[2],
				 tempArray[3],
				 tempArray[4]
				);
			this.shopStock.add(i);
			}
		} catch (Exception e) {
			Tycoon.out("Hail satan.");
			System.out.println("Could not read the shop.csv file.");
			System.exit(-1);
		}
	}

	public Item getItemById(int id) {
		for (Item i : shopStock) {
			if (i.id == id) {
				return i;
			}
		}
		return null;
	}

	public void buy(Player p, int id, int amt) {
		try {
			Item i = getItemById(id);
			if (p.balance >= i.price * amt) {
				for (int j = 0; j < amt; j++) {
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
