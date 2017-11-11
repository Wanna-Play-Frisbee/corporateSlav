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
	ArrayList playerInv = new ArrayList();
	
	public Player(String newName) {
		this.name = newName;
	}
	
	public void invAdd(String item){
		this.playerInv.add(item);
	}
	
	public void invRm(String item){
		int tempVal = playerInv.indexOf(item);
		playerInv.remove(tempVal);
	}
	
}
