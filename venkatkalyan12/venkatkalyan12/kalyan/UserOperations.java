package kalyan;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import kalyan.entity.AcctType;
import kalyan.entity.BankAccount;
import kalyan.entity.Transaction;
import kalyan.entity.TransactionType;
import kalyan.entity.User;
import kalyan.entity.wallet;
import java.util.Vector;


import java.util.*;
public class UserOperations {
	 List<User>list = RunPaymentsAPP.usersList;
	 Map<Integer,wallet> walletList = RunPaymentsAPP.walletList;
	 List<BankAccount> baList = RunPaymentsAPP.bankAcctList;
public User doUserRegistration(String fName, String lName, String password, long phNum,String gmail, String dob,String addr) {

	User u = new User();
	u.setFirstName(fName);
	u.setLastName(lName);
	u.setPhoneNum(phNum);
	u.setGmail(gmail);
	u.setDateOfBirth(dob);
	u.setCommunicationAddr(addr);
	u.setPassword(password);
	
	u.setUserId();
	return u;
//	  if (isValidGmail(gmail)) {
//          System.out.println("Valid Gmail address!");
//      } else {
//          System.out.println("Invalid Gmail address")
//      }
//  
//  public static boolean isValidGmail(String email) {
//      return email.contains("@") && email.endsWith("gmail.com");
  }

	
//	FileOps fileOps = new FileOps();
//	fileOps.userToFile(u);
//	return u;


public void printUserList( ){
 for(User u : list) {
	 System.out.println(u);
 }
}

public void currentUser() {
	 for(User u : list) {
		 if(RunPaymentsAPP.currUserId == u.getUserId()) {
			 System.out.println(u.getFirstName()+" "+u.getLastName());
		 }
		 
		 if(RunPaymentsAPP.currUserId==-1) {
				System.out.println("No user logged in");
			}
		 
		 else {
			 System.out.println("please enter valid credentials");
		 }
	 }
	
}

public void userLogIn(int userId, String password) {
	for(User u : list) {
		if(u.getUserId()==userId&&u.getPassword( ).equals(password))
			System.out.println("welcome Mr."+u.getFirstName()+" "+u.getLastName());
		   RunPaymentsAPP.currUserId = userId;
		}
	}



public  Map<User, List<BankAccount>> getBankAccountList(){
	  
Map<User,List<BankAccount>> userBankAcctMap = new HashMap<User,List<BankAccount>>();
	
	for(User u:list) {
		if(list != null) {
			userBankAcctMap.put(u, u.getBankAcctList());
		}
	}
	return userBankAcctMap;
	
}
public boolean doTransaction(wallet sender , wallet receiver , TransactionType tType,double amount) {
	if(sender.getBalance()>amount) {
		receiver.setBalance(receiver.getBalance()+amount);
		sender.setBalance(sender.getBalance()-amount);
		return true;
	}
	return false;


}
public boolean doTransaction(BankAccount sender , BankAccount receiver , TransactionType tType,double amount) {
	if(sender.getAcctBalance()>amount) {
		receiver.setAcctBalance(receiver.getAcctBalance()+amount);
		sender.setAcctBalance(sender.getAcctBalance()-amount);
		return true;
	}
	return false;


}
public boolean doTransaction(BankAccount sender , wallet receiver , TransactionType tType,double amount) {
	if(sender.getAcctBalance()>amount) {
		receiver.setBalance(receiver.getBalance()+amount);
		sender.setAcctBalance(sender.getAcctBalance()-amount);
		return true;
	}
	return false;


}
public boolean doTransaction(wallet sender , BankAccount receiver , TransactionType tType,double amount) {
	if(sender.getBalance()>amount) {
		receiver.setAcctBalance(receiver.getAcctBalance()+amount);
		sender.setBalance(sender.getBalance()-amount);
		return true;
	}
	return false;

}

}


