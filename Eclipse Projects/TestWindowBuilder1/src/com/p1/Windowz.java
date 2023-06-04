package com.p1;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Windowz {

	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windowz window = new Windowz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Windowz() {
		initialize();
	}
	private void initialize() 
	{
		frame = new JFrame();
	}

}
