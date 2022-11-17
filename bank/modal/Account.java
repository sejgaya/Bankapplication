package com.ct.bank.modal;

public class Account {

	private long accNo;
	private String accHolderName;
	private int age;
	private String branch;
	private int balance;
	private String address;
	private String typeOfAccount;
	private long contactNo;

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", age=" + age + ", branch=" + branch
				+ ", balance=" + balance + ", address=" + address + ", typeOfAccount=" + typeOfAccount + ", contactNo="
				+ contactNo + "]";
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	
	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	public Account() {
		// TODO Auto-generated constructor stub
	}

	
	public Account(long accNo, String accHolderName, int age, String branch, int balance, String address,
			String typeOfAccount, long contactNo) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.age = age;
		this.branch = branch;
		this.balance = balance;
		this.address = address;
		this.typeOfAccount = typeOfAccount;
		this.contactNo = contactNo;
	}

}
