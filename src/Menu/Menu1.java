package Menu;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Menu1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu1 frame = new Menu1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(1, 0, 163, 286);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAddNewEmployee = new JButton("1.Add new Employee");
		btnAddNewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu1 window = new Menu1();
				window.setVisible(true);
				
			}
		});
		btnAddNewEmployee.setBounds(2, 0, 160, 64);
		btnAddNewEmployee.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnAddNewEmployee);
		
		JButton btnNewButton = new JButton("2.Modify list of Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu22 window2 = new Menu22();
				window2.setVisible(true);
			}
		});
		btnNewButton.setBounds(1, 71, 160, 64);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnNewButton);
		
		JButton btnupdateBasicSalary = new JButton("3.Update basic salary");
		btnupdateBasicSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu3 window3 = new Menu3();
				window3.setVisible(true);
			}
		});
		btnupdateBasicSalary.setBounds(1, 145, 160, 63);
		panel.add(btnupdateBasicSalary);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setBounds(1, 218, 160, 64);
		panel.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(200, 0, 275, 287);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setHorizontalAlignment(SwingConstants.LEFT);
		lblId.setBounds(26, 14, 70, 25);
		panel_1.add(lblId);
		
		JLabel lblType = new JLabel("TYPE :");
		lblType.setHorizontalAlignment(SwingConstants.LEFT);
		lblType.setBounds(26, 46, 76, 14);
		panel_1.add(lblType);
		
		JLabel lblFullName = new JLabel("Full Name :");
		lblFullName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFullName.setBounds(26, 71, 94, 14);
		panel_1.add(lblFullName);
		
		JLabel lblYearOfBirth = new JLabel("Year Of Birth :");
		lblYearOfBirth.setBounds(26, 96, 105, 14);
		panel_1.add(lblYearOfBirth);
		
		JLabel lblHomeTown = new JLabel("Home Town :");
		lblHomeTown.setBounds(26, 121, 105, 14);
		panel_1.add(lblHomeTown);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setBounds(24, 146, 107, 14);
		panel_1.add(lblDepartment);
		
		JLabel lblSalaryRatio = new JLabel("Salary Ratio :");
		lblSalaryRatio.setBounds(26, 171, 101, 14);
		panel_1.add(lblSalaryRatio);
		
		JLabel lblYearOfWork = new JLabel("Year Of Work :");
		lblYearOfWork.setBounds(26, 196, 106, 14);
		panel_1.add(lblYearOfWork);
		
		JLabel lblPosition = new JLabel("Position :");
		lblPosition.setBounds(26, 221, 108, 14);
		panel_1.add(lblPosition);
		
		textField = new JTextField();
		textField.setBounds(134, 12, 130, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 65, 130, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Apply");
		btnNewButton_1.setBounds(176, 257, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(134, 40, 130, 20);
		panel_1.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(134, 90, 130, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(134, 115, 130, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(134, 140, 130, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(134, 165, 130, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(134, 190, 130, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(134, 215, 130, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
	}
}
