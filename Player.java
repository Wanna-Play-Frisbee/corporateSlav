/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tycoon;
import java.util.*;

/**
 *
 * @author smolboi
 */
public class Player {
	int balance = 0;
	String name = "Player";
	ArrayList<Item> playerInv = new ArrayList<Item>();
	
	public Player(String newName) {
		this.name = newName;
	}
	
	public void invAdd(Item i){
		this.playerInv.add(i);
	}
	
	public void invRm(Item i){
		playerInv.remove(playerInv.indexOf(i));
	}
	
}
