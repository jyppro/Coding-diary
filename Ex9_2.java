import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex9_2 extends JFrame {
	public Ex9_2() {
		this.setTitle("버튼 컴포넌트 20190816 박재영");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.setBackground(Color.orange);
		JButton btn1 = new JButton("OK");
		con.add(btn1);
		JButton btn2 = new JButton("Cancel");
		con.add(btn2);
		con.add(new JButton("Ignore"));
		JButton btn3 = new JButton("확인");
		con.add(btn3);
		JButton btn4 = new JButton("취소");
		con.add(btn4);
		con.add(new JButton("수정"));
		JButton btn5 = new JButton("삭제");
		con.add(btn5);
		
		setSize(300, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex9_2();
	}

}
