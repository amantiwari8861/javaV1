package com.pack;

import java.awt.Color;
import java.awt.Frame;


class MyFrame extends Frame {
    MyFrame()
    {
//    	this.setSize(400, 300);
//    	this.setBounds(300, 200, 300, 400);//x,y,width,height
//    	this.setBackground(Color.YELLOW);
    }
    MyFrame(String msg)
    {    	
    	super(msg);
    }
    
    public void launchFrame()
    {
    	this.setBounds(300, 200, 300, 400);//x,y,width,height
    	this.setBackground(Color.YELLOW);
    	this.setVisible(true);
    }
}


public class Frame1 {
    public static void main(String[] args) {
//        Frame f=new Frame("Mera Frame");
//        Frame f=new Frame();
//        f.setSize(300,200);//w*h
//        f.setVisible(true);
//		MyFrame mf=new MyFrame();
		MyFrame mf=new MyFrame("Mera Frame");
    		mf.launchFrame();
    }

}