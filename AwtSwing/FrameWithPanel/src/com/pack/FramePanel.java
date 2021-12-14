package com.pack;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FramePanel
{
	private Frame f;
	private Panel pan;
  public FramePanel(String title)
  {
	f=new Frame(title);
  pan=new Panel();
  }
	public void launchFrame()
	{
//		f.setSize(200,200);
		f.setBounds(400, 100, 300, 300);
		f.setBackground(Color.BLUE);
		f.setLayout(null);
		pan.setSize(100,100);
		pan.setBackground(Color.YELLOW);
		f.add(pan);
		f.setVisible(true);
	}
	public static void main(String [] args)
	{
	 FramePanel fp = new FramePanel("frame with panel");
	 fp.launchFrame();
	}
  }