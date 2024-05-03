import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        RegisterDAO dao = new RegisterDAO();
        if (dao.validateLogin(email, password)) {
            response.sendRedirect("Welcome.jsp"); // Redirect to welcome page after successful login
        } else {
            // Handle login failure
            response.getWriter().println("Invalid email or password.");
        }
    }
}
