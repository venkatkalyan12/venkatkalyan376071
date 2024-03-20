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
		 String Query = "insert into bankAccount_Details(User_id, Bank_Acc_Num,Bank_Name,IFSC_Code,Acc_Type,Acc_Balance,BankAccount_pin)"+
	   	"VALUES('"+b.getUserid()+"','"+b.getAcctNumber()+"','"+b.getBankName()+"','"+b.getIFSC()+"','"+b.getAcctType()+"','"+b.getBalance()+"','"+b.getAcctPin()+"')";
		 Stm.executeUpdate(Query);
		 
//		 String updateBalanceQuery = "UPDATE bankAccount_Details SET Acc_Balance = ? WHERE Bank_Acc_Num = ?";
//		    PreparedStatement updateStmt = Con.prepareStatement(updateBalanceQuery);
//		    updateStmt.setDouble(1, b.getBalance());
//		    updateStmt.setString(2, b.getAcctNumber());
//		    updateStmt.executeUpdate();
//		    updateStmt.close();
		 String updateBalanceQuery = "UPDATE bankAccount_Details SET Acc_Balance = '" + b.getBalance() +
                 "' WHERE Bank_Acc_Num = '" + b.getAcctNumber() + "'";
          Stm.executeUpdate(updateBalanceQuery);
		 Con.close(); 
		 Stm.close();
	 }
	

	 
	 public static boolean verifyLoginDetails(int userid, String password) throws ClassNotFoundException, SQLException {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentsapplication", "root", "9490");
		    PreparedStatement ps = con.prepareStatement("SELECT User_id FROM User_Details WHERE User_id = ? AND PassWord = ?");
		    ps.setInt(1, userid);
		    ps.setString(2, password);
		    ResultSet rs = ps.executeQuery();
		    boolean isValidUser = rs.next();
		    rs.close();
		    ps.close();
		    con.close();
		    return isValidUser;
		}

//	    public static boolean verifyLoginDetails(int userid, String password) throws ClassNotFoundException, SQLException {
//	    	User u= new User();
//	    	 Class.forName("com.mysql.cj.jdbc.Driver");
//	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentsapplication", "root", "9490");
//	             PreparedStatement ps = con.prepareStatement("SELECT User_id FROM User_Details WHERE User_id ='"+u.getUserId()+"' AND PassWord = '"+u.getPassword()+"'");
//	            ps.setInt(1, userid);
//	            ps.setString(2, password);
//	            ResultSet rs = ps.executeQuery();
//	            boolean isValidUser = rs.next();
//	            rs.close();
//	            ps.close();
//	            con.close();
//	            return isValidUser;
//	    }

	 
	 public void  addTransactionDetailsToDataBase(Transaction t) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentsapplication", "root", "9490");
		 	Statement Stm = con.createStatement();
		 if(t.getTransactionType()==TransactionType.DEBIT) {
		 String query = "insert into transactions( Txn_Id,Txn_Date_Time,Txn_Amount,Txn_Type,User_id,to_account_number,to_wallet) "+
		 "values('"+t.getTransactionId()+"','"+t.getTimestamp()+"','"+t.getTransactionAmount()+"','"+t.getTransactionType()+"','"+t.getUserId()+"','"+t.getDestinationAcct().getAcctNumber()+"','"+t.getDestinationWallet().getUserid()+"')";
		 Stm.executeUpdate(query);
		 System.out.println(query);
		 String queryrecip = "insert into transactions(Txn_Id,Txn_Date_Time,Txn_Amount,Txn_Type,User_id,from_account_number,from_wallet)  "+
		 "values('"+t.getTransactionId()+"','"+t.getTimestamp()+"','"+t.getTransactionAmount()+"','"+TransactionType.CREDIT+"','"+t.getUserId()+"','"+t.getSourceAcct().getAcctNumber()+"','"+t.getSourceWallet().getUserid()+"')";
		 Stm.executeUpdate(query);
		 System.out.println(query);
		 }else {
			 String query = "insert into transactions(Txn_Id,Txn_Date_Time,Txn_Amount,Txn_Type,User_id,from_account_number,from_wallet)  "+
		 "values('"+t.getTransactionId()+"','"+t.getTimestamp()+"','"+t.getTransactionAmount()+"','"+TransactionType.CREDIT+"','"+t.getUserId()+"','"+t.getSourceAcct().getAcctNumber()+"','"+t.getSourceWallet().getUserid()+"')";
			 Stm.executeUpdate(query);
			 System.out.println(query);
		 }
		 con.close();
	 }

}
	 
