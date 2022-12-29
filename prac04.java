import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class prac04 extends JFrame{
	public prac04() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		
		con.setLayout(new GridLayout(1, 10));
		
		for(int i = 0; i < 10; i++) {
			Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
					Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
			String text = Integer.toString(i);
			JButton b = new JButton(text);
			b.setOpaque(true);
			b.setBackground(col[i]);
			con.add(b);
		}
		setSize(600, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new prac04();
	}

}
