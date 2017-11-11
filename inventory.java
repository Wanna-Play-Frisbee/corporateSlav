package main;
import java.util.*;

public class inventory {
	ArrayList inv = new ArrayList();
	public void addTo(int itemNum, int amt){
		for (int i=0; i<=amt; i++) {
			inv.add(gameShop.getItem(itemNum));
		}
	}
}
