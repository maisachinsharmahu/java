import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class AppController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        
        try {
            // 1. Database Connectivity (Simulation)
            // Connection con = DriverManager.getConnection(...);
            
            // 2. Business Logic / Model usage
            User user = new User(name, "Regular User");
            
            // 3. Storing in session
            HttpSession session = request.getSession();
            session.setAttribute("userObj", user);
            
            // 4. Redirecting to JSP (View)
            response.sendRedirect("dashboard.jsp");
            
        } catch (Exception e) {
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
