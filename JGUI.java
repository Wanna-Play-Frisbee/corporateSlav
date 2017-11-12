import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JGUI {

	private static JFrame frame;
	private JTextField textField;

	static JGUI window;
	
	public static void init() {
		try {
			window = new JGUI();
			frame.setTitle("Corporate Slav");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void show() {
		window.frame.setVisible(true);
	}
	
	/**
	 * Create the application.
	 */
	public JGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollBar scrollBar = new JScrollBar();
		frame.getContentPane().add(scrollBar, BorderLayout.EAST);
		
		JLabel lblCorporateSlavPrealpha = new JLabel("Corporate Slav Pre-Alpha");
		lblCorporateSlavPrealpha.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorporateSlavPrealpha.setFont(new Font("FreeSans", Font.BOLD, 18));
		frame.getContentPane().add(lblCorporateSlavPrealpha, BorderLayout.NORTH);
		
		
		JTextPane textPane = new JTextPane();
		frame.getContentPane().add(textPane, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(textField.getText() + "\n");
				//SEND THE COMMANDY BOIZ AND CLEAR FIELDO
				Tycoon.command(textField.getText());
				textField.setText("");
			}
		});
		frame.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JButton btnSquat = new JButton("Squat");
		btnSquat.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0, Tycoon t) {
				//GIVE EM DAT SWEET SWEET SQUAT $$$
				Tycoon.you.balance+=(Tycoon.you.squatConstant*Tycoon.you.squatSquad);
				lblCorporateSlavPrealpha.setText("Corporate Slav Pre-Alpha, Bal: "+Tycoon.you.balance);
			}
		});
		frame.getContentPane().add(btnSquat, BorderLayout.WEST);
	}

}
