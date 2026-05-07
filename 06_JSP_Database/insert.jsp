<%@ page import="java.sql.*" %>
<html>
<head><title>JSP Database Insert</title></head>
<body style="font-family: Arial; padding: 30px;">
    <h2>Database Registration</h2>
    <%
        String name = "John Doe"; // Hardcoded for demo, usually from request.getParameter()
        String email = "john@example.com";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viva_db", "root", "password");
            
            PreparedStatement ps = con.prepareStatement("insert into users(name, email) values(?, ?)");
            ps.setString(1, name);
            ps.setString(2, email);
            
            int i = ps.executeUpdate();
            if(i > 0) {
                out.print("<h3 style='color:green;'>Data Inserted Successfully!</h3>");
            }
            con.close();
        } catch(Exception e) {
            out.print("<h3 style='color:red;'>Error: " + e + "</h3>");
        }
    %>
</body>
</html>
