import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name="LogoutServlet.java",urlPatterns={"/ls"})

public class LogoutServlet extends HttpServlet {
@Override
public void service(HttpServletRequest request,HttpServletResponse response)throws IOException {
PrintWriter out=response.getWriter();

       out.println("Your are Logged out.");
out.write("<a href=\"/gmail/login.html\">Login</a><br>\r\n");

}
}




