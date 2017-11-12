import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import java.awt.BorderLayout;
import javax.swing.JLabel;
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

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JGUI window = new JGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
			}
		});
		frame.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JButton btnSquat = new JButton("Squat");
		btnSquat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//GIVE EM DAT SWEET SWEET SQUAT $$$
				
				lblCorporateSlavPrealpha.setText("Corporate Slav Pre-Alpha, Bal: "+Tycoon.you.balance);
			}
		});
		frame.getContentPane().add(btnSquat, BorderLayout.WEST);
	}

}