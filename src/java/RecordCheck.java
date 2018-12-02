import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RecordCheck {
    
    public void insert(String fname,String uname,int phonenumber,String pass) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acadview","root","");  
        PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?)");
        ps.setString(1, fname);
        ps.setString(2, uname);
        ps.setInt(3, phonenumber);
        ps.setString(4,pass);
        int rs=ps.executeUpdate();
    }   
}