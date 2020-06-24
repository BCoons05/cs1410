package guiDice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LabGuiDice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiDice frame = new LabGuiDice();
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
	public LabGuiDice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = dieImage();
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		JButton btnNewButton = rollemButton(lblNewLabel);
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
	}

	private JLabel dieImage() {
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setImage(lblNewLabel, "");
		return lblNewLabel;
	}

	private JButton rollemButton(JLabel lbl) {
		JButton btnNewButton = new JButton("Roll 'em");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setImage(lbl, lbl.getIcon().toString());
			}
		});
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("KG All of Me", Font.PLAIN, 25));
		return btnNewButton;
	}
	
	private String setImage(JLabel lbl, String currentImage) {
		String[] images = {"/img/die-1.png", "/img/die-2.png", "/img/die-3.png", "/img/die-4.png", "/img/die-5.png", "/img/die-6.png"};
		String newImage = images[(int) (Math.random() * images.length)];
		
		if(currentImage.length() > 0) {
			System.out.println(newImage + " " + currentImage.substring(52, currentImage.length()));
			if(!currentImage.substring(52, currentImage.length()).equals(newImage)) {
				lbl.setIcon(new ImageIcon(LabGuiDice.class.getResource(newImage)));
			} else {
				setImage(lbl, currentImage);
			}
		} else {
			lbl.setIcon(new ImageIcon(LabGuiDice.class.getResource(newImage)));
		}
		
		return newImage;
	}

}
