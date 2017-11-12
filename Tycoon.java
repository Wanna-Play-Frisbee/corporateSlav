package tycoon;
import java.util.ArrayList;
/**
 *
 * @author smolboi
 */
public class Tycoon {

	public static ArrayList<Player> players = new ArrayList<Player>();
	public static void main(String[] args) {
		Player you = new Player("mitchel");
		Shop shop = new Shop("shop.csv");
		players.add(you);
		Thread payments = new Payment("Payment Thread");
		payments.start();
	}
	public static void out(String s){
		System.out.println(s);
	}
	
}
