import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex11_2 extends JFrame{
	public Ex11_2() {
		super("레이블예제 20190816 박재영");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		JLabel lb_text = new JLabel("사랑합니다~~");
		con.add(lb_text);
		ImageIcon image = new ImageIcon("C:\\img1.jpg");
		JLabel lb_img = new JLabel(image);
		con.add(lb_img);
		
		this.setSize(350,250);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex11_2();
	}
}
