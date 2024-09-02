

// what is swing in java?
// in java swing is java foundation classes(JFC) that is used to create window-based appliction and form.
// swing is built in API & entirely written in java.


// java swing classes :-
// 1. JButton
// 2. JTextField
// 3. JtextArea
// 4. JRadioButton
// 5. JCheckBox
// 6. JColorBox and many more....







 import javax.swing.*;
//  * ACJ16_swing1_Burtton_label_
// 
public class ACJ16_swing1_Burtton_label
 {
     public static void main(String[] args)
     {
         JFrame jf1=new JFrame();
         jf1.setSize(500,500);//widthXheight
         JButton jb1=new JButton("click on me");
         jb1.setBounds(200,200,100,50);
         jf1.add(jb1);
         jf1.setLayout(null);
         jf1.setVisible(true);//for show your frame
     }    
 }


// import javax.swing.*;
// /**
//  * ACJ16_swing1_Burtton_label_
//  */
// public class ACJ16_swing1_Burtton_label extends JFrame
// {
//     JFrame jf1;
//     ACJ16_swing1_Burtton_label()
//     {
//         setSize(500,500);//widthXheight
//         JButton jb1=new JButton("click on me");
//         jb1.setBounds(200,200,100,50);
//         add(jb1);
//         setLayout(null);
//         setVisible(true);//for show your frame
//     }
//     public static void main(String[] args)
//     {
//         new ACJ16_swing1_Burtton_label();
//     }    
// }














// import javax.swing.*;
// /**
//  * ACJ16_swing1_Burtton_label
//  */
// public class ACJ16_swing1_Burtton_label
// {
//     public static void main(String[] args)
//     {
//         JFrame jf1 =new JFrame();
//         JLabel l1 = new JLabel("lable 1");
//         l1.setBounds(50,50,90,40);//x,y,width,height
//         jf1.add(l1);
//         jf1.setSize(500,500);
//         jf1.setLayout(null);
//         jf1.setVisible(true);        
//     }
// }













// import javax.swing.*;
// /**
//  * ACJ16_swing1_Burtton_label
//  */
// public class ACJ16_swing1_Burtton_label
// {
//     public static void main(String[] args)
//     {
//         JFrame jf1 =new JFrame();
//         JLabel l1 = new JLabel("lable 1");
//         l1.setBounds(50,50,90,40);//x,y,width,height
//         jf1.add(l1);
//         JButton jb1= new JButton("okay button");
//         jb1.setBounds(50,150,90,40);
//         jf1.add(jb1);
//         jf1.setSize(500,500);
//         jf1.setLayout(null);
//         jf1.setVisible(true);        
//     }
// }















// import javax.swing.*;
/**
 * ACJ16_swing1_Burtton_label
 */
// public class ACJ16_swing1_Burtton_label
// {
//     public static void main(String[] args)
//     {
//         JFrame jf1 =new JFrame();

//         JLabel l1 = new JLabel("lable 1");
//         l1.setBounds(50,50,90,40);//x,y,width,height
//         jf1.add(l1);

//         JLabel l2 = new JLabel("lable 2");
//         l2.setBounds(50,101,90,40);//x,y,width,height
//         jf1.add(l2);
        
//         JButton jb1= new JButton("okay button 1");
//         jb1.setBounds(150,50,120,40);
//         jf1.add(jb1);

//         JButton jb2= new JButton("okay button 2");
//         jb2.setBounds(150,101,120,40);//x,y,w,h
//         jf1.add(jb2);

//         jf1.setSize(500,500);
//         jf1.setLayout(null);
//         jf1.setVisible(true);    
            
//     }
// }



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


// import javax.swing.*;
// /**
 // * ACJ17_swing2_text_field_area_password
 // */
// public class ACJ17_swing2_text_field_area_password
// {
    // public static void main(String[] args)
    // {
        // JFrame jf1=new JFrame("TestField");

        // JPasswordField jpf1=new JPasswordField();
        // jpf1.setBounds(20,100,150,150);//x,y,w,h

        // jf1.add(jpf1);
        // jf1.setSize(400,400);
        // jf1.setLayout(null);
        // jf1.setVisible(true);
    // }
// }