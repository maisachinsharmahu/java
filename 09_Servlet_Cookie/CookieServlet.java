import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Creating a new cookie
        Cookie ck = new Cookie("user_token", "java_viva_2026");
        ck.setMaxAge(60*60); // 1 hour expiry
        response.addCookie(ck);
        
        out.print("<h3>Cookie has been set!</h3>");
        out.print("<p>Check your browser settings to see 'user_token'.</p>");
        out.print("<a href='ShowCookie'>View All Cookies</a>");
    }
}
