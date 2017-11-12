import java.util.*;

public class Player {

	int balance = 0;
	String name = "Player";
	double squatConstant = 1.0D;
	double squatSquad = 1.0D;
	
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

	public void squatMod(double squatNew) {
		this.squatConstant += squatNew;
	}
	
	public void squatSquadMod(double squadMod) {
		this.squatSquad += squadMod;
	}
}
