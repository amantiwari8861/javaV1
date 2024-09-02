/ import javax.swing.*;
// /**
//  * ACJ20_swing6_list
//  */
// public class ACJ20_swing6_list {
//     ACJ20_swing6_list()
//     {
//         JFrame jf1 = new JFrame();
//         DefaultListModel<String> dlm1=new DefaultListModel<String>();
//         dlm1.addElement("element1");
//         dlm1.addElement("element2");
//         dlm1.addElement("element3");
//         dlm1.addElement("element4");
//         dlm1.addElement("element5");
//         JList<String> jl1=new JList<String>(dlm1);
//         jl1.setBounds(100, 100, 300, 100);
//         jf1.add(jl1);

//         jf1.setLayout(null);
//         jf1.setSize(500,500);
//         jf1.setVisible(true);
//     }
//     public static void main(String[] args) {
//         new ACJ20_swing6_list();
//     }
// }













import javax.swing.*;
import java.awt.event.*;
/**
 * ACJ20_swing6_list
 */
public class ACJ20_swing6_list
{
    ACJ20_swing6_list()
    {
        JFrame jf1 = new JFrame();
        
        final JLabel jl1=new JLabel();
        jl1.setSize(400, 50);
        jf1.add(jl1);

        JButton jb1 = new JButton("print output");
        jb1.setBounds(350, 100, 75, 30);
        jf1.add(jb1);

        final DefaultListModel<String> dlm1=new DefaultListModel<String>();
        dlm1.addElement("element1");
        dlm1.addElement("element2");
        dlm1.addElement("element3");
        dlm1.addElement("element4");
        dlm1.addElement("element5");
        
        final JList<String> jlist1=new JList<String>(dlm1);
        jlist1.setBounds(50, 100, 200, 100);
        jf1.add(jlist1);

        DefaultListModel<String> dlm2=new DefaultListModel<String>();
        dlm2.addElement("emt1");
        dlm2.addElement("emt2");
        dlm2.addElement("emt3");
        dlm2.addElement("emt4");
        dlm2.addElement("emt5");
        
        final JList<String> jlist2=new JList<String>(dlm2);
        jlist2.setBounds(50, 300, 300, 100);
        jf1.add(jlist2);

        
        jf1.setLayout(null);
        jf1.setSize(500,500);
        jf1.setVisible(true);
        jb1.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String s1="";
                    
                    if(jlist1.getSelectedIndex()!=-1)
                    {
                        s1="the value is "+jlist1.getSelectedValue();
                        jl1.setText(s1);
                    }

                    if(jlist2.getSelectedIndex()!=-1)
                    {
                        s1="the value of list2 is  "+jlist2.getSelectedValue();
                        for(Object f1:jlist2.getSelectedValuesList())
                        {
                        s1+=f1+" ";
                        }
                        jl1.setText(s1);
                    }
                }
            }
        );
    }
    public static void main(String[] args)
    {
        new ACJ20_swing6_list();
    }
}