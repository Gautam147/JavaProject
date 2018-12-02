
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class apple2 extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("name");  
String p=request.getParameter("date");  
String e=request.getParameter("tname");  
String c=request.getParameter("subject");
String d=request.getParameter("respected");
String r=request.getParameter("signature");
record3 rs=new record3();
 out.println("Your application has been sent"); 
    try {  
        rs.insert(n,p,e,c,d,r);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(apple.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(apple.class.getName()).log(Level.SEVERE, null, ex);
    }

}
}

