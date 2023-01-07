import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ex11_6 extends JFrame{
	public Ex11_6() {
		super("라디오버튼예제 20190816 박재영");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		ImageIcon ic_cherry = new ImageIcon("C:\\cherry.jpg");
		
		ButtonGroup g1 = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", ic_cherry);
		cherry.setBorderPainted(true);
		
		g1.add(apple);
		g1.add(pear);
		g1.add(cherry);
		
		con.add(apple);
		con.add(pear);
		con.add(cherry);
		
		JButton btn = new JButton("확인");
		con.add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if( apple.isSelected() )
					System.out.println("사과 선택됨");
				if( pear.isSelected() )
					System.out.println("배 선택됨");
				if( cherry.isSelected() == true )
					System.out.println("체리 선택됨");
			}
		});
		
		this.setSize(1200,800);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex11_6();

	}

}
