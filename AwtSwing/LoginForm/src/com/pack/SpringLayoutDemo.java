package com.pack;

//Importing the different Packages.  
import javax.swing.*;  
import java.awt.*;  
//the MySpringDemo1 class  
public class SpringLayoutDemo   
{  
//main method  
public static void main(String argvs[])  
{  
//the main window  
//Method for setting the default look and feel  
//decorated status of the JFrame.  
JFrame.setDefaultLookAndFeelDecorated(true);  
//Creating an object of the "JFrame" class  
JFrame f = new JFrame("Spring Layout Example");  
//Function to set the default  
//close operation status of JFrame  
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
//method to determine the  
//size status of the JFrame  
f.setSize(310, 210);  
//to get the content pane  
Container cntt = f.getContentPane();  
//Creating Object of "SpringLayout" class  
SpringLayout sprLayout = new SpringLayout();  
//for setting the layout class  
f.setLayout(sprLayout);  
//Initializing the object  
//"btn1" of the JButton class.  
Component btn1 = new JButton("C++");  
//Initializing the object  
//"btn2" of the JButton class.  
Component btn2 = new JButton("Python");  
//Initializing the object  
//"btn3" the JButton class.  
Component btn3 = new JButton("JAVA");  
//Initializing the object  
//"btn4" of the JButton class.  
Component btn4 = new JButton("NETWORKING");  
//Adding the JButton "btn1" on the frame f  
f.add(btn1);  
//Adding the JButton "btn2" on the frame f  
f.add(btn2);  
//Adding the JButton "btn3" on the frame f  
f.add(btn3);  
//Adding the JButton "btn4" on the frame f  
f.add(btn4);  
//It is used for inserting the   
//layout constraint in the JFrame by using  
//the springLayout class on the btn1 JButton  
sprLayout.putConstraint(SpringLayout.WEST, btn1,  
24, SpringLayout.WEST, cntt);  
   
sprLayout.putConstraint(SpringLayout.NORTH, btn1,  
 9, SpringLayout.NORTH, cntt);  
//It is used for inserting the   
//layout constraint in the JFrame using  
//the springLayout class on the btn2 JButton  
sprLayout.putConstraint(SpringLayout.WEST, btn2,  
49, SpringLayout.WEST, cntt);  
sprLayout.putConstraint(SpringLayout.NORTH, btn2,  
     10, SpringLayout.SOUTH, btn1);  
//It is used for inserting the   
//layout constraint in the JFrame using  
//springLayout class on the btn3 JButton  
sprLayout.putConstraint(SpringLayout.WEST, btn3,  
74, SpringLayout.WEST, cntt);  
   
sprLayout.putConstraint(SpringLayout.NORTH, btn3,  
     9, SpringLayout.SOUTH, btn2);  
//It is used for inserting the  
//layout constraint in the JFrame using  
//sprLayout class on the btn4 JButton  
sprLayout.putConstraint(SpringLayout.WEST, btn4,  
     14, SpringLayout.EAST, btn1);  
sprLayout.putConstraint(SpringLayout.NORTH, btn4,  
 9, SpringLayout.NORTH, cntt);  
//method for setting the  
//visibility status of the JFrame  
f.setVisible(true);  
}  
}  
