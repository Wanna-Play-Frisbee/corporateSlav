package main;
import java.util.*;

public class gameShop{
    Scanner sboi = new Scanner(new File("/home/smallboi/bingo/shop.txt"));
    Scanner sgril = new Scanner(new File("/home/smallboi/bingo/basePrices.txt"));
    public static ArrayList shop = new ArrayList();
    public static ArrayList basePrices = new ArrayList();
    
    public void define() {
        while (sboi.hasNextLine()) {
            shop.add(sboi.nextLine());
        }
        while (sgril.hasNextLine()) {
            basePrices.add(sgril.nextLine());
        }
    }
	
    public String check() {
        String response = "";
        for (int i=0; i<shop.size(); i++) {
	    response += shop.get(i)+", "+basePrices.get(i) + '\n';
        }
	return response;
    }
	
    public int getValue(int itemNum) {
		return(Integer.parseInt(basePrices.get(itemNum).toString()));
    }
	
    public String getItem(int itemNum) {
		return(shop.get(itemNum).toString());
    }
	
    public String buy(int itemNum, int amt){
		String response;
        if (Balance >= (gameShop.getValue(itemNum) * amt)){
        	Balance.rem(gameShop.getValue(itemNum)*amt);
                inventory.addTo(gameShop.getItem(itemNum)*amt);
                response=("Successfully bought "+amt+" of "+gameShop.getItem(itemNum));
		} else {
            response="Queef, you can't afford that.";
        }
        return response;
    }
	
}
