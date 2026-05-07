import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        // Simulating user validation
        if(user.equals("admin") && pass.equals("12345")) {
            out.print("<h3>Login Successful!</h3>");
            out.print("<p>Welcome, Admin.</p>");
        } else {
            out.print("<h3 style='color:red;'>Invalid Credentials</h3>");
            out.print("<a href='index.html'>Try Again</a>");
        }
    }
}
