package omoke;

import java.awt.Container;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI extends JFrame{
	private Container c;
	MapSize size = new MapSize();
	
	public GUI(String title) {
		c = getContentPane();
		setBounds(200, 20, 650, 700);
		c.setLayout(null);
		Map map = new Map(size);
		DrawBoard d = new DrawBoard(size, map);
		setContentPane(d);
		addMouseListener(new MouseEventHandler(map, size, d, this));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showPopUp(String message) {
		JOptionPane.showMessageDialog(this, message, "", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
