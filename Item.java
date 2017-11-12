package corporateSlav;
public class Item {

	int id;
	double price;
	int generation;
	String name;
	String desc;
	double pInc;

	public Item(String id, String price, String generation, String name, String desc, String pInc) {
		this.id = Integer.parseInt(id);
		this.price = Double.parseDouble(price);
		this.generation = Integer.parseInt(generation);
		this.name = name;
		this.desc = desc;
		this.pInc = Double.parseDouble(pInc);
	}

	public Item(int id, double price, int generation, String name, String desc, double pInc) {
		this.id = id;
		this.price = price;
		this.generation = generation;
		this.name = name;
		this.desc = desc;
		this.pInc = pInc;
	}

	public Item clone() {
		return new Item(id, price, generation, name, desc, pInc);
	}
}
