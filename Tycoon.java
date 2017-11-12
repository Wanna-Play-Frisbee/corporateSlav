import java.util.ArrayList;

public class Tycoon {

	public static ArrayList<Player> players = new ArrayList<Player>();
	static Player you;
	public static void main(String[] args) {
		you = new Player("mitchel");
		Shop shop = new Shop("shop.csv");
		players.add(you);
		Thread payments = new Payment("Payment Thread");
		payments.start();
		JGUI.main();
	}

	public static void out(String s) {
		System.out.println(s);
	}
	public static void command(String s) {
		String command[] = s.split(",/ /");
	}

}
