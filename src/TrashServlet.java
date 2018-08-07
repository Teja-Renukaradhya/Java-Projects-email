import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name="TrashServlet",urlPatterns={"/ts"})

public class TrashServlet extends HttpServlet {
@Override
public void service(HttpServletRequest request,HttpServletResponse response)throws IOException {
PrintWriter out=response.getWriter();

      
      out.write("<a href=\"/gmail/Inbox.java\">Inbox</a><br>\r\n");
      out.write("<a href=\"/gmail/Sentmails.java\">sentmails</a><br>\r\n");
      out.write("<a href=\"/gmail/Trash.java\">Trash</a><br>\r\n");
      out.write("<a href=\"/gmail/Logout.java\">Logout</a><br>");

      out.println("The following is your Trash details.");
}
}




