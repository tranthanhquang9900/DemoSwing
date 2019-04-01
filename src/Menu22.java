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
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Menu22 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu22 frame = new Menu22();
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
	public Menu22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 153, 291);
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
		btnExit.setBounds(2, 227, 143, 64);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnExit);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(158, 5, 406, 291);
		contentPane.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 0, 216, 195);
		panel_1_2.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(199, 0, 17, 190);
		panel_2.add(scrollBar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(215, 0, 191, 291);
		panel_1_2.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(10, 223, 89, 23);
		panel_3.add(btnNewButton_1);
		
		JButton btnApply = new JButton("Apply");
		btnApply.setBounds(102, 223, 89, 23);
		panel_3.add(btnApply);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(10, 257, 89, 23);
		panel_3.add(btnModify);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(102, 257, 89, 23);
		panel_3.add(btnDelete);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 195, 216, 96);
		panel_1_2.add(panel_4);
		panel_4.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 11, 104, 33);
		panel_4.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(114, 11, 94, 33);
		panel_4.add(textArea);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(114, 62, 89, 23);
		panel_4.add(btnSearch);
	}
}
