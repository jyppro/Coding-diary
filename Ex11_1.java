import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex11_1 extends JFrame{
	public Ex11_1() {
		super("내부클래스 이벤트처리 20190816 박재영");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("빨간색글자 노란색 배경 버튼1");
		JButton btn2 = new JButton("비활성화 버튼2");
		JButton btn3 = new JButton("좌표출력 버튼3");
		con.add(btn1); con.add(btn2); con.add(btn3);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				int x = b.getX();
				System.out.println("x= " + x + ", y= " + b.getY());
			}
		});
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.RED);
		btn2.setEnabled(false);
		
		this.setSize(350,150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex11_1();
	}
}
