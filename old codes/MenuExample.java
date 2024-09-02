import java.awt.*;
public class MenuExample
{
	Frame f;
	MenuBar mb;
	MenuExample()
{
	f=new Frame("MenuBar");
	mb = new MenuBar();
	Menu m1=new Menu("file");
	Menu m2=new Menu("edit");
	Menu m3=new Menu("help");
	mb.add(m1);
	mb.add(m2);
	mb.setHelpMenu(m3);
	
	f.setMenuBar(mb);
	MenuItem mi1=new MenuItem("New..");
	MenuItem mi2=new MenuItem("Save..");
	MenuItem mi3=new MenuItem("Load..");
	MenuItem mi4=new MenuItem("Quit");
	    m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.addSeparator();
		m1.add(mi4);
	 CheckboxMenuItem mi5=new CheckboxMenuItem("persistent");
	    m1.add(mi5);
}
public void display()
{
	f.setVisible(true);
}
public static void main (String []args)
{
	MenuExample m=new MenuExample();
		m.display();
}
}