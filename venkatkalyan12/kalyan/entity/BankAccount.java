package kalyan.entity;

import java.util.List;

public class BankAccount {
//	int balance;
//	int previousTranscation;
	private static String acctNumber;
	private String IFSC;
	private static String acctPin;
	private String bankName;
	private AcctType acctType;
	private int userid;
	private static double acctBalance;
	
	public double getAcctBalance() {
		return acctBalance;
	}
	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}
	public static String getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public static String getAcctPin() {
		return acctPin;
	}
	public void setAcctPin(String acctPin) {
		this.acctPin = acctPin;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public AcctType getAcctType() {
		return acctType;
	}
	public void setAcctType(AcctType acctType) {
		this.acctType = acctType;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public static double getBalance() {
		return acctBalance;
		
	}
	public double setBalance(double accBalance) {
		this.acctBalance = acctBalance;
		return acctBalance = getBalance();
	}
//	public List<BankAccount> String getBankList() {
//		
//		return this.acctNumber+":"+this.bankName+":"+this.IFSC+":"+this.acctType+":"+this.acctPin+":"+this.acctBalance;
//	}
	public String printBankAcctDetails() {
		return "["+this.acctNumber+":"+this.bankName+":"+this.IFSC+":"+this.acctType+":"+this.acctPin+":"+this.acctBalance+"]";		
	}
	  public void addBalance(double amount) {
	        acctBalance += amount;
	    }
	  public void deductBalance(double amount) {
	        acctBalance -= amount;
	    }


}