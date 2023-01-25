
import java.awt.*;
import java.awt.event.*;
 
public class MouseMotionDemo extends Frame implements MouseMotionListener
{
  public MouseMotionDemo()
  {                                                            
    addMouseMotionListener(this);                // link the frame with MML
    setSize(300,300);
    setVisible(true);
  }
                                  // override the 2 abstract methods of MML 
  public void mouseMoved(MouseEvent e)
  {
    setBackground(Color.red);
    System.out.println("Mouse is Moved");
  }
  public void mouseDragged(MouseEvent e)
  {
    setBackground(Color.blue);
    System.out.println("Mouse is Dragged");
  }
  public static void main(String args[])
  {
    new MouseMotionDemo();
  }
}