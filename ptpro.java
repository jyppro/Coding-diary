import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ptpro extends JFrame{
	JButton btn1, btn2, btn3, btn4;
	ArrayList<Student2> stList = new ArrayList<Student2>();
	JTextField tf_id, tf_name;
	JComboBox<String> cb_hk;
	public ptpro() {
		createGUI();
		doEvent();
		this.setSize(250, 300);
		this.setVisible(true);
	}
	private void createGUI() {
		this.setTitle("20190816 박재영 기말고사");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		
		con.add(new JLabel("학번"));
		tf_id = new JTextField(20);
		con.add(tf_id);
		con.add(new JLabel("이름"));
		tf_name = new JTextField(20);
		con.add(tf_name);
		con.add(new JLabel("학과"));
		String[] hkdatas = {"컴퓨터소프트웨어공학과", "컴퓨터정보과", "전기전자통신과학과", "디자인과", "경영학과", "인공지능소프트웨어공학과"};
		cb_hk = new JComboBox<String>(hkdatas);
		con.add(cb_hk);
		
		btn1 = new JButton("일괄입력");
		btn2 = new JButton("입력");
		btn3 = new JButton("파일출력");
		btn4 = new JButton("보고서 출력");
		con.add(btn1); con.add(btn2); con.add(btn3); con.add(btn4);
	}
	private void doEvent() {
		//일괄입력
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				batchStudent();
			}
		});
		//입력
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tf_id.getText());
				String name = tf_name.getText();
				String hk = cb_hk.getSelectedItem().toString();
				stList.add(new Student2(id, name, hk));
				System.out.println("입력되었습니다.");
			}
		});
		//파일출력
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String data;
				FileWriter fw = null;
				try {
					fw = new FileWriter("C:\\Users\\Master\\eclipse-workspace\\final prac\\20190816_박재영 연습2.txt");
					for(Student2 student : stList) {
						data = " " + student.getstudentId() + " " + student.getstudentName() + " " + student.getMajor();
						fw.write(data + "\n");
					}
					fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
					System.out.println("파일출력 오류~");
				}
			}
		});
		//보고서출력
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("-------------------------");
				System.out.println("|  학번  |  이름  |  학과  |");
				System.out.println("-------------------------");
				for(Student2 student : stList) {
					System.out.println(" " + student.getstudentId() + " " + student.getstudentName() + " " + student.getMajor());
				}
			}
		});
	}
	private void batchStudent() {
		try {
			Student2 student = null;
			Scanner scan = new Scanner(new FileReader("studentinfo.txt"));
			while(scan.hasNextLine() == true) {
				int id = scan.nextInt();
				String name = scan.next();
				int hkCode = scan.nextInt();
				if(hkCode == Define2.sw) {
					student = new Student2(id, name, "컴소");
					stList.add(student);
				} else if(hkCode == Define2.info) {
					student = new Student2(id, name, "정보");
					stList.add(student);
				} else if(hkCode == Define2.tongsin) {
					student = new Student2(id, name, "통신");
					stList.add(student);
				} else if(hkCode == Define2.ky) {
					student = new Student2(id, name, "경영");
					stList.add(student);
				} else if(hkCode == Define2.ai) {
					student = new Student2(id, name, "인공지능");
					stList.add(student);
				} else {
					System.out.println("전공과목 오류~~");
				}
			}
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일읽기 에러~");
		}
	}

	public static void main(String[] args) {
		new ptpro();
	}
}
