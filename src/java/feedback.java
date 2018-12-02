
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


public class feedback extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("name");  
String p=request.getParameter("email");  
String e=request.getParameter("subject");  
String c=request.getParameter("message");   
recordjava1 rs=new recordjava1();
 
    try {  
        rs.insert(n,p,e,c);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(feedback.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(feedback.class.getName()).log(Level.SEVERE, null, ex);
    }

}
}

