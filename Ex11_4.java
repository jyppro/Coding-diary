import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex11_4 extends JFrame{
	public Ex11_4() {
		super("체크박스예제 20190816 박재영");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		JCheckBox cb_apple = new JCheckBox("사과");
		JCheckBox cb_bae = new JCheckBox("배", true);
		
		ImageIcon icon = new ImageIcon("C:\\cherry.jpg");
		JCheckBox cb_cherry = new JCheckBox("체리", icon);
		con.add(cb_apple); con.add(cb_bae); con.add(cb_cherry);
		
		JButton btn = new JButton("확인");
		con.add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if( cb_apple.isSelected() )
					System.out.println("사과 선택됨");
				if( cb_bae.isSelected() )
					System.out.println("배 선택됨");
				if( cb_cherry.isSelected() == true )
					System.out.println("체리 선택됨");
			}
		});
		
		this.setSize(1200,800);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex11_4();
	}
}
