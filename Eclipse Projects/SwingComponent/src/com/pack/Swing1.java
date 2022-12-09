package com.pack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

class mygui
{
	JFrame jf,jf2;
	JPanel jp;
	JButton b1;
	JTextField ta,jt;
//	JPasswordField jpass;
	mygui(String title)
	{
		jf=new JFrame(title);
		jf2=new JFrame("new frame");
		jp=new JPanel();
		b1=new JButton("Click me ");
		jf.setBounds(100, 100, 400, 400);
		jp.setBounds(50, 50, 200, 200);
		jp.setBackground(Color.BLUE);
		jf.add(jp);
		ta=new JTextField(10);
//		jpass=new JPasswordField(10);
		jt=new JTextField(50);
		jp.add(ta);
		jp.add(b1);
		jp.add(jt);
//		jp.add(jpass);
		jf.setLayout(null);
		jf.setVisible(true);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("clicked : "+ta.getText());
				Random rand=new Random();
				int r=rand.nextInt(255),g=rand.nextInt(255),b=rand.nextInt(255);
				int i=1;
				for(;;)
				{
					JFrame jf=new JFrame(String.valueOf(++i));
					JPanel jp1=new JPanel();
					jp1.setSize(200,200);
					jf.add(jp1);
					jf.setBounds(150+i, 150+i, 500, 500);
					System.out.println(r+" "+g+" "+b);
					jp1.setBackground(Color.cyan);
					jf.setVisible(true);
				}				
			}
		});
//		b1.addActionListener((a)->{
//			jt.setText(ta.getText());
//		});
	}
	
}

//class myHandler implements ActionListener
//{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		jt.setText(ta.getText());
//
//	}
//	
//}
class Swing1
{
	public static void main(String[] args) {
		new mygui("Swing Demo");
	}
}