package com.ct.bank.dao;

import java.util.List;
import java.util.Set;

import com.ct.bank.modal.Account;
import com.ct.bank.modal.Transaction;

public interface AccountDao {
	public abstract long createAccount(Account account);

	public abstract Account getAccountDetails(Long accountNo);

	public abstract String withdraw(Long accountNo, int witdrawlAmount);

	public abstract String deposit(Long accountNo, int depositAmount);

	public abstract String fundtransfer(Long fromAccountNo, Long toAccountNo, int transferAmount);

	public abstract List<Transaction> printTransactions();
}
