package Employeee;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
//             c = DriverManager.getConnection("jdbc:mysql://localhost:1521/employee_management","chandan","chandan");
             c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","230700");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
