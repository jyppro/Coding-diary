import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Exe11_8 extends JFrame {
	JButton jb[]=new JButton[2];
	ImageIcon image[]= {new ImageIcon("C:\\Users\\Master\\Desktop\\images\\img01.png"),
			new ImageIcon("C:\\\\Users\\\\Master\\\\Desktop\\\\images\\\\img02.png"),
			new ImageIcon("C:\\\\Users\\\\Master\\\\Desktop\\\\images\\\\img03.png"),
			new ImageIcon("C:\\\\Users\\\\Master\\\\Desktop\\\\images\\\\img04.png"),
			new ImageIcon("C:\\\\Users\\\\Master\\\\Desktop\\\\images\\\\img05.png")};
	int index = 0;
	JLabel jl=new JLabel(image[0]);
	public Exe11_8() {
		setTitle("Image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel north=new JPanel();
		north.setLayout(new FlowLayout());
		jb[0]=new JButton("left");
		jb[0].setSelected(true);
		jb[1]=new JButton("right");
		north.add(jb[0]);
		north.add(jb[1]);
		
		ButtonGroup g=new ButtonGroup();
		g.add(jb[0]);
		g.add(jb[1]);
		
		c.add(north,BorderLayout.NORTH);
		
		c.add(jl,BorderLayout.CENTER);
		jl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(jb[0].isSelected()) {
					index=(index+1)%image.length;
				}
				else {
					index--;
					if(index<0) {
						index=image.length-1;
					}
				}
				jl.setIcon(image[index]);
			}
		});
		
		setSize(800,800);
		setVisible(true);
	}
 
	public static void main(String[] args) {
		new Exe11_8();
	}
}