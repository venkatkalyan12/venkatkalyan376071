package kalyan.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	private long phoneNum;
	private String gmail;
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	private String dateOfBirth;
	private String communicationAddr;
	private List<BankAccount> bankList = new ArrayList<BankAccount>();
	
	
	public List<BankAccount> getBankList() {
		return bankList;
	}
	public void setBankList(List<BankAccount> bankList) {
		this.bankList = bankList;
	}
	
	private int userId;
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCommunicationAddr() {
		return communicationAddr;
	}
	public void setCommunicationAddr(String communicationAddr) {
		this.communicationAddr = communicationAddr;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId( ) {
		this.userId =  (int) (Math.random()*1000+100);
	}
	public void setUserId(int id ) {
		this.userId =  id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setGmail1(String gmail) {
		 if (isValidGmail(getGmail())) {
	            System.out.println("Valid Gmail address!");
	        } else {
	            System.out.println("Invalid Gmail address.");
	        }
	    }
	  
		public static boolean isValidGmail(String email) {
	        return email.contains("@") && email.endsWith("gmail.com");
		}
	
//	BankAccount[]
	@Override
	public String toString() {
		return this.userId+":"+ this.firstName +":"+ this.lastName + ":"+this.phoneNum+":"+this.gmail+":"+this.dateOfBirth+":"+this.communicationAddr;
	}
	
	
	    }

     

		
	
	
//	public String toFile() {
//		return this.userId+","+ this.firstName +","+ this.lastName + ","+this.phoneNum+","+this.dateOfBirth+","+this.communicationAddr+"\n";
//	}


	