package try1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class regi extends JFrame {
	String name ;
	String dob;
	 String mark;
	private JTextField NAME;
	private JTextField DOB;
	private JTextField MARK;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regi frame = new regi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public regi() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\aswin\\Downloads\\app-store.png"));
		setTitle("REGISTRATION");
		getContentPane().setBackground(new Color(255, 0, 128));
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME:");
		lblNewLabel.setBounds(30, 28, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DATE OF BIRTH   ");
		lblNewLabel_1.setBounds(30, 86, 104, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MARKS");
		lblNewLabel_2.setBounds(30, 145, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		NAME = new JTextField();
		NAME.setText("ENTER YOUR NAME");
		NAME.setBounds(171, 25, 216, 20);
		getContentPane().add(NAME);
		NAME.setColumns(10);
		
		DOB = new JTextField();
		DOB.setText("ENTER DATE OF BIRTH");
		DOB.setBounds(171, 83, 216, 20);
		getContentPane().add(DOB);
		DOB.setColumns(10);

		
		MARK = new JTextField();
		MARK.setText("ENTER YOUR MARK");
		MARK.setBounds(171, 142, 216, 20);
		getContentPane().add(MARK);
		MARK.setColumns(10);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MARK.setText("");
				NAME.setText("");
				DOB.setText("");
			}
		});

		
		btnNewButton.setBounds(30, 198, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton SET = new JButton("SHOW");
		SET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MARK.setText(mark);
				NAME.setText(name);
				DOB.setText(dob);
			}
		});
		SET.setBounds(285, 198, 89, 23);
		getContentPane().add(SET);
		
		JButton SAVE = new JButton("SAVE");
		SAVE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = NAME.getText();
				dob = DOB.getText();
				mark =MARK.getText();
				MARK.setText("");
				NAME.setText("");
				DOB.setText("");
				
			}
		});
		SAVE.setBounds(157, 198, 89, 23);
		getContentPane().add(SAVE);

	}
}
