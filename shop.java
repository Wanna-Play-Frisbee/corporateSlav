package main;
import java.util.*;

public class shop{
    Scanner sboi = new Scanner(new File("/home/smallboi/bingo/shop.txt"));
    Scanner sgril = new Scanner(new File("/home/smallboi/bingo/basePrices.txt"));
    public static ArrayList shop = new ArrayList();
    public static ArrayList basePrices = new ArrayList();
    
    public void define(){
        while(sboi.hasNextLine()){
            shop.add(sboi.nextLine());
        }
        while(sgril.hasNextLine()){
            basePrices.add(sgril.nextLine());
        }
    }
    public ArrayList check(){
        for (var x; x < shop.length(); x++) {
            return shop.index(x);
            return basePrices.index(x);
        }
    }
    public String buy(int itemNum, int amt){
        if (Balance >= (shop.getValue(shopNum) * amt)){
        	Balance-=shop.getValue(shopNum);
	}else{
            return "Queef, you can't afford that.";
        }
        return "oof";
    }
    public String sell(int itemNum){
        
    }
}
