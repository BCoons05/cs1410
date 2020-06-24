package counter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import guiDice.LabGuiDice;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter frame = new Counter();
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
	public Counter() {
		setPreferredSize(new Dimension(500, 200));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		RedCount redCount = new RedCount();
		
		JLabel lblNewLabel = redCounter();
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		
		JButton btnNewButton = newButton(redCount, lblNewLabel);
		contentPane.add(btnNewButton, BorderLayout.EAST);
		
		JLabel lblNewLabel_1 = ownerLabel();
		contentPane.add(lblNewLabel_1, BorderLayout.SOUTH);
	}

	/**
	 * Creates Label with owners name.
	 * 
	 * @return Label
	 */
	private JLabel ownerLabel() {
		JLabel lblNewLabel_1 = new JLabel("Brian's GUI");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setPreferredSize(new Dimension(52, 48));
		lblNewLabel_1.setBackground(SystemColor.controlHighlight);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		return lblNewLabel_1;
	}

	/**
	 * Creates new Button that changes background color on click
	 * and updates redCount if new color is red.
	 * 
	 * @param redCount
	 * @param counterLabel
	 * @return new Button
	 */
	private JButton newButton(RedCount redCount, JLabel counterLabel) {
		JButton btnNewButton = new JButton("Click Me");
		btnNewButton.addActionListener(new ActionListener() {
			/**
			 * Updates background color on button click and updates redCount if new color is red.
			 */
			public void actionPerformed(ActionEvent e) {
				changeBackground(btnNewButton, btnNewButton.getBackground());
				if(btnNewButton.getBackground().equals(Color.red)) {
					redCount.updateRedCount();
					int currentRed = redCount.getRedCount();
					counterLabel.setText("Red Counter: " + (currentRed < 10 ? "0" + currentRed : currentRed));
				}
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setPreferredSize(new Dimension(200, 23));
		btnNewButton.setMinimumSize(new Dimension(250, 23));
		btnNewButton.setFont(new Font("MV Boli", Font.PLAIN, 30));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		return btnNewButton;
	}

	/**
	 * Creates JLabel that counts the amount of times the button color is red.
	 * 
	 * @return JLabel
	 */
	private JLabel redCounter() {
		JLabel lblNewLabel = new JLabel("Red Counter: 00");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setPreferredSize(new Dimension(225, 14));
		lblNewLabel.setMinimumSize(new Dimension(250, 14));
		return lblNewLabel;
	}
	
	/**
	 * Changes the button background to a random color.
	 * 
	 * @param button
	 * @param currentColor
	 * @return new Color
	 */
	private Color changeBackground(JButton button, Color currentColor) {
		Color[] colors = {Color.red, Color.blue, Color.green, Color.orange, Color.magenta};
		Color newColor = colors[(int) (Math.random() * colors.length)];
		
		if(!currentColor.equals(newColor)) {
			button.setBackground(newColor);
		} else {
			changeBackground(button, currentColor);
		}
		
		return newColor;
	}

}
