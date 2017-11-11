package tycoon;
import java.util.*;

public class Shop {
	String fileName;
	Scanner readyBoi;
	ArrayList shopStock = new ArrayList();
	public static Shop lastShop;
	
	public Shop(String stock){
		this.readyBoi = new Scanner(this.fileName);
		if(readyBoi.hasNextLine()){
			String temp = readyBoi.nextLine();
			Object tempArray[] = temp.split("\t",2);
			tempArray[0] = Integer.parseInt((String)tempArray[0]);
			this.shopStock.add(tempArray);
		}
		Shop.lastShop = this;
	}
	
	public int getValue(int itemNum){
		return (int)(((Object[])(shopStock.get(itemNum)))[0]);
	}
	
	public String getItem(int itemNum){
		return (String)(((Object[])(shopStock.get(itemNum)))[1]);
	}
	
	public String buy(Player p, int itemNum, int amt){
		String response;
		if(p.balance >= (lastShop.getValue(itemNum)) * amt) {
			p.balance-= (lastShop.getValue(itemNum)) * amt;
			for(int i=1; i<=amt; i++){
				p.invAdd(lastShop.getItem(itemNum));
			}
			response = ("Successfully bought "+amt+" "+(lastShop.getItem(itemNum)));
		} else {
			response = "Sorry, but you can't afford that.";
		}
		return response;
	}
	
}
