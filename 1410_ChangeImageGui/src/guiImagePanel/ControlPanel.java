package guiImagePanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlPanel extends JFrame {

	private JPanel contentPane;
	private ImagePanel imagePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlPanel frame = new ControlPanel();
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
	public ControlPanel() {
		setMinimumSize(new Dimension(980, 720));
		setPreferredSize(new Dimension(500, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = newControlPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		imagePanel = new ImagePanel();
		imagePanel.setMinimumSize(new Dimension(500, 500));
		imagePanel.setPreferredSize(new Dimension(300, 300));
		contentPane.add(imagePanel, BorderLayout.CENTER);
	}

	/**
	 * Creates new jpanel with a 3 checkboxes and a button that changes the images based on selections.
	 * 
	 * @return
	 */
	private JPanel newControlPanel() {
		JPanel panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(10, 40));
		panel_1.setPreferredSize(new Dimension(500, 40));
		
		JCheckBox newField = new JCheckBox("Change Field");
		panel_1.add(newField);
		
		JCheckBox offense = new JCheckBox("Change Offense Play");
		panel_1.add(offense);
		
		JCheckBox defense = new JCheckBox("Change Defense Play");
		panel_1.add(defense);
		
		JButton btnNewButton = new JButton("Run Play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(newField.isSelected()) {
					imagePanel.changeField();
				}
				if(offense.isSelected()) {
					imagePanel.changeOffense();
				}
				if(defense.isSelected()) {
					imagePanel.changeDefense();
				}
				if(!newField.isSelected() && !offense.isSelected() && !defense.isSelected()) {
					imagePanel.changeGametime();
				}
			}
		});
		panel_1.add(btnNewButton);
		
		return panel_1;
	}

}
