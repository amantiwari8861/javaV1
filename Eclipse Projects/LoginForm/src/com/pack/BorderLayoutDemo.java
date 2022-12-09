package com.pack;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

class MyApp1
{
	Frame f1;
	Panel p1,p2,p3,p4,p5;
	Button beast,bwest,bnorth,bsouth,bcenter;
	
	MyApp1(){}
	MyApp1(String title)
	{
		f1=new Frame(title);
		f1.setBounds(200, 200, 300, 300);
		beast=new Button("East");
		bwest=new Button("west");
		bnorth=new Button("north");
		bsouth=new Button("south");
		bcenter=new Button("center");
		p1=new Panel(new BorderLayout());
		p2=new Panel(new BorderLayout());
		p3=new Panel(new BorderLayout());
		p4=new Panel(new BorderLayout());
		p5=new Panel(new BorderLayout());
		p1.setSize(300, 400);
		p1.setBackground(Color.BLACK);
		f1.add(p1,BorderLayout.EAST);
		f1.add(p2,BorderLayout.WEST);
		f1.add(p3,BorderLayout.NORTH);
		f1.add(p4,BorderLayout.SOUTH);
		f1.add(p5,BorderLayout.CENTER);
		p1.add(beast);
		p2.add(bwest);
		p3.add(bnorth);
		p4.add(bsouth);
		p5.add(bcenter);
//		p1.add(new Button("west"),BorderLayout.WEST);
		f1.setVisible(true);
		f1.setLayout(null);
	}
}


public class BorderLayoutDemo {

	public static void main(String[] args) {
		
		new MyApp1("Border layout demo");
	}

}
