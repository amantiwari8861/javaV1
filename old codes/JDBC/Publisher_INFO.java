import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class NewClass implements ActionListener
{
/*Declare the variables to create the application interface for the Publishers Information application*/
Label heading, lauid, lau_name, lphone, laddress, lcity, lstate,lzip,error;
TextField au_idField, au_nameField, phoneField, addressField,cityField,stateField,zipField;
Button insert, update,  clear, exit;

 Connection con;
 PreparedStatement stat;
 Statement stmt;
 ResultSet rs;
 Font f;
 Panel p1;
 Frame f1;
 /*Define the constructor for the Authors Information application*/
public NewClass()
{
  	
        
}
public void compshow()
{
    f1=new Frame("The Park Library");
    p1=new Panel();
    heading=new Label("AUTHORS INFORMATION");
    lauid=new Label("Author ID:");
    lau_name=new Label("Author Name:");
    lphone=new Label("Phone Number:");
    laddress=new Label("Address:");
    lcity=new Label("City:");
    lstate=new Label("State:");
    lzip=new Label("Zip:");
    
    au_idField=new TextField(6);
    au_nameField=new TextField(50);
    phoneField=new TextField(15);
    addressField=new TextField(50);
    cityField=new TextField(50);
    stateField=new TextField(50);
    zipField=new TextField(20);
    
    
    insert=new Button("Insert");
    update=new Button("Update");
   
    clear= new Button("Clear");
    exit=new Button("Exit");
 
       
    p1.setLayout(null);
    heading.setBounds(250,35,200,40);
    p1.add(heading);
    
    lauid.setBounds(75,90,200,30);
    au_idField.setBounds(400,90,100,25);
  
    p1.add(lauid);
    p1.add(au_idField);

    
    lau_name.setBounds(75,120,200,30);
    au_nameField.setBounds(400,120,200,25);
    p1.add(lau_name);
    p1.add(au_nameField);
    
    lphone.setBounds(75,150,200,30);
    phoneField.setBounds(400,150,150,25);
    p1.add(lphone);
    p1.add(phoneField);
    
    laddress.setBounds(75,180,200,30);
    addressField.setBounds(400,180,250,25);
    p1.add(laddress);
    p1.add(addressField);
    
    lcity.setBounds(75,210,200,30);
    cityField.setBounds(400,210,200,25);
    p1.add(lcity);
    p1.add(cityField);
    
    lstate.setBounds(75,240,200,30);
    stateField.setBounds(400,240,200,25);
    p1.add(lstate);
    p1.add(stateField);
    
    lzip.setBounds(75,270,200,30);
    zipField.setBounds(400,270,200,25);
    p1.add(lzip);
    p1.add(zipField);
    
    insert.setBounds(25,350,100,30);
    update.setBounds(150,350,100,30);
   
    clear.setBounds(400,350,100,30);
    exit.setBounds(525,350,100,30);
    
    p1.add(insert);
    p1.add(update);
 
    p1.add(clear);
    p1.add(exit);
    p1.add(exit);
   
    
    f1.add(p1);
    f1.setSize(680,500);
    f1.setVisible(true);
    
    insert.addActionListener(this);
    update.addActionListener(this);

    clear.addActionListener(this);
    exit.addActionListener(this);
  
    }

  public void actionPerformed(ActionEvent ae)
 {
    if(ae.getActionCommand() == "Exit")
    /*Terminate the execution of the application*/
    System.exit(0);
  
    if(ae.getActionCommand() == "Insert")
    {
    //Insert a row in the Authors table
    try
    {
     Connection con = DriverManager.getConnection("oracle.jdbc.driver.OracleDriver");
   	/*Create a Statement object*/
   	stmt = con.createStatement("jdbc:oracle:thin:@localhost:1521:xe","demo","33");
        con.setAutoCommit(false);
        stat = con.prepareStatement("INSERT INTO employee VALUES(?, ?, ?, ?, ?,?,?)");
        String aid = au_idField.getText();
   	String aname = au_nameField.getText();
   	String aphone = phoneField.getText();
   	String aadd = addressField.getText(); 
   	String acity = cityField.getText();
        String astate = stateField.getText();
        String azip = zipField.getText();
        
   	stat.setString(1, aid);
   	stat.setString(2, aname);
   	stat.setString(3, aphone);
   	stat.setString(4, aadd);
   	stat.setString(5, acity);
        stat.setString(6, astate);
        stat.setString(7, azip);
        
	/*Execute the INSERT statement*/
   	stat.executeUpdate();
        /*Commit a transaction*/
	con.commit();
        con.close();
     }
  catch(Exception e)
    {
    System.out.println("Error1 "+e);
    error.setText("Row cannot be inserted");
    } 	                     
   }
    /**updating the record***/
    if(ae.getActionCommand()=="Update")
    {
    try
 	{
 Class.forName("oracle.jdbc.driver.OracleDriver");
    /*Establish a connection with the database*/
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","demo","33");
stat = con.prepareStatement("UPDATE publishers SET pname = ?,pphone= ?,padd=? , pcity = ?, pstate = ? ,pzip=? where pid = ?");
        String aid = au_idField.getText();
        String aname = au_nameField.getText();
  	String aphone = phoneField.getText();
  	String aadd = addressField.getText(); 
  	String acity = cityField.getText(); 
  	String astate = stateField.getText();
        String azip = zipField.getText();

        stat.setString(1, aname);
        stat.setString(2, aphone);
        stat.setString(3, aadd);
        stat.setString(4, acity);
        stat.setString(5, astate);
        stat.setString(6, azip);
        stat.setString(7, aid);
       
        /* Execute the UPDATE statement*/
	int result=stat.executeUpdate();	
	con.close();
       }
  	catch(Exception e)
            {
                System.out.println("Error " + e.getMessage());
   	    }
 	}  /**end update***/
    
   
    
     /*Clear the contents of all the fields*/
     if(ae.getActionCommand() == "Clear")
    {
      try
        {
            au_idField.setText("");
            au_nameField.setText("");
            phoneField.setText("");
            addressField.setText("");
            cityField.setText("");
            stateField.setText("");
            zipField.setText("");
        }
      catch(Exception e)
        {
            System.out.println("Error1 "+e);
            error.setText("Cannot clear content");
        }
     } /**end clear***/
    
/*Display the row corresponding the id selected in the idlist listbox*/ 
    
  
  }/*action performed closed */
 
  public static void main(String args[])
 {
NewClass p=new NewClass ();
  p.compshow();
  }	
}


