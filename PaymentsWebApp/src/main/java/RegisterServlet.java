import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String dateOfBirth = request.getParameter("dateOfBirth"); // Corrected parameter name
        String mobileNo = request.getParameter("mobileNo");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        user_details user = new user_details();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setDateOfBirth(dateOfBirth);
        user.setMobileNo(mobileNo);
        user.setAddress(address);
        user.setEmail(email);
        user.setPassword(password);

        RegisterDAO dao = new RegisterDAO();
        String result = dao.insert(user);

        if (result.equals("User registered successfully!")) {
            // Add code here to handle successful registration, such as sending a confirmation message or redirecting to a different page
            response.sendRedirect("Login.html"); // Redirect to login page after successful registration
        } else {
            // Handle registration failure
            response.getWriter().println("Registration failed!");
        }
    }
}