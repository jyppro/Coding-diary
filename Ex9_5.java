import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex9_5 extends JFrame {
	public Ex9_5() {
		setTitle("GridLayout 20190816 박재영");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		JLabel name = new JLabel(" 이름");
		con.setLayout(grid);
		con.add(name);
		con.add(new JTextField(""));
		con.add(new JLabel(" 학번"));
		con.add(new JTextField(""));
		con.add(new JLabel(" 학과"));
		con.add(new JTextField(""));
		con.add(new JLabel(" 과목"));
		con.add(new JTextField(""));
		con.add(new JButton("확인"), 5, 1);
		con.add(new JButton("취소"), 5, 1);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex9_5();
	}

}
