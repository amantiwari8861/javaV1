// import javax.swing.*;
// /**
//  * ACJ17_swing3_checkbox_radio_combobox
//  */
// public class ACJ18_swing4_radio_combobox
// {
//     public static void main(String[] args)
//     {
//         JFrame jf3= new JFrame("java frame 3");
        
//         JRadioButton jrb1= new JRadioButton("option 1");
//         jrb1.setBounds(50,50,100,25);
//         jf3.add(jrb1);
//         jf3.setSize(300, 300);
//         jf3.setLayout(null);
//         jf3.setVisible(true);
//     }   
// }











// import javax.swing.*;
// /**
//  * ACJ17_swing3_checkbox_radio_combobox
//  */
// public class ACJ18_swing4_radio_combobox
// {
//     public static void main(String[] args)
//     {
//         JFrame jf3= new JFrame("java frame 3");
        
//         ButtonGroup bg1=new ButtonGroup();

//         JRadioButton jrb1= new JRadioButton("option 1");
//         jrb1.setBounds(50,50,100,25);
//         bg1.add(jrb1);
//         jf3.add(jrb1);

//         JRadioButton jrb2= new JRadioButton("option 2");
//         jrb2.setBounds(50,100,100,25);
//         bg1.add(jrb2);
//         jf3.add(jrb2);
        
//         jf3.setSize(300, 300);
//         jf3.setLayout(null);
//         jf3.setVisible(true);
//     }   
// }















import javax.swing.*;
import java.awt.event.*;
/**
 * ACJ17_swing3_checkbox_radio_combobox
 */
public class ACJ18_swing4_radio_combobox extends JFrame implements ActionListener
{
    JRadioButton  rb1, rb2;
    JButton jb1;

    ACJ18_swing4_radio_combobox()
    {
         
        ButtonGroup bg1=new ButtonGroup();

        rb1= new JRadioButton("option 1 Male");
        rb1.setBounds(50,50,200,25);
        bg1.add(rb1);
        add(rb1);

        rb2= new JRadioButton("option 2 Female");
        rb2.setBounds(50,100,200,25);
        bg1.add(rb2);
        add(rb2);
        
        jb1 = new JButton("find output");
        jb1.setBounds(50, 150, 200, 25);
        jb1.addActionListener(this);
        add(jb1);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(rb1.isSelected())
        {
            JOptionPane.showMessageDialog(this, "pay your bus ticket amount.");
        }
        if(rb2.isSelected())
        {
            JOptionPane.showMessageDialog(this, "no need to pay bus ticket amount.");
        }
    }
    public static void main(String[] args)
    {
        ACJ18_swing4_radio_combobox acj18_1 = new ACJ18_swing4_radio_combobox();
    }   
}