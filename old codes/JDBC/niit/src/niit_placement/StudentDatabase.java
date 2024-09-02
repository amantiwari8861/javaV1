
package niit_placement;
import java.sql.*;

 class StudentDatabase {
    
    public int insertData(String name,String fname,String gmail,String stream,String qualification,String address,String entrytime,String exittime,int age)
    {
        String msg;
        int flag = 0;
        String sql="INSERT INTO Aman.STUDENT(Name,Fathers_name,Mail_id,Stream,Qualification,Entry_Time,Exit_Time,Address,Age) VALUES(?,?,?,?,?,?,?,?,?);";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1")) {
                PreparedStatement p;
                p=conn.prepareStatement(sql);
                
                
                
                
                p.setString(1, name);
                p.setString(2,fname );
                p.setString(3,gmail);
                p.setString(4,stream );
                p.setString(5,qualification);
                p.setString(6,entrytime );
                p.setString(7,exittime );
                p.setString(8,address );
                p.setInt(9,age );
                
                int n=p.executeUpdate();
                
                if(n!=0)
                {
                    msg="Record Inserted";
                    
                }
                else
                {
                    msg="Records not inserted";
                }
            }
            
            System.out.println(msg);
            flag++;
            
        }   
        catch(ClassNotFoundException | SQLException e)
        {e.printStackTrace();}
        
       return flag;
    }
    
}
