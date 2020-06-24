package guiIntro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Dimension;

public class LabGuiIntro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiIntro frame = new LabGuiIntro();
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
	public LabGuiIntro() {
		setSize(new Dimension(300, 900));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTitle = newlblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JButton btnNewButton = newButton();
		contentPane.add(btnNewButton, BorderLayout.WEST);
		{
			JPanel textPanel = newTextPanel();
			contentPane.add(textPanel, BorderLayout.SOUTH);
		}
		{
			JLabel lblNewLabel_1 = newCenterLabel();
			contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
		}
	}

	private JLabel newCenterLabel() {
		JLabel lblNewLabel_1 = new JLabel("Hi");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 77));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		return lblNewLabel_1;
	}

	private JPanel newTextPanel() {
		JPanel textPanel = new JPanel();
		textPanel.setBorder(new EmptyBorder(5, 0, 5, 0));
		textPanel.setBackground(Color.GRAY);
		{
			JLabel lblNewLabel = new JLabel("Name:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textPanel.add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textPanel.add(textField);
			textField.setColumns(16);
		}
		return textPanel;
	}

	private JButton newButton() {
		JButton btnNewButton = new JButton("WEST");
		return btnNewButton;
	}

	private JLabel newlblTitle() {
		JLabel lblTitle = new JLabel("My First Gui");
		lblTitle.setBorder(new EmptyBorder(5, 0, 5, 0));
		lblTitle.setOpaque(true);
		lblTitle.setForeground(Color.GREEN);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblTitle.setBackground(new Color(0, 0, 255));
		return lblTitle;
	}

}
