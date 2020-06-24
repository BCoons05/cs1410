package guiLayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LabGuiLayout extends JFrame {

	private JPanel contentPane;
	private int blueIdx = 3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiLayout frame = new LabGuiLayout();
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
	public LabGuiLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = newLblNewLabel();
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = numberPanelContainer();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JPanel panel = newButtonPanel(panel_1);
		contentPane.add(panel, BorderLayout.WEST);
	}

	private JPanel numberPanelContainer() {
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new GridLayout(1, 4, 10, 10));
		
		updatePanels(panel_1);

		return panel_1;
	}

	/**
	 * Creates the colored and numbered labels.
	 * 
	 * @param panelNum
	 * @param color
	 * @return label with given number and color
	 */
	private JLabel newNumberedLabel(String panelNum, Color color) {
		JLabel lblNewLabel = new JLabel(panelNum);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(color);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		return lblNewLabel;
	}

	/**
	 * Creates button panel and adds action events.
	 * 
	 * @param panel_1
	 * @return jpanel with buttons
	 */
	private JPanel newButtonPanel(JPanel panel_1) {
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 10, 0, 10));
		panel.setPreferredSize(new Dimension(75, 10));
		panel.setMinimumSize(new Dimension(75, 10));
		panel.setLayout(new GridLayout(4, 1, 10, 10));
		
		JButton btnNewButton_1 = new JButton("<==");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(blueIdx > 0) {
					--blueIdx;
				} else {
					blueIdx = 3;
				}
				updatePanels(panel_1);
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("==>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blueIdx = ++blueIdx % 4;
				updatePanels(panel_1);
			}
		});
		panel.add(btnNewButton);
		
		return panel;
	}

	/**
	 * Creates title label.
	 * 
	 * @return jlabel
	 */
	private JLabel newLblNewLabel() {
		JLabel lblNewLabel = new JLabel("Demo Layout");
		lblNewLabel.setPreferredSize(new Dimension(63, 40));
		lblNewLabel.setMinimumSize(new Dimension(63, 20));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		return lblNewLabel;
	}
	
	/**
	 * Updates panel with numbered labels to new location of blue label.
	 * 
	 * @param panel_1
	 */
	private void updatePanels(JPanel panel_1) {
		panel_1.removeAll();
		
		JLabel lblNewLabel_1 = newNumberedLabel("1", Color.yellow);
		JLabel lblNewLabel_2 = newNumberedLabel("2", Color.blue);
		JLabel lblNewLabel_3 = newNumberedLabel("3", Color.yellow);
		JLabel lblNewLabel_4 = newNumberedLabel("4", Color.yellow);
		
		switch(blueIdx) {
			case(0):
				panel_1.add(lblNewLabel_2);
				panel_1.add(lblNewLabel_1);
				panel_1.add(lblNewLabel_3);
				panel_1.add(lblNewLabel_4);
				break;
			case(1):
				panel_1.add(lblNewLabel_1);
				panel_1.add(lblNewLabel_2);
				panel_1.add(lblNewLabel_3);
				panel_1.add(lblNewLabel_4);
				break;
			case(2):
				panel_1.add(lblNewLabel_1);
				panel_1.add(lblNewLabel_3);
				panel_1.add(lblNewLabel_2);
				panel_1.add(lblNewLabel_4);
				break;
			case(3):
				panel_1.add(lblNewLabel_1);
				panel_1.add(lblNewLabel_3);
				panel_1.add(lblNewLabel_4);
				panel_1.add(lblNewLabel_2);
				break;
		}
		
		revalidate();
		repaint();
	}

}
