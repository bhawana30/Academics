package pack7;
import java.sql.*;
import java.util.*;
import java.util.HashSet;
public class Q2 {
    public static void main(String []args)
    {
        Connection con;
        PreparedStatement p;
        ResultSet res;
       HashSet<String> h1=new HashSet<String>();


    try
    {
     Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loded");
      con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db5","root","123456");
    System.out.println("Connection establish");
   String Myquary="select * from employee";
       p=con.prepareStatement(Myquary);
        res=p.executeQuery();
       while(res.next())
       {
        h1.add(res.getString("Department"));
       }
Iterator it=h1.iterator();
       while(it.hasNext())
       {
           Myquary="select avg(salary) from employee where Department='";
           Myquary=Myquary+it.next();
           Myquary=Myquary+"'";
           p=con.prepareStatement(Myquary);
           res=p.executeQuery();
           while(res.next())
           {
               System.out.println(res.getFloat("avg(salary)"));
           }
       }


  con.close();
  p.close();
  res.close();


    }
    catch (ClassNotFoundException e)
    {
     System.out.println("Driver not loded"+e.getMessage());
    }
    catch(SQLException E)
    {
        System.out.println("sql exception"+E.getMessage());
    }

    }
}
