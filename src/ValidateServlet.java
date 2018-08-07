import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name="ValidateServlet",urlPatterns={"/vs"})

public class ValidateServlet extends HttpServlet {
@Override
public void service(HttpServletRequest request,HttpServletResponse response)throws IOException {
PrintWriter out=response.getWriter();
String uname=request.getParameter("uname");
String pwd=request.getParameter("pwd");
response.setContentType("text/html");
response.addHeader("Cache-Control","no-cache");
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hib","abc");
PreparedStatement pstmt=con.prepareStatement("select * from users where uname=? and pwd=?");
pstmt.setString(1,uname);
pstmt.setString(2,pwd);
ResultSet rs=pstmt.executeQuery();
if(rs.next())
{
if((rs.getString("uname").equals(uname)) & (rs.getString("pwd").equals(pwd))) {

     out.write("<a href=\"/gmail/Inbox.java\">Inbox</a><br>\r\n");
      out.write("<a href=\"/gmail/Sentmails.java\">sentmails</a><br>\r\n");
      out.write("<a href=\"/gmail/Trash.java\">Trash</a><br>\r\n");
      out.write("<a href=\"/gmail/Logout.java\">Logout</a><br>");


}
}
else {
out.println("INvalid user/password.."+" ");
out.write("<a href=\"/gmail/login.html\">Login</a><br>\r\n");

}



}
catch(Exception e)
{
}

}
}