package tycoon;
public class Item {
	int id;
	int price;
	int generation;
	String name;
	String desc;
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
