import java.awt.*;
public class FrameExample
{
	private Frame f;
	public FrameExample()
	{
		f=new Frame("HELLO");
	}
		public void LaunchFrame()
		{
			f.setSize(170,170);
			f.setBackground(Color.blue);
			f.setBounds(200,200,300,400);
			f.setVisible(true);
		}
			public static void main(String args[])
			{
				FrameExample guiWindow=new FrameExample();
				guiWindow.LaunchFrame();
			}
}