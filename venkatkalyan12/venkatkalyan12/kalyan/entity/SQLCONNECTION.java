package kalyan.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLCONNECTION {
	public static void UserTODB(User u) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "9490");
			Statement Stm = Con.createStatement();
			String Uquery = "insert into User_Details(User_id,First_Name,Last_Name,Date_Of_Birth,Phone_Number,,Address,PassWord,)" + "values +"
					+ "('"+u.getUserId()+"','"+u.getFirstName()+"','"+u.getLastName()+"','"+u.getDateOfBirth()+"','"+u.getPhoneNum()+"','"+u.getCommunicationAddr()+"','"+u.getPassword()+"','"+0+"')";
			Stm.executeUpdate(Uquery);
			Stm.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	 public void addAccountToDB(BankAccount b){
		 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "9490");
	   	Statement Stm = Con.createStatement();
		 String query = "insert into bankAccount_Details(User_id, Bank_Acc_Num,Bank_Name,IFSC_Code,Acc_Type,Acc_Balance,)"+"values +"
	   	+"('"+b.getUserid()+"','"+b.getAcctNumber()+"','"+b.getBankName()+"','"+b.getIFSC()+"','"+b.getAcctType()+"','"+b.getAcctBalance()+"')";
		 Stm.executeUpdate(query);
		 Con.close();
	 }catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
}
}
	 
