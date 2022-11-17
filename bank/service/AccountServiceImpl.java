package com.ct.bank.service;

import java.util.List;

import com.ct.bank.dao.AccountDao;
import com.ct.bank.dao.AccountDaoImpl;
import com.ct.bank.modal.Account;
import com.ct.bank.modal.Transaction;

public class AccountServiceImpl implements AccountService {
	AccountDao dao = new AccountDaoImpl();

	@Override
	public long createAccount(Account account) {
		long accNo = account.getContactNo() - 200000;
		account.setAccNo(accNo);

		return dao.createAccount(account);
	}

	@Override
	public Account getAccountDetails(Long accountNo) {

		return dao.getAccountDetails(accountNo);
	}

	@Override
	public String withdraw(Long accountNo, int witdrawlAmount) {

		return dao.withdraw(accountNo, witdrawlAmount);
	}

	@Override
	public String deposit(Long accountNo, int depositAmount) {

		return dao.deposit(accountNo, depositAmount);
	}

	@Override
	public String fundtransfer(Long fromAccountNo, Long toAccountNo, int transferAmount) {

		return dao.fundtransfer(fromAccountNo, toAccountNo, transferAmount);
	}

	@Override
	public List<Transaction> printTransactions() {

		return dao.printTransactions();
	}

}