package week13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGame extends JFrame {
	private int randomNum;
    private JTextField inputField;
    private JLabel guideLabel;
    private JButton bt_retry;
    private JButton bt_exit;
    
	public NumberGame() {
		super("숫자게임");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		Container con= this.getContentPane();
		
        setRandomNum();
        JLabel lb_info = new JLabel("숫자를 추측하시오 : ");
        inputField = new JTextField(10);
        inputField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
                    if(Integer.parseInt(inputField.getText()) < randomNum){
                          guideLabel.setText("너무 낮습니다!");
                          guideLabel.setBackground(Color.RED);
                    }
                    else if(Integer.parseInt(inputField.getText()) > randomNum){
                          guideLabel.setText("너무 높습니다!");
                          guideLabel.setBackground(Color.RED);
                    }
                    else{
                          guideLabel.setText("정답입니다!");
                          guideLabel.setBackground(Color.WHITE);
                    }
             }
             catch(NumberFormatException ne){
                    guideLabel.setText("잘못된 입력입니다!");
                    guideLabel.setBackground(Color.RED);
             }
             inputField.selectAll();      
			}
		});
        JPanel topPanel = new JPanel();
        topPanel.add(lb_info);
        topPanel.add(inputField);
        
        guideLabel = new JLabel("숫자를 입력하시오.");
        guideLabel.setBackground(Color.WHITE);
        guideLabel.setOpaque(true);

        JPanel middlePanel = new JPanel();
        middlePanel.add(guideLabel);

        bt_retry = new JButton("새 게임");
        bt_exit = new JButton("종료");
        bt_retry.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setRandomNum();
                guideLabel.setText("숫자를 입력하시오.");
                inputField.setText("");
			}
		});
        bt_exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
        });

        JPanel lowPanel = new JPanel();
        lowPanel.add(bt_retry);
        lowPanel.add(bt_exit);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(topPanel);
        mainPanel.add(middlePanel);
        mainPanel.add(lowPanel);
        con.add(mainPanel);        
        pack();
        setVisible(true);
	}
    public int getRandomNum() {return randomNum;}
	public void setRandomNum() {
		randomNum = (int)(Math.random()*100)+1;
	}
	public static void main(String args[]) {
		new NumberGame();  
	}
} 