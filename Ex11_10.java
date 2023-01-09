package week13;

import javax.swing.*;
import java.awt.*;

public class Ex11_10 extends JFrame {
	private String [] fruits= {"apple", "banana", "kiwi", "mango", "pear",
							"peach", "berry", "strawberry", "blackberry"};
	private ImageIcon [] images = { 
						new ImageIcon("C:\\Users\\Master\\Desktop\\images\\img06.jpg"),
						new ImageIcon("C:\\Users\\Master\\Desktop\\images\\img07.jpg"),
						new ImageIcon("C:\\Users\\Master\\Desktop\\images\\img08.jpg"),
						new ImageIcon("C:\\Users\\Master\\Desktop\\images\\img09.jpg") };
	public Ex11_10() {
		setTitle("리스트 만들기 예제 20190816 박재영");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>(); 
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits); 
		c.add(new JScrollPane(scrollList)); 
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new Ex11_10();
	}
}