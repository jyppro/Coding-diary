import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenC extends JFrame{
	public OpenC() {
		setTitle("OpenChellenge 20190816 박재영");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.yellow);
		panel1.add(new JButton("Open"));
		panel1.add(new JButton("Read"));
		panel1.add(new JButton("Close"));
		con.add(panel1, BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(new JLabel("Hello"), BorderLayout.NORTH);
		panel2.add(new JLabel("Java~"), BorderLayout.WEST);
		panel2.add(new JLabel("Love~"), BorderLayout.EAST);
		con.add(panel2, BorderLayout.CENTER);
		
		
		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new OpenC();
	}

}
