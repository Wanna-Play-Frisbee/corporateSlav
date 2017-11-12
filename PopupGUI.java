import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PopupGUI {
	private static JFrame frame;
	static JGUI window;

	public PopupGUI(String message) {
		window = new JGUI();
		frame = new JFrame();
		frame.setTitle("Slav Says");
		JOptionPane.showMessageDialog(frame, message);
	}
	
	public static String QuestionGUI(String message) {
		return JOptionPane.showInputDialog(message);
	}
}
