import java.util.*;

public class Player {

	int balance = 0;
	String name = "Player";
	ArrayList<Item> playerInv = new ArrayList<Item>();

	public Player(String newName) {
		this.name = newName;
	}

	public void invAdd(Item i) {
		this.playerInv.add(i);
	}

	public void invRm(Item i) {
		playerInv.remove(playerInv.indexOf(i));
	}

}
