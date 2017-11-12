import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Shop {

	String filename;
	ArrayList<Item> shopStock = new ArrayList<Item>();
	ArrayList<Item> ogShop = new ArrayList<Item>();
	Scanner reader;
	File filereader;

	public Shop(String stock) {
		this.filename = stock;
		filereader = new File("./shop.csv");
		try {
			reader = new Scanner(filereader, "UTF-8");
			while (reader.hasNextLine()) {
				String temp = reader.nextLine();
				// System.out.println(temp);
				String tempArray[] = temp.split("\t");
				Item i = new Item(
						tempArray[0],
						tempArray[1],
						tempArray[2],
						tempArray[3],
						tempArray[4],
						tempArray[5]
					);
				this.shopStock.add(i);
				this.ogShop.add(i.clone());
			}
		} catch (Exception e) {
			System.out.println("Could not read the shop.csv file.");
			e.printStackTrace();
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

	public Item getOGItemById(int id) {
		for (Item i : ogShop) {
			if (i.id == id) {
				return i;
			}
		}
		return null;
	}

	public void updatePrices(Player p, int id, int amt) {
		double amtOfItem = (double) Collections.frequency(p.playerInv, id);
		getItemById(id).price = Math.pow(getOGItemById(id).pInc, amtOfItem) * getOGItemById(id).price;
	}

	public void buy(Player p, int id, int amt) {
		try {
			Item i = getItemById(id);
			if (p.balance >= i.price * amt) {
				for (int j = 0; j < amt; j++) {
					p.invAdd(i.clone());
				}
				p.balance -= i.price * amt;
				updatePrices(p, id, amt);
			} else {
				Tycoon.out("You do not have enough money!");
			}
		} catch (java.lang.NullPointerException e) {
			Tycoon.out("There are no more of that item!");
		}
	}

}
