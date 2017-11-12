public class Item {

	int id;
	int price;
	int generation;
	String name;
	String desc;

	public Item(String id, String price, String generation, String name, String desc) {
		this.id = Integer.parseInt(id);
		this.price = Integer.parseInt(price);
		this.generation = Integer.parseInt(generation);
		this.name = name;
		this.desc = desc;
	}

	public Item(int id, int price, int generation, String name, String desc) {
		this.id = id;
		this.price = price;
		this.generation = generation;
		this.name = name;
		this.desc = desc;
	}

	public Item clone() {
		return new Item(id, price, generation, name, desc);
	}
}
