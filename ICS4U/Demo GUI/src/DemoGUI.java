import javax.swing.*;
//import java.awt.event.*;
import java.awt.*;

public class DemoGUI extends JFrame{
	private JButton button;
	private JTextArea area;
	
	public DemoGUI() {
		this.setSize(600, 400);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("GUI DEMO");
		
		Container c = getContentPane();
		c.setBackground(new Color(0,90,150));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//adding text to screen
		JLabel titleLabel = new JLabel("Demo-ing GUI");
		//   x position, y position, width, height
		titleLabel.setBounds(0,10,getWidth(),40);
		titleLabel.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		titleLabel.setForeground(Color.orange);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		c.add(titleLabel);
		
		area = new JTextArea();
		area.setBounds(360, 70, 215, 100);
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setFont(new Font("Georgia",Font.PLAIN,15));
		c.add(area);
		
	}
	
	
	

	public static void main(String[] args) {
		DemoGUI gui = new DemoGUI();

	}

}
