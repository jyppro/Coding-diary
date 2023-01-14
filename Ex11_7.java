package week13;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex11_7 extends JFrame {
	private JRadioButton [] radio = new JRadioButton [3];
	private String [] text = {"구글", "저금통", "감튀"};
	private ImageIcon [] image = {
					new ImageIcon("C:\\Users\\Master\\Desktop\\images\\img06.jpg"),
					new ImageIcon("C:\\Users\\Master\\Desktop\\images\\img08.jpg"),
					new ImageIcon("C:\\Users\\Master\\Desktop\\images\\img09.jpg")};
	private JLabel imageLabel = new JLabel();
	
	public Ex11_7() {
		setTitle("라디오버튼 Item Event 예제 20190816 박재영");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel radioPanel = new JPanel(); 
		radioPanel.setBackground(Color.GRAY);
		ButtonGroup g = new ButtonGroup(); 
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		radio[2].setSelected(true); 
		c.add(radioPanel, BorderLayout.NORTH); 
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); 
		setSize(250,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return; 
			if(radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else
				imageLabel.setIcon(image[2]);
		}
	}
	public static void main(String [] args) {
		new Ex11_7();
	}
}