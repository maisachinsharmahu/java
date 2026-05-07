# Full Stack Java Web Application

This project integrates Servlets, JSP, and Database connectivity into a single small application.

### Architecture (MVC):
- **Model**: `User.java` (stores data).
- **View**: `dashboard.jsp` (displays data to user).
- **Controller**: `AppController.java` (handles logic and routing).

### Flow:
1. User submits a name via a form.
2. Controller receives the name, connects to DB (simulated), creates a `User` object, and saves it in the `HttpSession`.
3. Controller redirects to `dashboard.jsp`.
4. JSP retrieves the object from the session and renders the welcome message.

### Prerequisites:
- Java EE / Jakarta EE environment (Tomcat/GlassFish).
- MySQL JDBC Driver.
