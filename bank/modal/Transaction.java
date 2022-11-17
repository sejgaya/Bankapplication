package com.ct.bank.modal;
import java.time.LocalDateTime;
public class Transaction {
	private int transactionId;
	private long fromAccNo;
	private long toAccNo;
	private String transactionType;
	private LocalDateTime dateOfTransaction;
	private int balance;
	private int updatedBalance;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public long getFromAccNo() {
		return fromAccNo;
	}

	public void setFromAccNo(long fromAccNo) {
		this.fromAccNo = fromAccNo;
	}

	public long getToAccNo() {
		return toAccNo;
	}

	public void setToAccNo(int toAccNo) {
		this.toAccNo = toAccNo;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public LocalDateTime getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(LocalDateTime dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getUpdatedBalance() {
		return updatedBalance;
	}

	public void setUpdatedBalance(int updatedBalance) {
		this.updatedBalance = updatedBalance;
	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(int transactionId, long fromAccNo, long toAccNo, String transactionType,
			LocalDateTime dateOfTransaction, int balance, int updatedBalance) {
		super();
		this.transactionId = transactionId;
		this.fromAccNo = fromAccNo;
		this.toAccNo = toAccNo;
		this.transactionType = transactionType;
		this.dateOfTransaction = dateOfTransaction;
		this.balance = balance;
		this.updatedBalance = updatedBalance;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", fromAccNo=" + fromAccNo + ", toAccNo=" + toAccNo
				+ ", transactionType=" + transactionType + ", dateOfTransaction=" + dateOfTransaction + ", balance="
				+ balance + ", updatedBalance=" + updatedBalance + "]";
	}
}
