import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class prac07 extends JFrame{
	public prac07(){
	setTitle("계산기 프레임");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container con = getContentPane();
	
	JPanel pan1 = new JPanel(); 	//입력창
	pan1.add(new JLabel("수식입력"));
	pan1.add(new JTextField(20));
	pan1.setBackground(Color.LIGHT_GRAY);
	con.add(pan1, BorderLayout.NORTH);
	
	JPanel pan2 = new JPanel(); 	//버튼
	pan2.setLayout(new GridLayout(4, 4, 3 ,3));
	for(int i = 0; i < 16; i++) {
		JButton b = new JButton();
		String[] str = {"CE", "계산", "+", "-", "x", "/"};
		pan2.add(b);
		if(i<10) {
			b.setText(i+"");
		}else {
			b.setText(str[i-10]);
		}
		if(i>11) {
			b.setOpaque(true);
			b.setBackground(Color.CYAN);
		}
	}
	con.add(pan2);
	
	JPanel pan3 = new JPanel(); 	//텍스트
	pan3.add(new JLabel("계산 결과"));
	pan3.add(new JTextField(20));
	pan3.setBackground(Color.YELLOW);
	con.add(pan3, BorderLayout.SOUTH);
		
	setSize(400,300);
	setVisible(true);	
	}

	public static void main(String[] args) {
		new prac07();
	}
}
