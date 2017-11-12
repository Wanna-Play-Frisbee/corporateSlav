import java.awt.HeadlessException;
import java.util.ArrayList;

public class Tycoon {

	public static ArrayList<Player> players = new ArrayList<Player>();
	static Player you;
	public static void main(String[] args) {
		JGUI.init();
		you = new Player(PopupGUI.QuestionGUI("What is your name?"));
		Shop shop = new Shop("shop.csv");
		players.add(you);
		Thread payments = new Payment("Payment Thread");
		JGUI.show();
		payments.start();
	}

	public static void out(String s) {
		System.out.println(s);
		try {
			new PopupGUI(s);
		} catch (HeadlessException e) {} //Eat errors silently
	}
	public static void command(String s) {
		String command[] = s.split(",/ /");
	}

}
