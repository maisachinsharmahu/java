<html>
<body>
    <%
        String name = request.getParameter("uname");
        String ageStr = request.getParameter("uage");
        
        boolean isValid = true;
        String errorMsg = "";

        if(name == null || name.trim().isEmpty()) {
            isValid = false;
            errorMsg += "Name cannot be empty! ";
        }

        try {
            int age = Integer.parseInt(ageStr);
            if(age < 18) {
                isValid = false;
                errorMsg += "You must be 18+ to register. ";
            }
        } catch(Exception e) {
            isValid = false;
            errorMsg += "Age must be a valid number! ";
        }

        if(isValid) {
            out.print("<h3 style='color:green;'>Validation Successful! Welcome " + name + "</h3>");
        } else {
            out.print("<h3 style='color:red;'>Validation Failed: " + errorMsg + "</h3>");
            out.print("<a href='registration.jsp'>Go Back</a>");
        }
    %>
</body>
</html>
