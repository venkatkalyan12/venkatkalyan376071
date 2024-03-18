package kalyan.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLCONNECTION {
	
	public static void UserTODB(User u) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentsapplication", "root", "9490");
			Statement Stm = Con.createStatement();
			String Query = "insert into User_Details(User_id,Firstt_Name,Last_Name,Date_Of_Birth,Phone_Number,Address,PassWord)" + 
			"VALUES('"+u.getUserId()+"','"+u.getFirstName()+"','"+u.getLastName()+"','"+u.getDateOfBirth()+"','"+u.getPhoneNum()+"','"+u.getCommunicationAddr()+"','"+u.getPassword()+"')";
			Stm.executeUpdate(Query);
			 Con.close(); 
			Stm.close();
		
			
	}
	
	 public void addAccountToDB(BankAccount b)throws ClassNotFoundException, SQLException{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentsapplication", "root", "9490");
	   	Statement Stm = Con.createStatement();
		 String Query = "insert into bankAccount_Details(User_id, Bank_Acc_Num,Bank_Name,IFSC_Code,Acc_Type,Acc_Balance,)"+
	   	"values('"+b.getUserid()+"','"+b.getAcctNumber()+"','"+b.getBankName()+"','"+b.getIFSC()+"','"+b.getAcctType()+"','"+b.getAcctBalance()+"')";
		 Stm.executeUpdate(Query);
		 Con.close(); 
		 Stm.close();
	 }
	

	    private static boolean verifyLoginDetails(int userId, String password) throws ClassNotFoundException, SQLException {
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentsapplication", "root", "9490");
	             PreparedStatement ps = con.prepareStatement("SELECT User_id FROM User_Details WHERE User_id ='\"+u.getUserId()+\"' AND PassWord = '\"+u.getPassword()+\"'");
	            ps.setInt(1, userId);
	            ps.setString(2, password);
	            ResultSet rs = ps.executeQuery();
	            return rs.next();
	    }

}
	 
