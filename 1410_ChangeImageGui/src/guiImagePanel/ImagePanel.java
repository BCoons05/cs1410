package guiImagePanel;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Class to create a new image panel with 4 images that can be changed with control panel selections.
 * 
 * @author Brian
 *
 */
public class ImagePanel extends JPanel {
	private String[] fields = {"/images/field1.jpg", "/images/field2.jpg", "/images/field3.jpg"};
	private String[] offenses = {"/images/defense1.png", "/images/defense2.png", "/images/defense3.png"};
	private String[] defenses = {"/images/offense1.png", "/images/offense2.png", "/images/offense3.png"};
	private String[] gametime = {"/images/gametime1.png", "/images/gametime2.png", "/images/gametime3.png"};
	private int fieldIdx = 0;
	private int offenseIdx = 0;
	private int defenseIdx = 0;
	private int time = 0;

	/**
	 * Create the panel.
	 */
	public ImagePanel() {

	}
	
	/**
	 * Changes image of the field.
	 */
	public void changeField() {
		fieldIdx = ++fieldIdx % fields.length;
		repaint();
	}
	
	/**
	 * Changes image of the offense.
	 */
	public void changeOffense() {
		offenseIdx = ++offenseIdx % offenses.length;
		repaint();
	}
	
	/*
	 * changes image of the defense.
	 */
	public void changeDefense() {
		defenseIdx = ++defenseIdx % defenses.length;
		repaint();
	}
	
	/*
	 * Changes current game time.
	 */
	public void changeGametime() {
		time = ++time % gametime.length;
		repaint();
	}
	
	/**
	 * Paints images into the panel.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		ImageIcon field = new ImageIcon(ImagePanel.class.getResource(fields[fieldIdx]));
		field.paintIcon(this, g, 0, 0);
		
		ImageIcon defense = new ImageIcon(ImagePanel.class.getResource(defenses[offenseIdx]));
		defense.paintIcon(this, g, 0, 0);
		
		ImageIcon offense = new ImageIcon(ImagePanel.class.getResource(offenses[defenseIdx]));
		offense.paintIcon(this, g, 0, 0);
		
		ImageIcon timeout = new ImageIcon(ImagePanel.class.getResource(gametime[time]));
		timeout.paintIcon(this, g, -45, -45);
	}

}
