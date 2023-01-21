package week13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxDemo extends JFrame {
	JCheckBox[] cb_btns = new JCheckBox[4];
	String[] fruits = { "엔진오일 교환", "자동변속기오일교환", "에어콘필터교환", "타이어 교환"};
	int[] prices = { 45000, 80000, 30000, 100000 };
	int money=0; 	JLabel label;	
	public CheckBoxDemo() {
		super("자동차 정비소 앱 학번 이름");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Container con = this.getContentPane(); 
		con.setLayout(new FlowLayout());
		
		for (int i = 0; i < 4; i++) {
			cb_btns[i] = new JCheckBox(fruits[i]);
			this.add(cb_btns[i]);
		}
		JButton btn = new JButton("확인"); 
		con.add(btn); 
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				money = 0; 
				for (int i = 0; i < 4; i++) {
					if (cb_btns[i].isSelected()) 
							money += prices[i];									
				}
				label.setText("현재까지의 가격은"+money+"입니다.");
			}
		});		
		label = new JLabel("현재까지의 가격은"+money+"입니다.");
		label.setFont(new Font("Serif", 
				Font.BOLD | Font.ITALIC, 30)); 
		con.add(label);				
		this.setSize(500, 200);
		this.setVisible(true);
	}
	public static void main(String[] args) {		
		new CheckBoxDemo();
	}
}