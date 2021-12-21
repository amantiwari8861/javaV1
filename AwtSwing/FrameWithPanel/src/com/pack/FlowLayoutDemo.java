package com.pack;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class GuiApp1
{
	Frame f1;
	Panel p1,p2,p3;
	Button b1,b2,b3;
	TextField tf1,tf2,tf3;
	Label l1,l2,l3;
	GuiApp1(String msg)
	{
		f1=new Frame(msg);
		f1.setLocation(200, 200);
		f1.setSize(300, 300);
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		l1=new Label("Enter Name :");
		b1=new Button("Button 1");
		b2=new Button("Button 2");
		b3=new Button("Button 3");
		tf1=new TextField(10);
//		p1.setBounds(10,20,100, 100);
//		p2.setBounds(30,40,100, 100);
//		p3.setBounds(50,60,100, 100);
//		p1.setBounds(10,20,500, 500);
//		p2.setBounds(30,40,100, 300);
//		p3.setBounds(50,60,100, 400);
//		p1.setSize(200,300);
		p1.setBackground(Color.GREEN);
		p2.setBackground(Color.yellow);
		p3.setBackground(Color.PINK);
		f1.add(p1);
		f1.add(p2);
		f1.add(p3);
		p1.add(l1);
		p1.add(tf1);
		p1.add(b1);
		p2.add(b2);
		p3.add(b3);
		FlowLayout fl1=new FlowLayout(FlowLayout.CENTER,50,100);
		f1.setLayout(fl1);
		f1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
//		pass.setEchoChar('#');
	}
	void launchFrame()
	{
		f1.setVisible(true);
	}
	
}
public class FlowLayoutDemo {

	public static void main(String[] args) {
		GuiApp1 app=new GuiApp1("My Gui App");
		app.launchFrame();
	}

}
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
