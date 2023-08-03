package gui;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TimePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel timeLabel;
	public int count=0;
	
	public TimePanel(){
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		timeLabel=new JLabel("Time comes here...");
		
		add(timeLabel);
	}
	
	public void refreshCounter(){
		count=0;
		refresh();
	}
	
	public void refresh(){
		timeLabel.setText("Generations: "+count++);
	}
}
