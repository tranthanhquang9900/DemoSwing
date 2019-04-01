import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Menu3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu3 frame = new Menu3();
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
	public Menu3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 156, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAddNewEmployee = new JButton("1.Add new Employee");
		btnAddNewEmployee.setBounds(2, 0, 153, 64);
		btnAddNewEmployee.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnAddNewEmployee);
		
		JButton btnNewButton = new JButton("2.Modify list of Employee");
		btnNewButton.setBounds(2, 66, 153, 64);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);
		
		JButton btnupdateBasicSalary = new JButton("3.Update basic salary");
		btnupdateBasicSalary.setBounds(2, 132, 153, 63);
		panel.add(btnupdateBasicSalary);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(2, 197, 153, 64);
		panel.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Current Basic Salary :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(168, 52, 129, 39);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(295, 61, 129, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Edit");
		btnNewButton.setBounds(208, 114, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Apply");
		btnNewButton_1.setBounds(320, 114, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
