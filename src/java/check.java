
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class check extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("fullname");  
String p=request.getParameter("userid");  
String e=request.getParameter("phonenumber");  
String c=request.getParameter("password");          
try{  
String myurl="jdbc:mysql://localhost:3306/acadview";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection(myurl,"root","");  
  
PreparedStatement ps=conn.prepareStatement(  
"insert into user values(?,?,?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
ps.setString(3,e);  
ps.setString(4,c);  
          
int i=ps.executeUpdate();  
if(i>0)  
out.print("You are successfully registered...");  
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}