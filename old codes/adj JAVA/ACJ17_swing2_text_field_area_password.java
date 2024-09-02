

// import javax.swing.*;
// /**
//  * ACJ17_swing2_text_field_area_password
//  */
// public class ACJ17_swing2_text_field_area_password
// {
//     public static void main(String[] args)
//     {
//         JFrame jf1=new JFrame("TestField");
//         JTextArea ta1=new JTextArea("java test area");
//         jf1.add(ta1);
//         ta1.setBounds(30,30,150,150);
//         jf1.setSize(400,400);
//         jf1.setLayout(null);
//         jf1.setVisible(true);
//     }
// }


import javax.swing.*;
/**
 * ACJ17_swing2_text_field_area_password
 */
public class ACJ17_swing2_text_field_area_password
{
    public static void main(String[] args)
    {
        JFrame jf1=new JFrame("TestField");

        JPasswordField jpf1=new JPasswordField();
        jpf1.setBounds(20,100,150,150);//x,y,w,h

        jf1.add(jpf1);
        jf1.setSize(400,400);
        jf1.setLayout(null);
        jf1.setVisible(true);
    }
}