import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex10_1 extends JFrame {
	public Ex10_1() {
		super("독립클래스 이벤트처리 20190816 박재영");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		con.add(btn);
		MyActionListener lis = new MyActionListener();
		btn.addActionListener(lis);
		JButton btn2 = new JButton("Cancel");
		con.add(btn2);
		
		this.setSize(350, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex10_1();
	}
}

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		System.out.println("Action 버튼을 클릭했어요~");
		JButton b = (JButton) e.getSource();
		if ( b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
	
}
