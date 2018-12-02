import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class recordcheck2 {
 
 public void insert(String n,String p,String e,String c,String d,String r) throws ClassNotFoundException, SQLException, IOException
 {
     Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acadview","root","");  
        PreparedStatement ps = con.prepareStatement("insert into app values(?,?,?,?,?,?)");
        ps.setString(1, n);
        ps.setString(2, p);
        ps.setString(3, e);
        ps.setString(4, c);
        ps.setString(5, d);
        ps.setString(6, r);
        int rs=ps.executeUpdate();
 }
}