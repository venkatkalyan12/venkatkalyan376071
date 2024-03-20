package kalyan.entity;

import java.util.Date;

import kalyan.RunPaymentsAPP;

public class Transaction {
	
		TransactionType transactionType;
		Double transactionAmount;
	    private Date timestamp;
	    
		public Double getTransactionAmount() {
			return transactionAmount;
		}
		public void setTransactionAmount(Double transactionAmount) {
			this.transactionAmount = transactionAmount;
		}
	    public BankAccount getSourceAcct() {
			return sourceAcct;
		}
		public void setSourceAcct(BankAccount sourceAcct) {
			this.sourceAcct = sourceAcct;
		}
		public BankAccount getDestinationAcct() {
			return destinationAcct;
		}
		public void setDestinationAcct(BankAccount destinationAcct) {
			this.destinationAcct = destinationAcct;
		}
		String transactionDate;
	    long transactionId;
		wallet sourceWallet;
		wallet destinationWallet;
		BankAccount sourceAcct;
		BankAccount destinationAcct;
		int UserId;
		
		
		public int getUserId() {
			return UserId;
		}
		public void setUserId() {
			UserId = RunPaymentsAPP.currUserId;
		}
		public void setUserId(int userId) {
			UserId = userId;
		}
		public TransactionType getTransactionType() {
			return transactionType;
		}
		public void setTransactionType(TransactionType transactionType) {
			this.transactionType = transactionType;
		}
		 
		public Date getTimestamp() {
		return timestamp;
	}
    	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
    	}
		public wallet getSourceWallet() {
			return sourceWallet;
		}
		public void setSourceWallet(wallet sourceWallet) {
			this.sourceWallet = sourceWallet;
		}
		public wallet getDestinationWallet() {
			return destinationWallet;
		}
		public void setDestinationWallet(wallet destinationWallet) {
			this.destinationWallet = destinationWallet;
		}
		
		@Override
		public String toString() {
			return  "Transaction Id : " + this.transactionId + "\n" + "\n Time : "+this.transactionDate +"\n"+ this.transactionType + "\n Amount : " + this.transactionAmount  ;}
		public long getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
		}
	




//	 private int transactionId;
//	    private Date timestamp;
//	    private int userId;
//	    private static double amount;
//	    private TransactionType transactionType;
//	    
//		wallet sourceWallet;
//		wallet destinationWallet;
//		BankAccount sourceAcct;
//		BankAccount destinationAcct;
//	    
//		public wallet getSourceWallet() {
//			return sourceWallet;
//		}
//		public void setSourceWallet(wallet sourceWallet) {
//			this.sourceWallet = sourceWallet;
//		}
//		public wallet getDestinationWallet() {
//			return destinationWallet;
//		}
//		public void setDestinationWallet(wallet destinationWallet) {
//			this.destinationWallet = destinationWallet;
//		}
//		public BankAccount getSourceAcct() {
//			return sourceAcct;
//		}
//		public void setSourceAcct(BankAccount sourceAcct) {
//			this.sourceAcct = sourceAcct;
//		}
//		public BankAccount getDestinationAcct() {
//			return destinationAcct;
//		}
//		public void setDestinationAcct(BankAccount destinationAcct) {
//			this.destinationAcct = destinationAcct;
//		}
//		public int getTransactionId() {
//			return transactionId;
//		}
//		public void setTransactionId(long l) {
//			this.transactionId =(int) (Math.random()*10000000+100);;
//		}
//		public Date getTimestamp() {
//			return timestamp;
//		}
//		public void setTimestamp(Date timestamp) {
//			this.timestamp = timestamp;
//		}
//		public int getUserId() {
//			return userId;
//		}
//		public void setUserId(int userId) {
//			this.userId = userId;
//		}
//		public static double getAmount() {
//			return amount;
//		}
//		public void setAmount(double amount) {
//			this.amount = amount;
//		}
//		public TransactionType getTransactionType() {
//			return transactionType;
//		}
//		public void setTransactionType(TransactionType transactionType) {
//			this.transactionType = transactionType;
//		}
//		
//	
		
//		public String toString() {
//		    return "Transaction{" +
//		            "transactionId=" + transactionId +
//		            ", timestamp=" + timestamp +
//		            ", userId=" + userId +
//		            ", amount=" + amount +
//		            ", transactionType=" + transactionType +
//		            '}';
//		}
}