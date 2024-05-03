import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "9490";

    public String insert(user_details user) {
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "INSERT INTO `paymentswebapplication`.`user_details`\r\n"
            		+ "(`First_name`,`Last_name`,`Date_Of_Birth`,`Mobile_no`,`Email_id`,`Password`,`Address`)VALUES(<{First_name: }>,<{Last_name: }>,<{Date_Of_Birth: }>,<{Mobile_no: }>,<{Email_id: }>,<{Password: }>,<{Address: }>);\r\n"
            		+ "";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setString(1, user.getFirstname());
                ps.setString(2, user.getLastname());
                ps.setString(3, user.getDateOfBirth());
                ps.setString(4, user.getMobileNo());
                ps.setString(5, user.getEmail());
                ps.setString(6, user.getPassword());
                ps.setString(7, user.getAddress());
                ps.executeUpdate();
                return "User registered successfully!";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Registration failed!";
        }
    }

    public boolean validateLogin(String email, String password) {
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "SELECT Email_id, Password FROM user_details WHERE Email_id = ? AND Password = ?";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setString(5, email);
                ps.setString(6, password);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        return true;
                    } else {
                        System.out.println("Invalid email or password.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
