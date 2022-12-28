import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class prac2 extends JFrame{
	public prac2() {
		setTitle("BorderLayout 20190816 박재영");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new prac2();
	}

}
