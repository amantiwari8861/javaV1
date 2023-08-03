package com.minerapp.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton startButton;
	private JButton stopButton;
	private ButtonListener listener;
	
	public Toolbar(){
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		initVariables();
		
		add(startButton);
		add(stopButton);
	}

	private void initVariables() {
		this.startButton = new JButton("Start");
		this.stopButton = new JButton("Stop");
		this.startButton.addActionListener(this);
		this.stopButton.addActionListener(this);
	}

	public void setButtonListener(ButtonListener listener){
		this.listener = listener;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if( (JButton) event.getSource() == startButton && this.listener != null ){
			this.listener.startClicked();
		}else{
			this.listener.stopClicked();
		}
	}
}
