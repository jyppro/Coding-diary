import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex10_2 extends JFrame{
	public Ex10_2() {
		super("내부클래스 이벤트처리 20190816 박재영");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Action");
		JButton btn2 = new JButton("Cancel");
		btn1.addActionListener(new MyAction2());
		con.add(btn1);
		con.add(btn2);
		this.setSize(350,150);
		this.setVisible(true);
	}
	
	class MyAction2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if ( b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
		}
		
	}
	
	public static void main(String[] args) {
		new Ex10_2();
	}
}
