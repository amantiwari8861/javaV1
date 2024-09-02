// import javax.swing.*;
// /**
//  * ACJ19_swing5_combobox
//  */
// public class ACJ19_swing5_combobox
// {
//     public static void main(String[] args)
//     {
//         JFrame jf1= new JFrame();
//         String list1[]={"apple","banana","cherry","date"};
//         JComboBox cb1=new JComboBox<String>(list1);
//         cb1.setBounds(50, 50, 100, 25);
//         jf1.add(cb1);
//         jf1.setLayout(null);
//         jf1.setSize(500, 500);
//         jf1.setVisible(true);
//     }
    
// }















import javax.swing.*;
import java.awt.event.*;
/**
 * ACJ19_swing5_combobox
 */
public class ACJ19_swing5_combobox
{
    JFrame jf1;
    ACJ19_swing5_combobox()
    {
        jf1= new JFrame();
        
        final JLabel jl1 =new JLabel();
        jl1.setHorizontalAlignment(JLabel.CENTER);
        jl1.setSize(400, 25);
        jf1.add(jl1);
        
        String list1[]={"apple","banana","cherry","date"};
        
        final JComboBox jcb1=new JComboBox<String>(list1);
        jcb1.setBounds(50, 50, 100, 25);
        jf1.add(jcb1);

        JButton jb1=new JButton("show item amount");
        jb1.setBounds(200,50,100,25);
        jf1.add(jb1);

        jf1.setLayout(null);
        jf1.setSize(500, 500);
        jf1.setVisible(true);

        jb1.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    String s1="the amount is 100rs "+jcb1.getItemAt(jcb1.getSelectedIndex());
                    jl1.setText(s1);
                }
            }
        
        );
    }
    public static void main(String[] args)
    {
        ACJ19_swing5_combobox acj19_1 =new ACJ19_swing5_combobox();
    }
    
}