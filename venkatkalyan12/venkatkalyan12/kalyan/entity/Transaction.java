package kalyan.entity;

import java.util.Date;

public class Transaction {


	 private int transactionId;
	    private Date timestamp;
	    private int userId;
	    private static double amount;
	    private TransactionType transactionType;
	    
		wallet sourceWallet;
		wallet destinationWallet;
		BankAccount sourceAcct;
		BankAccount destinationAcct;
	    
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
		public int getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(long l) {
			this.transactionId =(int) (Math.random()*10000000+100);;
		}
		public Date getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public static double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public TransactionType getTransactionType() {
			return transactionType;
		}
		public void setTransactionType(TransactionType transactionType) {
			this.transactionType = transactionType;
		}
		
	
		
		public String toString() {
		    return "Transaction{" +
		            "transactionId=" + transactionId +
		            ", timestamp=" + timestamp +
		            ", userId=" + userId +
		            ", amount=" + amount +
		            ", transactionType=" + transactionType +
		            '}';
		}
}