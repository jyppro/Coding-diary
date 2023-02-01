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

public class StudyProg extends JFrame {
	// 전역변수 선언
	JButton btnBat, btnIns, btnDis, btnOut;
	ArrayList<Student1> stList = new ArrayList<Student1>();
	JTextField tf_id, tf_name;
	JComboBox<String> cb_hk;
	
	public StudyProg() {
		createGUI();
		doEvent();
		this.setSize(250, 300);
		this.setVisible(true);
	}
	
	// 그래픽 요소 만들기
	private void createGUI() {
		this.setTitle("기말 연습 20190816 박재영");
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
		btnBat = new JButton("일괄입력");
		btnIns = new JButton("입력");
		btnDis = new JButton("파일출력");
		btnOut = new JButton("보고서출력");
		con.add(btnBat); con.add(btnIns); con.add(btnDis); con.add(btnOut);
	}
	
	// 동작 만들기
	private void doEvent() {
		btnBat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				batchStudent();
			}
		});
		
		btnIns.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(tf_id.getText());
				String name = tf_name.getText();
				String hk = cb_hk.getSelectedItem().toString();
				stList.add(new Student1(id, name, hk));
				System.out.println(name + "입력되었습니다.");
				
			}
		});
		
		btnDis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String data;
				FileWriter fw = null;
				try {
					fw = new FileWriter("C:\\\\Users\\\\Master\\\\eclipse-workspace\\\\final prac\\\\20190816_박재영 연습.txt");
					for(Student1 student : stList) {
						data = " " + student.getStudentId() + " " + student.getStudentName() + " " + student.getMajor();
						fw.write(data + "\n");
					}
					fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
					System.out.println("파일 출력 오류~");
				}
			}
		});
		
		btnOut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("-------------------------");
				System.out.println("|   학번  |  이름  |  학과  |");
				System.out.println("-------------------------");
				for(Student1 student : stList) {
					System.out.println(" " + student.getStudentId() + " " + student.getStudentName() + " " +student.getMajor());
				}
			}
		});
	}
	private void batchStudent() {
		try {
			Student1 student = null;
			Scanner scan = new Scanner(new FileReader("studentinfo.txt"));
			while(scan.hasNextLine() == true) {
				int id = scan.nextInt();
				String name = scan.next();
				int hkCode = scan.nextInt();
				if (hkCode == Define1.SW) {
					student = new Student1(id, name, "컴퓨터소프트웨어공학과");
					stList.add(student);
				} else if (hkCode == Define1.INFO) {
					student = new Student1(id, name, "컴퓨터정보과");
					stList.add(student);
				} else if (hkCode == Define1.DESIGN) {
					student = new Student1(id, name, "디자인과");
					stList.add(student);
				} else if (hkCode == Define1.TONGSIN) {
					student = new Student1(id, name, "전기전자정보통신과");
					stList.add(student);
				} else if (hkCode == Define1.KY) {
					student = new Student1(id, name, "경영학과");
					stList.add(student);
				} else if (hkCode == Define1.AI) {
					student = new Student1(id, name, "인공지능소프트웨어학과");
					stList.add(student);
				} else {
					System.out.println("전공과목 오류입니다.");
				}
			}
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일읽기 에러~");
		}
	}

	public static void main(String[] args) {
		new StudyProg();
	}

}
