<%@ page import="User" %>
<html>
<body style="font-family: 'Segoe UI'; padding: 50px; background: #eef2f3;">
    <div style="background:white; padding:30px; border-radius:15px; box-shadow: 0 5px 15px rgba(0,0,0,0.1);">
        <h2>User Dashboard</h2>
        <%
            User user = (User) session.getAttribute("userObj");
            if(user != null) {
        %>
            <p>Welcome back, <strong><%= user.getUsername() %></strong>!</p>
            <p>Your System Role: <span style="color:blue;"><%= user.getRole() %></span></p>
        <%
            } else {
                out.print("<p>No user session found. <a href='index.html'>Login</a></p>");
            }
        %>
    </div>
</body>
</html>
