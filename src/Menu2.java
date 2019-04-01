import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Menu2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu2 frame = new Menu2();
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
	public Menu2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(2, 0, 150, 293);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAddNewEmployee = new JButton("1.Add new Employee");
		btnAddNewEmployee.setBounds(2, 0, 146, 64);
		btnAddNewEmployee.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnAddNewEmployee);
		
		JButton btnNewButton = new JButton("2.Modify list of Employee");
		btnNewButton.setBounds(1, 76, 145, 64);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);
		
		JButton btnupdateBasicSalary = new JButton("3.Update basic salary");
		btnupdateBasicSalary.setBounds(1, 155, 144, 63);
		panel.add(btnupdateBasicSalary);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setBounds(2, 227, 143, 64);
		panel.add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(160, 2, 199, 213);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(181, 1, 17, 205);
		panel_1.add(scrollBar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(162, 217, 208, 74);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(5, 7, 97, 27);
		panel_2.add(comboBox);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(106, 43, 97, 23);
		panel_2.add(btnSearch);
		
		textField = new JTextField();
		textField.setBounds(106, 7, 98, 27);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(370, 1, 167, 292);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(4, 268, 78, 18);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Modify");
		btnNewButton_2.setBounds(90, 246, 71, 18);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Apply");
		btnNewButton_3.setBounds(90, 268, 70, 18);
		panel_3.add(btnNewButton_3);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(6, 246, 76, 18);
		panel_3.add(btnDelete);
	}
}
