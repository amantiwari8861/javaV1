import java.awt.*;
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
		f.setSize(200,200);
		f.setBackground(Color.blue);
		f.setLayout(null);
		pan.setSize(100,100);
		pan.setBackground(Color.yellow);
		f.add(pan);
		f.setVisible(true);
	}
	public static void main(String [] args)
	{
	 FramePanel fp = new FramePanel("frame with panel");
	 fp.launchFrame();
	}
  }