package pack6;
import java.sql.*;
import java.sql.Date;
import java.util.*;

import com.mysql.jdbc.Driver;

public class Q3 {
    public static void main(String args[])
    {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection establish");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db5","root","123456");
            System.out.println("Connection done");
            String q="insert into employee(EMP_NUM,EMP_LNAME,EMP_FNAME,EMP_INITIAL,EMP_HIREDATE ,JOB_CODE,PROJ_NUM,EMP_PCT) values(?,?,?,?,?,?,?,?)";
            PreparedStatement p=con.prepareStatement(q);
            p.setInt(1,110);
            p.setString(2,"News");
            p.setString(3,"Raj");
            p.setString(4,"T");
            p.setDate(5, Date.valueOf("1998-1-17"));
            p.setString(6,"510");
            p.setInt(7,122);
            p.setInt(8,10);
            p.executeUpdate();
            System.out.println("inserted..");
            con.close();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("class not found"+e.getMessage());
        }
        catch (SQLException e)
        {
            System.out.println("Manager"+e.getMessage());
        }

    }
}
