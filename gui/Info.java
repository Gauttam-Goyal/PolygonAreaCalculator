package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
@SuppressWarnings("serial")
public class Info extends JPanel {
	public Color mcolor = new Color(0, 191, 255);
	Icon logo = new ImageIcon(getClass().getResource("/img/logo.jpg"));
	
	public Info(JFrame jFrame, int delay) {
		DrawPanel drawPanel = new DrawPanel(jFrame);
		setSize(drawPanel.getSize());
		setBackground(drawPanel.getBackground());
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel title[] = {new JLabel(logo),new JLabel("OOM C3 Project"),new JLabel("Polygon Area Calculator")};
		JLabel members[] = {new JLabel(" "), new JLabel("IIT2020057 - Gauttam Goyal"),new JLabel("IIT2020056 - Divakar Singh"),new JLabel("IIT2020062 - Gaurav Katiyar"),new JLabel("IIT2020079 - Hrigved Goverdhan")};
		for(int i = 0; i< 3;i++) {title[i].setAlignmentX(CENTER_ALIGNMENT);
		title[i].setAlignmentY(CENTER_ALIGNMENT);
		title[i].setFont(new Font("Times new Roman", Font.BOLD, 40));
		title[i].setForeground(mcolor);
		add(title[i]);}
		for(int i = 0; i< 5;i++) {members[i].setAlignmentX(CENTER_ALIGNMENT);
		members[i].setFont(new Font("Noto Sans Japanese", Font.PLAIN, 30));
		members[i].setAlignmentY(CENTER_ALIGNMENT);
		members[i].setForeground(Color.WHITE);
		add(members[i]);}
		
		  int delayTime = delay*1000;
		  ActionListener taskPerformer = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		         jFrame.getContentPane().removeAll();
		         jFrame.setSize(drawPanel.getSize());
		         jFrame.getContentPane().add(drawPanel);
		         jFrame.revalidate();
		         jFrame.repaint();
		      }
		  };
		  Timer timer = new Timer(delayTime, taskPerformer);
		  timer.start();
		  timer.setRepeats(false);
		  
		  
	}

	public static void main(String[] args) {
//		labelarr();
		JFrame jFrame = new JFrame();
		jFrame.setTitle("Polygon Area Calculator");

		Info info = new Info(jFrame, 5);
		jFrame.setSize(info.getSize());
		jFrame.setResizable(false);
//		jFrame.setSize(100,200);
		Container cPane = jFrame.getContentPane();
		cPane.add(info);
		jFrame.setVisible(true);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
